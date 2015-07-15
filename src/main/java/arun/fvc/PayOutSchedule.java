package arun.fvc;

import java.math.BigDecimal;

/**
 * Created by arunc on 15/07/2015.
 */
public class PayOutSchedule {
    private int scheduleNo;
    private BigDecimal interest;
    private BigDecimal cumulativeInterest;
    private BigDecimal contribution;
    private BigDecimal balance;

    public PayOutSchedule(int scheduleNo, BigDecimal interest, BigDecimal cumulativeInterest, BigDecimal contribution, BigDecimal balance) {
        this.scheduleNo = scheduleNo;
        this.interest = interest;
        this.cumulativeInterest = cumulativeInterest;
        this.balance = balance;
        this.contribution = contribution;
    }

    public BigDecimal getInterest() {
        return interest;
    }

    public void setInterest(BigDecimal interest) {
        this.interest = interest;
    }

    public int getScheduleNo() {
        return scheduleNo;
    }

    public void setScheduleNo(int scheduleNo) {
        this.scheduleNo = scheduleNo;
    }

    public BigDecimal getCumulativeInterest() {
        return cumulativeInterest;
    }

    public void setCumulativeInterest(BigDecimal cumulativeInterest) {
        this.cumulativeInterest = cumulativeInterest;
    }

    public BigDecimal getBalance() {
        return balance;
    }

    public void setBalance(BigDecimal balance) {
        this.balance = balance;
    }
    public BigDecimal getContribution() {
        return contribution;
    }

    public void setContribution(BigDecimal contribution) {
        this.contribution = contribution;
    }

    @Override
    public String toString() {
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append("Schedule No: ").append(scheduleNo)
                .append("\t Balance: ").append(toDecimalStringTwoPlaces(balance))
                .append("\t Contribution: ").append(toDecimalStringTwoPlaces(contribution))
                .append("\t Interest: ").append(toDecimalStringTwoPlaces(interest))
                .append("\t Cumulative Interest: ").append(toDecimalStringTwoPlaces(cumulativeInterest));
        return stringBuilder.toString();
    }

    private String toDecimalStringTwoPlaces(BigDecimal value) {
        return value.setScale(2, BigDecimal.ROUND_CEILING).toPlainString();
    }
}
