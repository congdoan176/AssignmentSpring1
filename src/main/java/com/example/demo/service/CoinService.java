package com.example.demo.service;

import com.example.demo.entity.Coin;
import com.example.demo.respository.CoinRespository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Calendar;
import java.util.List;
@Service
public class CoinService {

    @Autowired
    CoinRespository coinRespository;

    public List<Coin> listCoin(){
        return (List<Coin>) coinRespository.findAll();
    }

    public  Coin addCoin(Coin coin){
        coin.setCreatedAt(Calendar.getInstance().getTimeInMillis());
        coin.setUpdatedAt(Calendar.getInstance().getTimeInMillis());
        return coinRespository.save(coin);
    }
}
