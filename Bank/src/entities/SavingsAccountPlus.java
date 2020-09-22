package entities;
// se a classe SavingsAccount for declarada com public final class, não poderá ser herdada por nenhuma classe, a condição é válida tanto para classe quanto métodos( no caso de @Override)
public class SavingsAccountPlus extends SavingsAccount {
	
	@Override
	public void withdraw(double amount) {
		balance -= amount + 2.0;
		
	}
}
