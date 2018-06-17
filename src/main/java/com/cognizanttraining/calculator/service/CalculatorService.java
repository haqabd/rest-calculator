package com.cognizanttraining.calculator.service;

import java.math.BigDecimal;

import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.stereotype.Service;

import com.cognizanttraining.calculator.model.Calculation;

@Service
public class CalculatorService {
	
	public Calculation add( BigDecimal op1, BigDecimal op2) {
		if (op1 == null || op2 == null)
			return null ;
		Calculation retVal = new Calculation() ;
		retVal.add(op1, op2) ;
		return retVal ;
	}
	
	public Calculation subtract( BigDecimal op1, BigDecimal op2) {
		if (op1 == null || op2 == null)
			return null ;
		Calculation retVal = new Calculation() ;
		retVal.subtract(op1, op2) ;
		return retVal ;
	}
	
	public Calculation multiply( BigDecimal op1, BigDecimal op2) {
		if (op1 == null || op2 == null)
			return null ;
		Calculation retVal = new Calculation() ;
		retVal.multiply(op1, op2) ;
		return retVal ;
	}
	
	public Calculation divide( BigDecimal op1, BigDecimal op2) {
		if (op1 == null || op2 == null)
			return null ;
		Calculation retVal = new Calculation() ;
		retVal.divide(op1, op2) ;
		return retVal ;
	}
}
