package com.yyh.serviceImpl;

import com.yyh.dao.FundsMapper;
import com.yyh.pojo.Funds;
import com.yyh.pojo.FundsExample;
import com.yyh.service.FundsService;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * Created by yyh on 2017/3/27.
 */
@Service
public class FundsServiceImpl implements FundsService {

    private FundsMapper fundsMapper;

    public Funds getFundsById(int id) {
        return fundsMapper.selectByPrimaryKey(id);
    }

    public List<Funds> getFunds(FundsExample fundsExample) {
        return fundsMapper.selectByExample(fundsExample);
    }

    public List<Funds> getAllFunds(){return fundsMapper.getAllFunds();}
}
