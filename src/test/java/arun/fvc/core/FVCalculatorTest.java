package arun.fvc.core;

import org.junit.Assert;
import org.junit.Test;

import java.math.BigDecimal;

/**
 * Created by arunc on 6/07/2015.
 */
public class FVCalculatorTest {

    @Test
    public void testCalculate() {
        FVCalculator fvCalculator = new FVCalculator() {
            @Override
            public BigDecimal calculate() {
                return BigDecimal.TEN;
            }
        };
        Assert.assertEquals(new BigDecimal(10), fvCalculator.calculate());
    }
}