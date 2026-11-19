package TH2;
import java.util.Scanner;
class BasePlusCommissionEmployee extends CommissionEmployee {
	private double baseSalary;
	public BasePlusCommissionEmployee() {
		this.baseSalary=0.0;
	}
	public BasePlusCommissionEmployee(double baseSalary) {
		this.baseSalary=baseSalary;	
	}
	
	public void setbaseSalary(double baseSalary) {
		this.baseSalary=baseSalary;
	}
	public double getbaseSalary() {
		return (this.baseSalary);
	}
	public void nhap(Scanner ip) {
		super.nhap(ip);
		System.out.print("\nLuong co ban/tuan:");
		baseSalary=ip.nextDouble();
	}
	public double earnings() {
		return baseSalary+super.earnings();
	}
	
	public void print() {
		super.print();
		System.out.print("\nLuong co ban co hoa hong: "+earnings()+"\n");
	}
}