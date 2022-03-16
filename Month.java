import java.util.Scanner;
public class Month {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		 System.out.println("Enter the month number");
		int number=sc.nextInt();
		
        String name;
  
        // switch statement with int data type
        switch (number) {
        case 1:
            name = "January";
            break;
        case 2:
            name= "February";
            break;
        case 3:
            name = "March";
            break;
        case 4:
            name = "April";
            break;
        case 5:
            name = "May";
            break;
        case 6:
            name = "June";
            break;
        case 7:
            name = "July";
            break;
        case 8:
            name = "August";
            break;
        case 9:
            name = "September";
            break;
        case 10:
            name = "October";
            break;
        case 11:
            name = "November";
            break;
        default:
            name = "December";
        }
        System.out.println(name);
		}
		

	}


