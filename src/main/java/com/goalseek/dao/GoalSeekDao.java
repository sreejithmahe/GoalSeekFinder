package com.goalseek.dao;
/**
 * @author sreejith.kizhakkayil
 *
 */
public class GoalSeekDao {
	
	private double operningBalance;
	private double depreciation;
	private double closingBalance;
	private double interestRate;
	private double margin;
	private double tlp;
	private double leaseFee;
	private double interestInPeriod;
	private double marginInPeriod;
	private double tlpInPeriod;
	private double totalRateInPeriod;
	private double totMarginTlp;
	private double expectedClosingBalance;
	private double totalNoPeriod;
	private double indexPeriod;
	public GoalSeekDao() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	public GoalSeekDao(double operningBalance, double depreciation, double closingBalance, double interestRate,
			double margin, double tlp, double leaseFee, double interestInPeriod, double marginInPeriod,
			double tlpInPeriod, double totalRateInPeriod, double totMarginTlp, double expectedClosingBalance,
			double totalNoPeriod, double indexPeriod) {
		super();
		this.operningBalance = operningBalance;
		this.depreciation = depreciation;
		this.closingBalance = closingBalance;
		this.interestRate = interestRate;
		this.margin = margin;
		this.tlp = tlp;
		this.leaseFee = leaseFee;
		this.interestInPeriod = interestInPeriod;
		this.marginInPeriod = marginInPeriod;
		this.tlpInPeriod = tlpInPeriod;
		this.totalRateInPeriod = totalRateInPeriod;
		this.totMarginTlp = totMarginTlp;
		this.expectedClosingBalance = expectedClosingBalance;
		this.totalNoPeriod = totalNoPeriod;
		this.indexPeriod = indexPeriod;
	}

	public double getOperningBalance() {
		return operningBalance;
	}
	public void setOperningBalance(double operningBalance) {
		this.operningBalance = operningBalance;
	}
	public double getDepreciation() {
		return depreciation;
	}
	public void setDepreciation(double depreciation) {
		this.depreciation = depreciation;
	}
	public double getClosingBalance() {
		return closingBalance;
	}
	public void setClosingBalance(double closingBalance) {
		this.closingBalance = closingBalance;
	}
	public double getInterestRate() {
		return interestRate;
	}
	public void setInterestRate(double interestRate) {
		this.interestRate = interestRate;
	}
	public double getMargin() {
		return margin;
	}
	public void setMargin(double margin) {
		this.margin = margin;
	}
	public double getTlp() {
		return tlp;
	}
	public void setTlp(double tlp) {
		this.tlp = tlp;
	}
	public double getLeaseFee() {
		return leaseFee;
	}
	public void setLeaseFee(double leaseFee) {
		this.leaseFee = leaseFee;
	}
	public double getInterestInPeriod() {
		return interestInPeriod;
	}
	public void setInterestInPeriod(double interestInPeriod) {
		this.interestInPeriod = interestInPeriod;
	}
	public double getMarginInPeriod() {
		return marginInPeriod;
	}
	public void setMarginInPeriod(double marginInPeriod) {
		this.marginInPeriod = marginInPeriod;
	}
	public double getTlpInPeriod() {
		return tlpInPeriod;
	}
	public void setTlpInPeriod(double tlpInPeriod) {
		this.tlpInPeriod = tlpInPeriod;
	}
	public double getTotalRateInPeriod() {
		return totalRateInPeriod;
	}
	public void setTotalRateInPeriod(double totalRateInPeriod) {
		this.totalRateInPeriod = totalRateInPeriod;
	}
	public double getTotMarginTlp() {
		return totMarginTlp;
	}
	public void setTotMarginTlp(double totMarginTlp) {
		this.totMarginTlp = totMarginTlp;
	}
	public double getExpectedClosingBalance() {
		return expectedClosingBalance;
	}
	public void setExpectedClosingBalance(double expectedClosingBalance) {
		this.expectedClosingBalance = expectedClosingBalance;
	}
	public double getTotalNoPeriod() {
		return totalNoPeriod;
	}
	public void setTotalNoPeriod(double totalNoPeriod) {
		this.totalNoPeriod = totalNoPeriod;
	}
	public double getIndexPeriod() {
		return indexPeriod;
	}
	public void setIndexPeriod(double indexPeriod) {
		this.indexPeriod = indexPeriod;
	}
}
