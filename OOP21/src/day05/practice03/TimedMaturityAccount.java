package day05.practice03;

public class TimedMaturityAccount extends SavingsAccount {
	private boolean mature;
	private double feeRate;

	public TimedMaturityAccount(double balance, double interestRate, double feeRate) {
		super(balance, interestRate);
		setFeeRate(feeRate);
	}

	@Override
	public double withdrawFunds(double amount) {
		super.withdrawFunds(amount);
		if (!isMature()) {
			double charge = amount * getFeeRate();
			amount -= charge;
		}
		return amount;
	}

	public void mature() {
		mature = true;
	}

	public double getFeeRate() {
		return feeRate;
	}

	public void setFeeRate(double feeRate) {
		this.feeRate = feeRate;
	}

	public boolean isMature() {
		return mature;
	}

}
