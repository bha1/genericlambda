package com.amazonaws.lambda.demo;

import com.amazonaws.services.lambda.runtime.Context;
import com.amazonaws.services.lambda.runtime.RequestHandler;
import com.calculator.app.Application;
import com.calculator.app.CalculatorRequest;
import com.calculator.app.CalculatorResponse;

public class LambdaFunctionHandler implements RequestHandler<CalculatorRequest, CalculatorResponse> {

    @Override
    public CalculatorResponse handleRequest(CalculatorRequest request, Context context) {
        context.getLogger().log("request: "+request);
        Application app = new Application();
        CalculatorResponse response = app.calculate(request);
        context.getLogger().log("response: "+response);
        return response;
    }

}
