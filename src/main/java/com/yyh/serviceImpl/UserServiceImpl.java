package com.yyh.serviceImpl;

import com.yyh.async.MailTask;
import com.yyh.dao.UserMapper;
import com.yyh.pojo.User;
import com.yyh.service.UserService;
import com.yyh.util.MyConstant;
import com.yyh.util.MyUtil;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.core.task.TaskExecutor;
import org.springframework.mail.javamail.JavaMailSender;
import org.springframework.stereotype.Service;

import java.util.Date;
import java.util.HashMap;
import java.util.Map;
import java.util.Random;
import java.util.regex.Matcher;
import java.util.regex.Pattern;


/**
 * Created by yyh on 2017/3/31.
 */
@Service
public class UserServiceImpl implements UserService {
    @Autowired
    private UserMapper userMapper;
    @Autowired
    private JavaMailSender javaMailSender;
    @Autowired
    private TaskExecutor taskExecutor;



    //登陆
    public Map<String, Object> login(User user) {

        Map<String, Object> map = new HashMap<String, Object>();
        Integer id = userMapper.selectIdByEmailAndPassword(user);
        if (id == null) {
            map.put("status", "no");
            map.put("error", "用户名或密码错误~");
            return map;
        }

       Integer checkActived = userMapper.selectActived(user);
       if (checkActived == null || checkActived == 0) {
            map.put("status", "no");
            map.put("error", "您还没有激活账户哦，请前往邮箱激活~");
            return map;
        }

        String headUrl = userMapper.selectHeadUrl(id);

        map.put("status", "yes");
        map.put("id", id);
        map.put("headUrl", headUrl);
        return map;
        }

    //注册
    public String register(User user,String upassword) {

       /* //校验邮箱格式
        Pattern p = Pattern.compile("^([a-zA-Z0-9_-])+@([a-zA-Z0-9_-])+((\\.[a-zA-Z0-9_-]{2,3}){1,2})$");
        Matcher m = p.matcher(user.getUemail());
        if(!m.matches()){
            return "邮箱格式有问题啊~";
        }

        //校验密码长度
        p = Pattern.compile("^\\w{6,20}$");
        m = p.matcher(user.getUpassword());
        if(!m.matches()){
            return "密码长度要在6到20之间~";
        }

        //检查密码
        if(!user.getUpassword().equals(upassword)){
            return "两次密码输入不一致~";
        }

        //检查邮箱是否被注册
        int emailCount = userMapper.selectEmailCount(user.getUemail());
        if(emailCount>0){
            return "该邮箱已被注册~";
        }*/

        //构造user，设置未激活
        user.setUactived(0);
        String activateCode = MyUtil.createActivateCode();
        user.setUactiveCode(activateCode);
        user.setUjoin_time(MyUtil.formatDate(new Date()));
        user.setHeadUrl(MyConstant.QINIU_IMAGE_URL +"head.jpg");
        //发送邮件
        taskExecutor.execute(new MailTask(activateCode,user.getUemail(),javaMailSender,1));
        //向数据库插入记录
        userMapper.insertUser(user);
        return "ok";


    }


}
