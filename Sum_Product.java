//5
import java.util.Scanner;
public class Sum_Product {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the two integers");
		int a = sc.nextInt();
		int b = sc.nextInt();
		int sum = a+b;
		int product = a*b;
		int difference = a-b;
		int quotient = a/b;
		System.out.println("Sum of the two integers = "+sum);
		System.out.println("Product of the two integers = "+product);
		System.out.println("Difference of the two integers = "+difference);
		System.out.println("Quotient of the two integers = "+quotient);
		
		
		

	}

}
