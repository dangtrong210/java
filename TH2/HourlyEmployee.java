package TH2;
import java.util.Scanner;
class HourlyEmployee extends Employee {
	private double wage, hours;
	
	public HourlyEmployee() {
		this.hours=0d;
		this.wage=0d;
	}
	public HourlyEmployee(double wage, double hours) {
		this.hours=hours;
		this.wage=wage;
	}
	
	public void setHours(double hours) {
		this.hours=hours;
	}
	public void setWage(double wage) {
		this.wage=wage;
	}
	public double getHours() {
		return (this.hours);
	}
	public double getWage() {
		return (this.wage);
	}
	
	public void nhap(Scanner ip) {
		super.nhap(ip);
		System.out.print("\nNhap luong/h: ");
		wage=ip.nextDouble();
		System.out.print("\nNhap so gio lam viec: ");
		hours=ip.nextDouble();
	}
	
	public double earnings() {
		super.print();
		if(this.hours>40) {
			System.out.print("\nTien lam trong "+hours+":"+wage*1.5+"\n");
			return(this.wage*1.5);
		}
		System.out.print("\nTien lam trong "+hours+":"+wage+"\n");
		return(this.wage);
	}
}
