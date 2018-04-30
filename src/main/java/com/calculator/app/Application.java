package com.calculator.app;

import java.math.BigDecimal;

public class Application {
	public CalculatorResponse calculate(CalculatorRequest request) {
		CalculatorResponse response = new CalculatorResponse();
		BigDecimal delta = request.getEstimatedValue().subtract(request.getOutstandingLoan()).setScale(2,
				BigDecimal.ROUND_DOWN);
		response.setEquityAmount(delta.multiply(new BigDecimal(0.85)).setScale(2, BigDecimal.ROUND_HALF_UP));
		return response;
	}
}
