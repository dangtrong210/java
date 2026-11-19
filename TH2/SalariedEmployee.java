package TH2;
import java.util.Scanner;
class SalariedEmployee extends Employee{
	private double weeklySalary;
	public SalariedEmployee() {
		super();
		this.weeklySalary=0d;
	}
	public SalariedEmployee(Double w,String firstName, String lastName,String socialSecurityNumber) {
		super(firstName, lastName, socialSecurityNumber);
		this.weeklySalary=w;
	}
	public void setweeklySalary(Double weeklySalary) {
		this.weeklySalary=weeklySalary;
	}
	
	public void nhap(Scanner ip) {
		super.nhap(ip);
		System.out.print("\nNhap luong co dinh khong tinh gio lam viec: ");
		weeklySalary=ip.nextDouble();
	}
	public double earnings() {
		super.print();
		System.out.print("Luong co dinh: "+weeklySalary+"\n");
		return (this.weeklySalary);
	}
}
