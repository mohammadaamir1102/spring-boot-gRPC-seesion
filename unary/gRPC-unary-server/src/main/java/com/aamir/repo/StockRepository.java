package com.aamir.repo;

import com.aamir.entity.Stock;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface StockRepository extends JpaRepository<Stock, Long> {
    // This method will be used to find a stock by its stock symbol
    Stock findByStockSymbol(String stockSymbol);
}
