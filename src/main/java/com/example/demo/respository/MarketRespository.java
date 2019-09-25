package com.example.demo.respository;

import com.example.demo.entity.Market;
import org.springframework.data.jpa.repository.JpaRepository;

public interface MarketRespository extends JpaRepository<Market, Integer> {
}
