package arun.fvc;

import org.junit.Test;

import java.math.BigDecimal;

/**
 * Created by arunc on 6/07/2015.
 */
public class FVCalculatorTest {

    @Test
    public void testCalculate() {
        DefaultFVCalculator fvCalculator = new DefaultFVCalculator();
        fvCalculator.calculateFutureValueWithContributions(new BigDecimal(100000), 30, 0.05, new BigDecimal(10000) );
    }
}