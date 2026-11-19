package TH2;
import java.util.Scanner;
import java.util.ArrayList;
import java.util.List;
public class Main {
	public static void main(String[] args) {
		Scanner ip=new Scanner(System.in);
		System.out.print("Nhap so luong nhan vien: ");
		int n=ip.nextInt();
		Employee [] NV=new Employee [n];
		for(int i=0;i<n;i++) {
			System.out.print("\nNhap nhan vien thu "+(i+1)+":");
			NV[i]=new BasePlusCommissionEmployee();
			NV[i].nhap(ip);
		}
		
		for(int i=0;i<n;i++) {
			NV[i].print();
		}
	}
}
