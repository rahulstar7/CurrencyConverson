package com.convrsion.beans;

import java.math.BigDecimal;

public class CurrencyConversion {
	
	private Long id;
	
	private String from;
	
	private String to;
	
	private BigDecimal quantity;
	
	
	private BigDecimal  conversionMultiple;
	
	
	private BigDecimal totalconversionMultiple;
	
	
	private String env;


	public Long getId() {
		return id;
	}


	public void setId(Long id) {
		this.id = id;
	}


	public String getFrom() {
		return from;
	}


	public void setFrom(String from) {
		this.from = from;
	}


	public String getTo() {
		return to;
	}


	public void setTo(String to) {
		this.to = to;
	}


	public BigDecimal getQuantity() {
		return quantity;
	}


	public void setQuantity(BigDecimal quantity) {
		this.quantity = quantity;
	}


	public BigDecimal getConversionMultiple() {
		return conversionMultiple;
	}


	public void setConversionMultiple(BigDecimal conversionMultiple) {
		this.conversionMultiple = conversionMultiple;
	}


	public BigDecimal getTotalconversionMultiple() {
		return totalconversionMultiple;
	}


	public void setTotalconversionMultiple(BigDecimal totalconversionMultiple) {
		this.totalconversionMultiple = totalconversionMultiple;
	}


	public String getEnv() {
		return env;
	}


	public void setEnv(String env) {
		this.env = env;
	}


	public CurrencyConversion(Long id, String from, String to, BigDecimal quantity, BigDecimal conversionMultiple,
			BigDecimal totalconversionMultiple, String env) {
		super();
		this.id = id;
		this.from = from;
		this.to = to;
		this.quantity = quantity;
		this.conversionMultiple = conversionMultiple;
		this.totalconversionMultiple = totalconversionMultiple;
		this.env = env;
	}


	public CurrencyConversion() {
		super();
		// TODO Auto-generated constructor stub
	}


	@Override
	public String toString() {
		return "CurrencyConversion [id=" + id + ", from=" + from + ", to=" + to + ", quantity=" + quantity
				+ ", conversionMultiple=" + conversionMultiple + ", totalconversionMultiple=" + totalconversionMultiple
				+ ", env=" + env + "]";
	}

	
	
	
	
	
	
	

}
