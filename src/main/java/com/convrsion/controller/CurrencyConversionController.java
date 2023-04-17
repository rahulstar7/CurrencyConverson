package com.convrsion.controller;

import java.math.BigDecimal;
import java.util.HashMap;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

import com.convrsion.beans.CurrencyConversion;
import com.convrsion.client.CurrencyExchangeClient;

@RestController
public class CurrencyConversionController {

	@Autowired
	private CurrencyExchangeClient client;

	//Rest Template
	@GetMapping("/currency-conversion/from/{from}/to/{to}/quantity/{quantity}")
	public CurrencyConversion calculateTotalConversion(@PathVariable String from, @PathVariable String to,
			@PathVariable BigDecimal quantity)

	{

		HashMap<String, String> uriVariable = new HashMap<>();

		uriVariable.put("from", from);

		uriVariable.put("to", to);

		ResponseEntity<CurrencyConversion> forEntity = new RestTemplate().getForEntity(
				"http://localhost:8888/cuurency-exchange/from/{from}/to/{to}", CurrencyConversion.class, uriVariable);

		CurrencyConversion conversion = forEntity.getBody();

		CurrencyConversion totalconversion = new CurrencyConversion(

				conversion.getId(), from, to, quantity, conversion.getConversionMultiple(),
				quantity.multiply(conversion.getConversionMultiple()), conversion.getEnv());

		return totalconversion;

	}

	//Feign Client
	@GetMapping("/Currency-Conversion-feign/from/{from}/to/{to}/quantity/{quantity}")
	public CurrencyConversion calculateTotalConversionfeign(@PathVariable String from, @PathVariable String to,
			@PathVariable BigDecimal quantity) {

		CurrencyConversion conversion = client.retriveExchange(from, to);

		CurrencyConversion totalConversion = new CurrencyConversion(conversion.getId(), from, to, quantity,
				conversion.getConversionMultiple(), quantity.multiply(conversion.getConversionMultiple()),

				conversion.getEnv());
		
		
		return totalConversion;

	}

}
