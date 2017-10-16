package day05.practice03;

public class OverdraftAccount extends BankAccount {
	private double creditRate;

	public OverdraftAccount(double balance, double creditRate) {
		super(balance);
		setCreditRate(creditRate);
	}

	public void chargeInterest() {
		double balance = getBalance();
		if (balance < 0) {
			double charge = balance * getCreditRate();
			setBalance(balance + charge);
		}
	}

	@Override
	public double withdrawFunds(double amount) {
		setBalance(getBalance() - amount);
		return amount;
	}

	public double getCreditRate() {
		return creditRate;
	}

	public void setCreditRate(double creditRate) {
		this.creditRate = creditRate;
	}

}
