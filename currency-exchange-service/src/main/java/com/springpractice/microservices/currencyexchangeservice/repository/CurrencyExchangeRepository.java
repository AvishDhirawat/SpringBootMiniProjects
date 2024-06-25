package com.springpractice.microservices.currencyexchangeservice.repository;

import com.springpractice.microservices.currencyexchangeservice.currencyexchange.CurrencyExchange;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CurrencyExchangeRepository extends JpaRepository<CurrencyExchange, Long> {
    CurrencyExchange findByFromAndTo(String from, String to);
}
