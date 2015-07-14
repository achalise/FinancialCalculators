package arun.fvc;

import java.math.BigDecimal;

public interface FVCalculator {

    BigDecimal calculateFutureValueWithContributions(BigDecimal presentValue, int noOfPeriods,
                                                     double rate, BigDecimal contributionAmount
    );
}
