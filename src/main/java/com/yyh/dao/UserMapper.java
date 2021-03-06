package com.yyh.dao;

import com.yyh.pojo.User;
import com.yyh.pojo.UserExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Component;

@Component
public interface UserMapper {

    Integer selectIdByEmailAndPassword(User user);

    String selectHeadUrl(int uid);

    Integer selectActived(User user);

    Integer selectEmailCount(String email);

    void insertUser(User user);



}