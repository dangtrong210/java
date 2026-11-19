package TH2;
import java.util.Scanner;
public abstract class Employee {
	private String firstName, lastName, socialSecurityNumber;
	
	public Employee(String firstName, String lastName,String socialSecurityNumber) {
		this.firstName=firstName;
		this.lastName=lastName;
		this.socialSecurityNumber=socialSecurityNumber;
	}
	public Employee() {
		this.firstName="";
		this.lastName="";
		this.socialSecurityNumber="";
	}
	
	public void nhap(Scanner ip) {
		System.out.print("\nNhap ten: ");
		firstName=ip.next();
		System.out.print("\nNhap ho: ");
		lastName=ip.next();
		System.out.print("\nNhap BHXH: ");
		socialSecurityNumber=ip.next();
	}
	
	public void setfirstName(String firstName) {
		this.firstName=firstName;
	}
	public void setlastName(String lastName) {
		this.lastName=lastName;
	}
	public void setsocialSecurityNumber(String socialSecurityNumber) {
		this.socialSecurityNumber=socialSecurityNumber;
	}
	public String getfirstName() {
		return (this.firstName);
	}
	public String getlastName() {
		return (this.lastName);
	}
	public String socialSecurityNumber() {
		return (this.socialSecurityNumber);
	}
	public abstract double earnings();
	

	public void print() {
		System.out.println("Nhan vien: "+firstName+" "+lastName+", BHXH: "+socialSecurityNumber);
	}
}