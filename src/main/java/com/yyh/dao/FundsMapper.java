package com.yyh.dao;

import com.yyh.pojo.Funds;
import com.yyh.pojo.FundsExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface FundsMapper {
    //按条件计数
    int countByExample(FundsExample example);
    //
    int deleteByExample(FundsExample example);
    //按主键删除
    int deleteByPrimaryKey(Integer id);

    int insert(Funds record);

    int insertSelective(Funds record);

    List<Funds> selectByExample(FundsExample example);

    Funds selectByPrimaryKey(Integer id);
    //按条件更新值不为null的字段
    int updateByExampleSelective(@Param("record") Funds record, @Param("example") FundsExample example);
    //按条件更新
    int updateByExample(@Param("record") Funds record, @Param("example") FundsExample example);
    //按主键更新值不为null的字段
    int updateByPrimaryKeySelective(Funds record);
    //按主键更新
    int updateByPrimaryKey(Funds record);


}