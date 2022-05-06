package Qlhocvien;

import java.util.Scanner;

public class Customer extends Person {
	String tenCty;
	double triGiaHoaDon;
	String danhGia;
	public Customer() {
		super();
	}
	public Customer(String hoTen, String diaChi) {
		super(hoTen, diaChi);
	}
	public Customer(String hoTen, String diaChi, String tenCty, double triGiaHoaDon, String danhGia) {
		super(hoTen, diaChi);
		this.tenCty = tenCty;
		this.triGiaHoaDon = triGiaHoaDon;
		this.danhGia = danhGia;
	}
	public String getTenCty() {
		return tenCty;
	}
	public void setTenCty(String tenCty) {
		this.tenCty = tenCty;
	}
	public double getTriGiaHoaDon() {
		return triGiaHoaDon;
	}
	public void setTriGiaHoaDon(double triGiaHoaDon) {
		this.triGiaHoaDon = triGiaHoaDon;
	}
	public String getDanhGia() {
		return danhGia;
	}
	public void setDanhGia(String danhGia) {
		this.danhGia = danhGia;
	}
	@Override
	public String toString() {
		return "Customer [tenCty=" + tenCty + ", triGiaHoaDon=" + triGiaHoaDon + ", danhGia=" + danhGia + ", hoTen="
				+ hoTen + ", diaChi=" + diaChi + "]";
	}
	
	//Phuong thuc nhap
	public void nhap() {
		super.nhap();
		Scanner p = new Scanner(System.in);
		System.out.println("Nhap vao ten cong ty: ");
		tenCty = p.nextLine();
		System.out.println("Nhap vao tri gia hoa don: ");
		triGiaHoaDon = Double.parseDouble(p.nextLine());
		System.out.println("Nhap vao danh gia: ");
		danhGia = p.nextLine();
	}
	
}
