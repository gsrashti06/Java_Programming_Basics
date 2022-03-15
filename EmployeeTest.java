//15
import java.util.Scanner;
public class EmployeeTest {
	public static void main(String[] args) {
		Employee E1=new Employee();
		Employee E2=new Employee();
		Scanner s=new Scanner(System.in);
		String firstname;
		String lastname;
		double salary;
		System.out.println("Enter first name of the first employee : ");
		firstname=s.next();
		E1.setFirstName(firstname);
		System.out.println("Enter last name of the first employee : ");
		lastname=s.next();
		E1.setLastName(lastname);
		System.out.println("Enter Monthly salary of first employee : ");
		salary=s.nextDouble();
		E1.setSalary(salary);
		System.out.println("Enter first name of the second employee : ");
		firstname=s.next();
		E2.setFirstName(firstname);
		System.out.println("Enter last name of the second employee : ");
		lastname=s.next();
		E2.setLastName(lastname);
		System.out.println("Enter Monthly salary of second employee : ");
		salary=s.nextDouble();
		E2.setSalary(salary);
		System.out.println("First and Second Employee FullName and Salary\n");
		System.out.println(E1.getFirstName()+" "+E1.getLastName()+" "+E1.getSalary());
		System.out.println(E2.getFirstName()+" "+E2.getLastName()+" "+E2.getSalary());
		System.out.println("Annual Salary  after 10% raise ");
		System.out.println(E1.getFirstName()+" "+E1.getLastName()+" "+E1.getSalary()*1.10*12);
		System.out.println(E2.getFirstName()+" "+E2.getLastName()+" "+E2.getSalary()*1.10*12);
		
		
		
	}

}

