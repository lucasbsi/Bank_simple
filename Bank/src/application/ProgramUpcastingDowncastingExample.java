package application;

import entities.Account;
import entities.BusinessAccount;
import entities.SavingsAccount;
//import entities.BusinessAccount;

public class ProgramUpcastingDowncastingExample {

	public static void main(String[] args) {
		
		//BusinessAccount account = new BusinessAccount();
		
		//account.getBalance();
		
		Account acc = new Account(1001, "Lucas", 0.0);
		BusinessAccount bacc = new BusinessAccount(1002, "Maria", 0.0, 500.0);
		
		//UPCASTING
		
		Account acc1 = bacc;//bacc é uma Account
		Account acc2 = new BusinessAccount(1003, "Bob", 0.0, 200.0);
		Account acc3 = new SavingsAccount(1004, "Ana", 0.0, 0.01);
		// é perfeitamente normal pegar um objeto que é de alguma subclasse e 
		//ser atribuido a uma variavel da superclasse
		
		//DOWNCASTING
		
		//BusinessAccount acc4 = acc2;// não aceita converter superclasse para subclasse
		BusinessAccount acc4 = (BusinessAccount)acc2;//casting manual
		
		//BusinessAccount acc5 = (BusinessAccount)acc3;//erro de cast
		if (acc3 instanceof BusinessAccount) {
			BusinessAccount acc5 = (BusinessAccount)acc3;
			acc5.loan(15.0);
			System.out.println("Loan!");
		}
		if (acc3 instanceof SavingsAccount) {
			SavingsAccount acc5 = (SavingsAccount)acc3;
			acc5.updateBalance();
			System.out.println("Update!");
		}
		
	}

}
