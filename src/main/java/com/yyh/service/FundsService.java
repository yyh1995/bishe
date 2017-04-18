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

    List<Funds> getFunds_stock();

    List<Funds> getFunds_bond();

    List<Funds> getFunds_mix();

    List<Funds> getFunds_currency();

    List<Funds> getFunds_index();




}
