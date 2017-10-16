package day05.practice03;

public class MainBank {

	public static void main(String[] args) {
		BankAccount simpleAccount = new BankAccount(1000);
		System.out.println(simpleAccount);

		SavingsAccount savingsAccount = new SavingsAccount(1000, 0.2);
		savingsAccount.addInterest();
		savingsAccount.depostiFunds(100);
		System.out.println(savingsAccount);
		
		TimedMaturityAccount timedMaturityAccount = new TimedMaturityAccount(1000, 0.3, 0.2);				
		System.out.println(timedMaturityAccount);
		timedMaturityAccount.addInterest();		
		System.out.println(timedMaturityAccount);		
		System.out.println(timedMaturityAccount.withdrawFunds(200));
		timedMaturityAccount.mature();
		System.out.println(timedMaturityAccount.withdrawFunds(300));
				
		CheckingAccount checkingAccount = new CheckingAccount(1000, 2, 0.4);
		System.out.println(checkingAccount);
		System.out.println(checkingAccount.withdrawFunds(200));
		System.out.println(checkingAccount);
		System.out.println(checkingAccount.withdrawFunds(100));
		System.out.println(checkingAccount);
		System.out.println(checkingAccount.withdrawFunds(100));
		checkingAccount.accessFees();
		System.out.println(checkingAccount);		
		System.out.println(checkingAccount.withdrawFunds(100));
		System.out.println(checkingAccount);
		
		OverdraftAccount overdraftAccount = new OverdraftAccount(1000, 0.4);		
		System.out.println(overdraftAccount);
		System.out.println(overdraftAccount.withdrawFunds(1300));
		System.out.println(overdraftAccount);
		overdraftAccount.chargeInterest();
		System.out.println(overdraftAccount);
	}

}

