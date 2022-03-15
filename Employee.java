//15
public class Employee {
private String firstName;
private String lastName;
private double monthlysalary;
public Employee() {
	firstName=null;
	lastName=null;
	monthlysalary=0.0;
}
public void setFirstName(String firstname) {
	firstName=firstname;
}
public String getFirstName() {
	return firstName;
}
public void setLastName(String lastname) {
	lastName=lastname;
}
public String getLastName() {
	return lastName;
}
public void setSalary(double salary) {
	monthlysalary=salary;
}
public double getSalary() {
	return monthlysalary;
}
}
