//17
import java.util.Scanner;

public class TestSavingsAccount {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s=new Scanner(System.in);
		SavingsAccount saver1=new SavingsAccount();
		SavingsAccount saver2=new SavingsAccount();
		saver1.setSavingsBalance(2000.00);
		saver2.setSavingsBalance(3000.00);
		SavingsAccount.modifyIntrestRate(0.04);
		saver1.calculateMontlyInterest();
		saver2.calculateMontlyInterest();
		System.out.println("new balance of saver1 = "+saver1.getSavingsBalance());
		System.out.println("new balance of saver2 = "+saver2.getSavingsBalance());
		SavingsAccount.modifyIntrestRate(0.05);
		saver1.calculateMontlyInterest();
		saver2.calculateMontlyInterest();
		System.out.println("new balance of saver1 = "+saver1.getSavingsBalance());
		System.out.println("new balance of saver2 = "+saver2.getSavingsBalance());
		

	}

}
