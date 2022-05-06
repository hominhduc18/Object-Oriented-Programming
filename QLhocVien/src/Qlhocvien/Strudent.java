package Qlhocvien;

import java.util.Scanner;

public class Strudent extends Person{
	float diem1, diem2, diemtb;
	String danhGia;
	
	public Strudent() {
		super();
	}

	public Strudent(String hoTen, String diaChi, float diem1, float diem2) {
		super(hoTen, diaChi);
		this.diem1 = diem1;
		this.diem2 = diem2;
	}

	public float getDiem1() {
		return diem1;
	}

	public void setDiem1(float diem1) {
		this.diem1 = diem1;
	}

	public float getDiem2() {
		return diem2;
	}

	public void setDiem2(float diem2) {
		this.diem2 = diem2;
	}

	public float getDiemtb() {
		diemtb = (diem1 + diem2) / 2;
		return diemtb;
	}

	public void setDiemtb(float diemtb) {
		this.diemtb = diemtb;
	}

	public String getDanhGia() {
		if(0 <= diemtb && diemtb < 3)
			return "kem";
		if(3 <= diemtb && diemtb < 5)
			return "yeu";
		if(5 <= diemtb && diemtb < 6.5)
			return "trung binh";
		if(6.5 <= diemtb && diemtb < 8)
			return "kha";
		else 
			return "gioi";
	}

	public void setDanhGia(String danhGia) {
		this.danhGia = danhGia;
	}

	@Override
	public String toString() {
		return "Student [diem1=" + diem1 + ", diem2=" + diem2 + ", diemtb=" + getDiemtb() + ", danhGia=" + getDanhGia()
				+ ", hoTen=" + hoTen + ", diaChi=" + diaChi + "]";
	}
	
	//Phuong thuc nhap
	public void nhap() {
		super.nhap();
		Scanner p = new Scanner(System.in);
		System.out.println("Nhap diem mon 1: ");
		diem1 = Float.parseFloat(p.nextLine());
		System.out.println("Nhap diem mon 2: ");
		diem2 = Float.parseFloat(p.nextLine());
	}
}
