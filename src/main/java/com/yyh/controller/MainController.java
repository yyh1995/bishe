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
@RequestMapping("/main")
public class MainController {
    @Autowired
    UserService userService;
    @Autowired
    FundsService fundsService;

    @RequestMapping(value = "/buy.do")
    public String goto_buy(){
        return "buy";
    }

    @RequestMapping(value="/user.do")
    public String goto_user(){
        return "user";
    }



}
