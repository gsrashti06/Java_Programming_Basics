import java.util.Scanner;
public class Donate_Blood {

	public static void main(String[] args) {
	  Scanner sc = new Scanner(System.in);
	  System.out.println("Enter your age");
	  int age = sc.nextInt();
	  System.out.println("Enter your weight");
	  int weight = sc.nextInt();
	  if(age>=18 && weight>=40) {
		  System.out.println("Eligible to donate blood");
	  }
	  else if(age>=18 && weight<=40) {
		  System.out.println("Not Eligible to donate blood");
	  }
	  else if(age<18 && weight<40) {
		  System.out.println("Not eligible to donate blood");
	  }
	  else {
		  System.out.println("Eligible to donate blood");
	  }
	}
	}