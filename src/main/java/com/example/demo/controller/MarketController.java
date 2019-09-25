package com.example.demo.controller;

import com.example.demo.entity.Market;
import com.example.demo.service.MarketService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping(value = "/market")
public class MarketController {

    @Autowired
    MarketService marketService;

    @RequestMapping(method = RequestMethod.GET)
    public ResponseEntity<List<Market>> findAllMarket(){
        List<Market> marketList = marketService.marketList();
        if (marketList.isEmpty()){
            return new ResponseEntity<>(HttpStatus.NO_CONTENT);
        }
        return new ResponseEntity<>(marketList, HttpStatus.OK);
    }
    @RequestMapping(method = RequestMethod.POST, value = "/addmarket")
    public ResponseEntity<Market> addMarket(@RequestBody Market market){
        marketService.addMarket(market);
        return new ResponseEntity<>(market, HttpStatus.CREATED);
    }
}
