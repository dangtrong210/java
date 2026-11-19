package TH2;
import java.util.Scanner;
class CommissionEmployee extends Employee{
	private double grossSales, commissionRate;
	public CommissionEmployee() {
		this.commissionRate=0d;
		this.grossSales=0d;
	}
	public CommissionEmployee(double grossSales, double commissionRate) {
		this.commissionRate=commissionRate;
		this.grossSales=grossSales;
	}
	
	public void setcommissionRate(double commissionRate) {
		this.commissionRate=commissionRate;
	}
	public void setgrossSales(double grossSales) {
		this.grossSales=grossSales;
	}
	public double getgrossSales() {
		return (this.grossSales);
	}
	public double getcommissionRate() {
		return (this.commissionRate);
	}
	
	public void nhap(Scanner ip) {
		super.nhap(ip);
		System.out.print("\nNhap tong doanh so ban: ");
		grossSales=ip.nextDouble();
		System.out.print("\nNhap ti le hue hong: ");
		commissionRate=ip.nextDouble();
	}
	public double earnings() {
		System.out.print("\nTien hue hong: "+grossSales*commissionRate+"\n");
		return grossSales*commissionRate;
	}
}
