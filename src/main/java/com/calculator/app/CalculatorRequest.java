package com.calculator.app;

import java.math.BigDecimal;

public class CalculatorRequest {
	private BigDecimal estimatedValue;
	private BigDecimal outstandingLoan;
	private String requestId;

	public BigDecimal getEstimatedValue() {
		return estimatedValue;
	}

	public void setEstimatedValue(BigDecimal estimatedValue) {
		this.estimatedValue = estimatedValue;
	}

	public BigDecimal getOutstandingLoan() {
		return outstandingLoan;
	}

	public void setOutstandingLoan(BigDecimal outstandingLoan) {
		this.outstandingLoan = outstandingLoan;
	}

	public String getRequestId() {
		return requestId;
	}

	public void setRequestId(String requestId) {
		this.requestId = requestId;
	}

}
