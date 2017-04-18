package com.yyh.dao;

import com.yyh.pojo.Funds;
import com.yyh.pojo.FundsExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Component;

@Component
public interface FundsMapper {

    //获取funds表中所有数据
    List<Funds> getAllFunds();

    //按基金类型获取funds表中数据
    List<Funds> getFunds_stock();
    List<Funds> getFunds_bond();
    List<Funds> getFunds_mix();
    List<Funds> getFunds_currency();
    List<Funds> getFunds_index();


}