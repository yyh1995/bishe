package com.yyh.dao;

import com.yyh.pojo.Funds;
import com.yyh.pojo.FundsExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface FundsMapper {
    int countByExample(FundsExample example);

    int deleteByExample(FundsExample example);

    int deleteByPrimaryKey(Integer id);

    int insert(Funds record);

    int insertSelective(Funds record);

    List<Funds> selectByExample(FundsExample example);

    Funds selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") Funds record, @Param("example") FundsExample example);

    int updateByExample(@Param("record") Funds record, @Param("example") FundsExample example);

    int updateByPrimaryKeySelective(Funds record);

    int updateByPrimaryKey(Funds record);



    //获取funds表中所有数据
    List<Funds> getAllFunds();
}