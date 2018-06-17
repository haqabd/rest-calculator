package com.cognizanttraining.calculator.model;

import java.math.BigDecimal;

public class Calculation {
	private BigDecimal op1 ;
	private BigDecimal op2 ;
	private BigDecimal result ;
	private String operation ;
	
	public void add( BigDecimal op1, BigDecimal op2) {
		this.op1 = op1 ;
		this.op2 = op2 ;
		operation = "ADDITION" ;
		result = op1.add(op2) ;
	}
	
	public void subtract( BigDecimal op1, BigDecimal op2) {
		this.op1 = op1 ;
		this.op2 = op2 ;
		operation = "SUBTRACTION" ;
		result = op1.subtract(op2) ;
	}
	
	public void multiply( BigDecimal op1, BigDecimal op2) {
		this.op1 = op1 ;
		this.op2 = op2 ;
		operation = "MULTIPLICATION" ;
		result = op1.multiply(op2) ;
	}
	
	public void divide( BigDecimal op1, BigDecimal op2) {
		this.op1 = op1 ;
		this.op2 = op2 ;
		operation = "DIVISION" ;
		result = op1.divide(op2) ;
	}

	public BigDecimal getOp1() {
		return op1;
	}

	public void setOp1(BigDecimal op1) {
		this.op1 = op1;
	}

	public BigDecimal getOp2() {
		return op2;
	}

	public void setOp2(BigDecimal op2) {
		this.op2 = op2;
	}

	public BigDecimal getResult() {
		return result;
	}

	public void setResult(BigDecimal result) {
		this.result = result;
	}

	public String getOperation() {
		return operation;
	}

	public void setOperation(String operation) {
		this.operation = operation;
	}
	
}
