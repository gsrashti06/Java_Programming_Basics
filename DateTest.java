//16
import java.util.*;
public class DateTest {
 public static void main(String[] args) {
 Scanner input = new Scanner(System.in);
 Date myDate = new Date(6, 07, 2000);
 
 System.out.println("Enter The Month");
 int myMonth = input.nextInt();
 myDate.setMonth(myMonth);
 
 System.out.println("Enter the Date");
 int myDay = input.nextInt();
 myDate.setDay(myDay);
 
 System.out.println("Enter the Year");
 int myYear = input.nextInt();
 myDate.setYear(myYear);
 myDate.DisplayDate();
 }
}