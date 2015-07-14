package arun.fvc;

import java.math.BigDecimal;
import java.math.RoundingMode;

/**
 * Created by arunc on 6/07/2015.
 */
public class DefaultFVCalculator implements FVCalculator {

    @Override
    public BigDecimal calculateFutureValueWithContributions(BigDecimal presentValue, int noOfPeriods,
                                                            double rate, BigDecimal contributionAmount
                                                            ) {
        BigDecimal multiplier = new BigDecimal(1 + rate);

        BigDecimal futureValue = null;
        for (int i = 0; i < noOfPeriods; i++) {
            futureValue = presentValue.multiply(multiplier).add(contributionAmount.multiply(multiplier)).setScale(2, RoundingMode.CEILING);
            System.out.println("At period " + i + " FV: " + futureValue.toPlainString());
            presentValue = futureValue;

        }
        return futureValue;
    }
}
