package entities;
// se a classe SavingsAccount for declarada com public final class, n�o poder� ser herdada por nenhuma classe, a condi��o � v�lida tanto para classe quanto m�todos( no caso de @Override)
public class SavingsAccountPlus extends SavingsAccount {
	
	@Override
	public void withdraw(double amount) {
		balance -= amount + 2.0;
		
	}
}
