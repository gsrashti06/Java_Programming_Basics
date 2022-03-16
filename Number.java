import java.util.Scanner;
public class Number {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the number");
		int num = sc.nextInt();
		//checks the number is greater than 0 or not  
		if(num>0)  
		{  
		System.out.println("The number is positive.");  
		}  
		//checks the number is less than 0 or not  
		else if(num<0)  
		{  
		System.out.println("The number is negative.");  
		}
		else  
		{  
		System.out.println("The number is zero.");  
		}  
	}

}
