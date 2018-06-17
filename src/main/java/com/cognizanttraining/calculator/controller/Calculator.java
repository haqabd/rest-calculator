package com.cognizanttraining.calculator.controller;

import java.math.BigDecimal;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.stereotype.Component;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.cognizanttraining.calculator.model.Calculation;
import com.cognizanttraining.calculator.service.CalculatorService;

@RestController
@RequestMapping("/calculate")
public class Calculator {
	@Autowired
	private CalculatorService service ;
	
	@RequestMapping("/add/{op1}/{op2}")
	public Calculation add(@PathVariable(value="op1") BigDecimal op1, @PathVariable(value="op2") BigDecimal op2) {
		return service.add(op1, op2) ;
	}
	
	@RequestMapping("/subtract/{op1}/{op2}")
	public Calculation subtract(@PathVariable(value="op1") BigDecimal op1, @PathVariable(value="op2") BigDecimal op2) {
		return service.subtract(op1, op2) ;
	}
	
	@RequestMapping("/multiply/{op1}/{op2}")
	public Calculation multiply(@PathVariable(value="op1") BigDecimal op1, @PathVariable(value="op2") BigDecimal op2) {
		return service.multiply(op1, op2) ;
	}
	
	@RequestMapping("/divide/{op1}/{op2}")
	public Calculation divide(@PathVariable(value="op1") BigDecimal op1, @PathVariable(value="op2") BigDecimal op2) {
		return service.divide(op1, op2) ;
	}
	
	@RequestMapping("/")
	public String error() {
		return "<font face=Impact color=purple size=+3> Simple REST Calculation Service </font><br>"
				+ "<div indent=10><font face=lucida color=purple>/add/{op1}/{op2}<br>"
				+ "/subtract/{op1}/{op2}<br>"
				+ "/multiply/{op1}/{op2}<br>"
				+ "/divide/{op1}/{op2}<br></font></div>" ;
	}
}
