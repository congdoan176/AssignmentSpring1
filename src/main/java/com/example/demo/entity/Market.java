package com.example.demo.entity;

import javax.persistence.*;
import java.util.List;

@Entity
public class Market {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    private String name;
    private String description;
    private Long createdAt;
    private Long updatedAd;
    private int status;

    public Market() {
    }

    public int getId() {
        return id;
    }

    public Market setId(int id) {
        this.id = id;
        return this;
    }

    public String getName() {
        return name;
    }

    public Market setName(String name) {
        this.name = name;
        return this;
    }

    public String getDescription() {
        return description;
    }

    public Market setDescription(String description) {
        this.description = description;
        return this;
    }

    public Long getCreatedAt() {
        return createdAt;
    }

    public Market setCreatedAt(Long createdAt) {
        this.createdAt = createdAt;
        return this;
    }

    public Long getUpdatedAd() {
        return updatedAd;
    }

    public Market setUpdatedAd(Long updatedAd) {
        this.updatedAd = updatedAd;
        return this;
    }

    public int getStatus() {
        return status;
    }

    public Market setStatus(int status) {
        this.status = status;
        return this;
    }
}
