package day05.practice03;

public class CheckingAccount extends BankAccount {
	private int monthlyQuota;
	private int transactionCount;
	private double fee;

	public CheckingAccount(double balance, int monthlyQuota, double fee) {
		super(balance);
		setMonthlyQuota(monthlyQuota);
		setFee(fee);
	}

	@Override
	public double withdrawFunds(double amount) {
		transactionCount++;
		return super.withdrawFunds(amount);
	}

	public void accessFees() {
		int extra = getTransactionCount() - getMonthlyQuota();
		if (extra > 0) {
			double totalFee = extra * getFee();
			double balance = getBalance() - totalFee;
			setBalance(balance);
		}
		transactionCount = 0;
	}

	public int getMonthlyQuota() {
		return monthlyQuota;
	}

	public void setMonthlyQuota(int monthlyQuota) {
		this.monthlyQuota = monthlyQuota;
	}

	public double getFee() {
		return fee;
	}

	public void setFee(double fee) {
		this.fee = fee;
	}

	public int getTransactionCount() {
		return transactionCount;
	}

}
