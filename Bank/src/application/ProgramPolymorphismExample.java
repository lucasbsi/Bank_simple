package application;

import entities.Account;
import entities.SavingsAccount;

public class ProgramPolymorphismExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Account x = new Account(1020, "Jonas", 1000.0);
		Account y = new SavingsAccount(1025, "Ale", 1000.0, 0.01);
		// exemplos de polimorfismo, pois são var de mesmo tipo porém instaciadas por objtos diff logo os métodos embora tenham o mesmo nome, retornam resultados distintos de acordo com a assinatura.
		
		x.withdraw(50.0);
		y.withdraw(50.0);
		System.out.println("x->"+x.getBalance());
		System.out.println("y->"+y.getBalance());
	}

}
//945
//950