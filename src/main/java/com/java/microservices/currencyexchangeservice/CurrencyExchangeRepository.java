package com.java.microservices.currencyexchangeservice;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;


public interface CurrencyExchangeRepository extends JpaRepository<CurrencyExchange, Long> {

    CurrencyExchange findByFromAndTo(String from, String to);
}
