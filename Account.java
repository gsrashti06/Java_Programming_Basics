//13
public class Account {
	double Balance;
	public Account(double balance) {
		if(balance>0.0)
			Balance=balance;
	}
	public void credit(double amt) {
		Balance+=amt;
	}
	public void debit(double amt) {
		Balance-=amt;
	}
	public double getBalance() {
		return Balance;
	}

}
