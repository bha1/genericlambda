package com.amazonaws.lambda.demo;

import java.io.IOException;
import java.math.BigDecimal;
import java.math.RoundingMode;

import org.junit.Assert;
import org.junit.BeforeClass;
import org.junit.Test;

import com.amazonaws.services.lambda.runtime.Context;
import com.calculator.app.CalculatorRequest;
import com.calculator.app.CalculatorResponse;

/**
 * A simple test harness for locally invoking your Lambda function handler.
 */
public class LambdaFunctionHandlerTest {

    private static CalculatorRequest input;

    @BeforeClass
    public static void createInput() throws IOException {
        // TODO: set up your sample input object here.
        input = new CalculatorRequest();
        input.setEstimatedValue(new BigDecimal(100000));
        input.setOutstandingLoan(new BigDecimal(50000));
        input.setRequestId("123123");
    }

    private Context createContext() {
        TestContext ctx = new TestContext();

        // TODO: customize your context here if needed.
        ctx.setFunctionName("Your Function Name");

        return ctx;
    }

    @Test
    public void testLambdaFunctionHandler() {
        LambdaFunctionHandler handler = new LambdaFunctionHandler();
        Context ctx = createContext();

        CalculatorResponse output = handler.handleRequest(input, ctx);

        // TODO: validate output here if needed.
        Assert.assertEquals(new BigDecimal(42500).setScale(2, RoundingMode.HALF_UP), output.getEquityAmount());
    }
}
