package arun.fvc;

import org.junit.Test;

import java.math.BigDecimal;
import java.util.List;

/**
 * Created by arunc on 6/07/2015.
 */
public class FVCalculatorTest {

    @Test
    public void testCalculate() {
        DefaultFVCalculator fvCalculator = new DefaultFVCalculator();
        List<PayOutSchedule> payOutSchedules = fvCalculator.generateProjection(new BigDecimal(100000), 30, 0.05, new BigDecimal(10000));
        for(PayOutSchedule schedule : payOutSchedules) {
            System.out.println(schedule);
        }
    }
}