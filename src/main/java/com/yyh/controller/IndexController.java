package com.yyh.controller;

import com.yyh.pojo.Funds;
import com.yyh.pojo.FundsExample;
import com.yyh.pojo.User;
import com.yyh.service.FundsService;
import com.yyh.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpRequest;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import javax.servlet.http.HttpSession;
import java.util.List;
import java.util.Map;


/**
 * Created by yyh on 2017/3/17.
 */
@Controller
public class IndexController {
    @Autowired
    FundsService fundsService;
    @Autowired
    UserService userService;


    //首页
    // return "index"：处理完该请求后返回的页面，此请求返回 名为index.jsp页面
    @RequestMapping(value="/",method= RequestMethod.GET)
    public String index(){
        return "index";
    }

    //登陆
    @RequestMapping(value = "/main",method = RequestMethod.POST)
    public String login(User user, Model model, HttpSession session){
        //按基金类型获取funds表中所有数据
        List<Funds> fundsList1=fundsService.getFunds_stock();
        List<Funds> fundsList2=fundsService.getFunds_bond();
        List<Funds> fundsList3=fundsService.getFunds_mix();
        List<Funds> fundsList4=fundsService.getFunds_currency();
        List<Funds> fundsList5=fundsService.getFunds_index();
        model.addAttribute("fundsList1",fundsList1);
        model.addAttribute("fundsList2",fundsList2);
        model.addAttribute("fundsList3",fundsList3);

        //登陆功能
        Map<String,Object> map = userService.login(user);
        if(map.get("status").equals("yes")){
            session.setAttribute("id",map.get("id"));
            session.setAttribute("headUrl",map.get("headUrl"));
            return "main";
        }else {
            model.addAttribute("email",user.getEmail());
            model.addAttribute("error",map.get("error"));
            return "index";
        }
    }


    //转向注册页面（WEB-INF下的资源不能直接访问，jsp资源通过controller间接访问）
    @RequestMapping(value = "/goto_register.do")
    public String goto_register(){
        return "register";
    }


    //注册
    @RequestMapping(value = "/register.do",method = RequestMethod.POST)
    public String register(User user, String comfirm_password){
      /*  String result = userService.register(user,upassword);
        if(result.equals("ok")){
            model.addAttribute("info","系统已经向你的邮箱发送了一封邮件哦，验证后就可以登录啦~");
            return "prompt/promptInfo";
        }else {
            model.addAttribute("register","yes");
            model.addAttribute("email",user.getUemail());
            model.addAttribute("error",result);
            return "register";
        }*/

        String result=userService.register(user,comfirm_password);
        if(result.equals("ok")){
            return "user";
        }else{
            return "register";
        }


    }


}
