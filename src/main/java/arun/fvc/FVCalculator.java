package arun.fvc;

import java.math.BigDecimal;
import java.util.List;

public interface FVCalculator {

    BigDecimal calculateFutureValueWithContributions(BigDecimal presentValue, int noOfPeriods,
                                                     double rate, BigDecimal contributionAmount
    );

    List<PayOutSchedule> generateProjection(BigDecimal presentValue, int noOfPeriods, double rate,
                                            BigDecimal contributionAmount);
}
