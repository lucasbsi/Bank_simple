package application;

import entities.Account;
import entities.BusinessAccount;
import entities.SavingsAccount;

public class ProgramOverrideExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Account acc1 = new Account(1001, "Alex", 1000.0);
		acc1.withdraw(200.0);
		System.out.println(acc1.getBalance());
		Account acc2 = new SavingsAccount(1002, "Jão", 1000.0, 0.01);//exemplo de up casting pois a var pode ser tanto account como savingsaccount
		acc2.withdraw(200.0);
		System.out.println(acc2.getBalance());
		
		Account acc3 = new BusinessAccount(1003, "Bob", 1000.0, 500.0);
		acc3.withdraw(200.0);
		System.out.println(acc3.getBalance());
	}

}
