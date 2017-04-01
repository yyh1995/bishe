package com.yyh.serviceImpl;

import com.yyh.dao.FundsMapper;
import com.yyh.pojo.Funds;
import com.yyh.pojo.FundsExample;
import com.yyh.service.FundsService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.xml.ws.soap.Addressing;
import java.util.List;

/**
 * Created by yyh on 2017/3/27.
 */
@Service
public class FundsServiceImpl implements FundsService {
    @Autowired
    private FundsMapper fundsMapper;


    public List<Funds> getAllFunds(){return fundsMapper.getAllFunds();}
}
