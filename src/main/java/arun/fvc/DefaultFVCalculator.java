package arun.fvc;

import java.math.BigDecimal;
import java.math.RoundingMode;
import java.util.ArrayList;
import java.util.List;

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

    @Override
    public List<PayOutSchedule> generateProjection(BigDecimal presentValue, int noOfPeriods, double rate,
                                                   BigDecimal contributionAmount) {
        List<PayOutSchedule> payOutSchedules = new ArrayList<PayOutSchedule>();
        BigDecimal multiplier = new BigDecimal(1 + rate);

        BigDecimal valueEndingThisPeriod = null;
        BigDecimal cumulativeInterest = BigDecimal.ZERO;
        for (int i = 1; i <= noOfPeriods; i++) {
            BigDecimal interest = presentValue.multiply(new BigDecimal(rate));
            cumulativeInterest = cumulativeInterest.add(interest);
            valueEndingThisPeriod = presentValue.add(contributionAmount).multiply(multiplier).setScale(2, RoundingMode.CEILING);
            PayOutSchedule schedule = new PayOutSchedule(i, interest, cumulativeInterest, contributionAmount, valueEndingThisPeriod);
            presentValue = valueEndingThisPeriod;
            payOutSchedules.add(schedule);
        }
        return payOutSchedules;
    }
}
