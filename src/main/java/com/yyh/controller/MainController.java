package com.yyh.controller;

import com.yyh.pojo.Funds;
import com.yyh.pojo.User;
import com.yyh.service.FundsService;
import com.yyh.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import javax.servlet.http.HttpSession;
import java.util.List;
import java.util.Map;

/**
 * Created by yyh on 2017/3/31.
 */
@Controller
public class MainController {
    @Autowired
    UserService userService;
    @Autowired
    FundsService fundsService;

    /**
     * 登录/获取funds表中数据
     * @param user
     * @param model
     * @param session
     * @return
     */
    @RequestMapping(value = "/login.do",method = RequestMethod.POST)
    public String login(User user, Model model, HttpSession session){
        //获取funds表中所有数据
        List<Funds> fundsList=fundsService.getAllFunds();
        model.addAttribute("fundsList",fundsList);

        //登陆功能
        Map<String,Object> map = userService.login(user);
        if(map.get("status").equals("yes")){
            session.setAttribute("id",map.get("id"));
            session.setAttribute("headUrl",map.get("headUrl"));
            return "redirect:toMyProfile.do";
        }else {
            model.addAttribute("email",user.getUemail());
            model.addAttribute("error",map.get("error"));
            return "main";
        }
    }


    /**
     * 注册
     * @param user
     * @param upassword
     * @param model
     * @return
     */
    @RequestMapping(value = "/register.do",method = RequestMethod.POST)
    public String register(User user, String upassword,Model model){
        String result = userService.register(user,upassword);
        if(result.equals("ok")){
            model.addAttribute("info","系统已经向你的邮箱发送了一封邮件哦，验证后就可以登录啦~");
            return "prompt/promptInfo";
        }else {
            model.addAttribute("register","yes");
            model.addAttribute("email",user.getUemail());
            model.addAttribute("error",result);
            return "login";
        }
    }
}
