package com.example.demo.controller;

import com.example.demo.entity.Coin;
import com.example.demo.service.CoinService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import javax.swing.*;
import java.util.List;

@RestController
@RequestMapping(value = "/coin")
public class CoinController {

    @Autowired
    CoinService coinService;

    @RequestMapping(method = RequestMethod.GET)
    public ResponseEntity<List<Coin>>findAllCoin(){
        List<Coin> coins = coinService.listCoin();
        return new ResponseEntity<>(coins, HttpStatus.OK);
    }
    @RequestMapping(method = RequestMethod.POST, value = "/addcoin")
    public ResponseEntity<Coin> addCoin(@RequestBody Coin coin){
        coinService.addCoin(coin);
        return new ResponseEntity<>(coin, HttpStatus.CREATED);
    }
}
