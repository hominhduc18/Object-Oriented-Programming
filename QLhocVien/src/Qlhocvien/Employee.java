package Qlhocvien;

import java.util.Scanner;

public class Employee extends Person {
	int heSoLuong;
	double tienLuong;
	String danhGia;
	
	public Employee() {
		super();
	}

	public Employee(String hoTen, String diaChi, int heSoLuong, String danhGia) {
		super(hoTen, diaChi);
		this.heSoLuong = heSoLuong;
		this.danhGia = danhGia;
	}

	public int getHeSoLuong() {
		return heSoLuong;
	}

	public void setHeSoLuong(int heSoLuong) {
		this.heSoLuong = heSoLuong;
	}

	public double getTienLuong() {
		return tienLuong;
	}

	public void setTienLuong(double tienLuong) {
		tienLuong = 30 * heSoLuong;
		this.tienLuong = tienLuong;
	}

	public String getDanhGia() {
		return danhGia;
	}

	public void setDanhGia(String danhGia) {
		this.danhGia = danhGia;
	}

	@Override
	public String toString() {
		return "Employee [heSoLuong=" + heSoLuong + ", tienLuong=" + getTienLuong() + ", danhGia=" + danhGia + ", hoTen="
				+ hoTen + ", diaChi=" + diaChi + "]";
	}
	
	//Phuong thuc nhap
	public void nhap() {
		super.nhap();
		Scanner p = new Scanner(System.in);
		System.out.println("Nhap vao he so luong: ");
		heSoLuong = Integer.parseInt(p.nextLine());
		System.out.println("Nhap vao tien luong: ");
		tienLuong = Double.parseDouble(p.nextLine());
		System.out.println("Nhap vao danh gia: ");
		danhGia = p.nextLine();
	}
	

}
