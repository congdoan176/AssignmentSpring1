package com.example.demo.entity;

import javax.persistence.*;

@Entity
public class Coin {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    private String name;
    private String baseAsset;
    private String quoteAsset;
    private String lastPrice;
    private String volumn24h;
    private int marketId;
    private Long createdAt;
    private Long updatedAt;

    public Coin() {
    }

    public int getId() {
        return id;
    }

    public Coin setId(int id) {
        this.id = id;
        return this;
    }

    public String getName() {
        return name;
    }

    public Coin setName(String name) {
        this.name = name;
        return this;
    }

    public String getBaseAsset() {
        return baseAsset;
    }

    public Coin setBaseAsset(String baseAsset) {
        this.baseAsset = baseAsset;
        return this;
    }

    public String getQuoteAsset() {
        return quoteAsset;
    }

    public Coin setQuoteAsset(String quoteAsset) {
        this.quoteAsset = quoteAsset;
        return this;
    }

    public String getLastPrice() {
        return lastPrice;
    }

    public Coin setLastPrice(String lastPrice) {
        this.lastPrice = lastPrice;
        return this;
    }

    public String getVolumn24h() {
        return volumn24h;
    }

    public Coin setVolumn24h(String volumn24h) {
        this.volumn24h = volumn24h;
        return this;
    }

    public int getMarketId() {
        return marketId;
    }

    public Coin setMarketId(int marketId) {
        this.marketId = marketId;
        return this;
    }

    public Long getCreatedAt() {
        return createdAt;
    }

    public Coin setCreatedAt(Long createdAt) {
        this.createdAt = createdAt;
        return this;
    }

    public Long getUpdatedAt() {
        return updatedAt;
    }

    public Coin setUpdatedAt(Long updatedAt) {
        this.updatedAt = updatedAt;
        return this;
    }
}
