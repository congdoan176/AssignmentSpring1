package com.example.demo.service;

import com.example.demo.entity.Market;
import com.example.demo.respository.MarketRespository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Calendar;
import java.util.List;
@Service
public class MarketService {
    @Autowired
    MarketRespository marketRespository;

    public List<Market> marketList(){
        return (List<Market>) marketRespository.findAll();
    }

    public Market findMarketById(int id){
        Market market = marketRespository.findById(id).orElse(null);
        return market;
    }
    public Market addMarket(Market market){
        market.setCreatedAt(Calendar.getInstance().getTimeInMillis());
        market.setUpdatedAd(Calendar.getInstance().getTimeInMillis());
        return marketRespository.save(market);
    }
    public Market updateMarket(Market market){
        market.setUpdatedAd(Calendar.getInstance().getTimeInMillis());
        return marketRespository.save(market);
    }
}
