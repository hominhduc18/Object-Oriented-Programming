package Qlhocvien;

import java.util.Scanner;

public class Person {
	String hoTen, diaChi;

	public Person() {
		super();
	}

	public Person(String hoTen, String diaChi) {
		super();
		this.hoTen = hoTen;
		this.diaChi = diaChi;
	}

	public String getHoTen() {
		return hoTen;
	}

	public void setHoTen(String hoTen) {
		this.hoTen = hoTen;
	}

	public String getDiaChi() {
		return diaChi;
	}

	public void setDiaChi(String diaChi) {
		this.diaChi = diaChi;
	}
	//Menu
	public void menu() {
		System.out.println("=========Menu========");
		System.out.println("Chon 1: Them 1 nguoi vao danh sach\nNhap 'S' luu doi tuong Student. Nhap 'E' luu doi tuong Employee. Nhap 'C' luu doi tuong Customer");
		System.out.println("Chon 2: Xoa 1 nguoi khoi danh sach");
		System.out.println("Chon 3: Sap xep danh sach theo thu tu ho ten");
		System.out.println("Chon 4: Xuat danh sach");
		System.out.println("Chon 5: Thoat chuong trinh");
	}
	
	//Phuong thuc nhap
	public void nhap() {
		Scanner p = new Scanner(System.in);
		System.out.println("Nhap ho ten: ");
		hoTen = p.nextLine();
		System.out.println("Nhap dia chi: ");
		diaChi = p.nextLine();
	}
	

}
