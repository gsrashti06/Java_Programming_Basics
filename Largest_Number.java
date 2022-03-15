import java.util.Scanner;
public class Largest_Number {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
       Scanner sc = new Scanner(System.in);
       System.out.println("Enter two integers");
       int num1 = sc.nextInt();
       int num2 = sc.nextInt();
       if(num1>num2) {
    	   System.out.println(num1 + "is larger");
       }
       else if(num2>num1) {
    	   System.out.println(num2 + "is larger");
       }
       else {
    	   System.out.print("These numbers are equal");
       }
       
       
	}

}
