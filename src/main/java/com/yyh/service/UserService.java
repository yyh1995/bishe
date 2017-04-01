package com.yyh.service;

import com.yyh.pojo.User;
import com.yyh.pojo.UserExample;
import org.springframework.stereotype.Service;


import java.util.Map;

/**
 * Created by yyh on 2017/3/31.
 */
@Service
public interface UserService {
    //登录
     Map<String, Object> login(User user) ;

    //注册
    String register(User user,String upassword);
}

