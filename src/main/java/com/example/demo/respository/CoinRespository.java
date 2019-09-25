package com.example.demo.respository;

import com.example.demo.entity.Coin;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CoinRespository extends JpaRepository<Coin, Integer> {

}
