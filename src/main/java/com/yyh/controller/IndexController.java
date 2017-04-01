package com.yyh.controller;

import com.yyh.pojo.Funds;
import com.yyh.pojo.FundsExample;
import com.yyh.service.FundsService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import java.util.List;


/**
 * Created by yyh on 2017/3/17.
 */
@Controller
public class IndexController {
    @Autowired
    FundsService fundsService;


    //return "index"：处理完该请求后返回的页面，此请求返回 名为index.jsp页面
    @RequestMapping(value="/",method= RequestMethod.GET)
    public String index(){
        return "index";
    }


}
