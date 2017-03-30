package com.yyh.service;

import com.yyh.pojo.Funds;
import com.yyh.pojo.FundsExample;
import org.springframework.stereotype.Service;


import java.util.List;

/**
 * Created by yyh on 2017/3/27.
 */
@Service
public interface FundsService {
    Funds getFundsById(int id);

    List<Funds> getFunds(FundsExample fundsExample);

    List<Funds> getAllFunds();


}
