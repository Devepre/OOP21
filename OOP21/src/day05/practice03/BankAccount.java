package day05.practice03;

public class BankAccount {
	private double balance;

	public BankAccount(double balance) {
		super();
		this.balance = balance;
	}

	public void depostiFunds(double amount) {
		setBalance(getBalance() + amount);
	}

	public double withdrawFunds(double amount) {
		if (amount >= balance) {
			amount = balance;
		}

		setBalance(getBalance() - amount);

		return amount;
	}

	public double getBalance() {
		return balance;
	}

	public void setBalance(double balance) {
		this.balance = balance;
	}

	@Override
	public String toString() {
		return this.getClass().getSimpleName() + " [balance=" + balance + "]";
	}

}
