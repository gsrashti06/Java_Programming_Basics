//13
import java.util.Scanner;
public class AccountTest {
	public static void main(String[] args) {
	Account acc=new Account(50.00);
	System.out.printf("Account1 Balance : $ %2f\n",acc.getBalance());
	Scanner s=new Scanner(System.in);
	double depositAmount;
	double debitAmount;
	System.out.println("Enter amount to deposite : ");
	depositAmount=s.nextDouble();
	System.out.printf("\nAdding %2f to account balance : \n",depositAmount);
	acc.credit(depositAmount);
	System.out.printf("Account balance : %2f\n",acc.getBalance());
	System.out.printf("Enter amount to debit :\n ");
	debitAmount=s.nextDouble();
	System.out.printf("\nSubtracting %2f from account balnace : \n",debitAmount);
	if(acc.getBalance()>debitAmount) {
		acc.debit(debitAmount);
		System.out.printf("Account balance : %2f\n ",acc.getBalance());
		}
	else {
		System.out.println("!!!!! DEBIT AMOUNT EXCEEDED FROM MINIMUM BALANCE !!!!!");
	}
	
	}
	
	
}