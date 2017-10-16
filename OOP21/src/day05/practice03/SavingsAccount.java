package day05.practice03;

public class SavingsAccount extends BankAccount {
	private double interestRate;

	public SavingsAccount(double balance, double interestRate) {
		super(balance);
		setInterestRate(interestRate);
	}

	public void addInterest() {
		double balance = getBalance();
		double rate = getInterestRate();
		double interest = balance * rate;

		double newBalance = balance + interest;

		setBalance(newBalance);
	}

	public double getInterestRate() {
		return interestRate;
	}

	public void setInterestRate(double interestRate) {
		this.interestRate = interestRate;
	}

}
