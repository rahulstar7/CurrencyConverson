package com.convrsion.client;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

import com.convrsion.beans.CurrencyConversion;

@FeignClient(name = "currency-exchange")
//@FeignClient(name = "currency-exchange" ,url = "localhost:8899")
public interface CurrencyExchangeClient {
	
	
	@GetMapping(value = "/cuurency-exchange/from/{from}/to/{to}")
	public CurrencyConversion  retriveExchange(@PathVariable String from , @PathVariable String to);
	

}
