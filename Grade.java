import java.util.Scanner;

public class Grade {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter your marks (less than 100)::");
	      int average = sc.nextInt();

	      if(average>=80){
	         System.out.println("Excellent");
	      }else if(average>=60 && average<80){
	    	  System.out.println("Very Good");;
	      }
	      else if(average>=40 && average<60){
	    	  System.out.println("Good");;
	      }
	      else {
	    	  System.out.println("Bad");
	      }

	}

}
