package hominhduc;



import java.util.Scanner;

public class Thisinh {
	protected String soBaoDanh;
	protected String hoTen;
	protected String diaChi;
	protected double muUuTien;

	public Thisinh() {
	}

	public Thisinh(String soBaoDanh, String hoTen, String diaChi, double muUuTien) {
		this.soBaoDanh = soBaoDanh;
		this.hoTen = hoTen;
		this.diaChi = diaChi;
		this.muUuTien = muUuTien;
	}

	public String getSoBaoDanh() {
		return soBaoDanh;
	}

	public void setSoBaoDanh(String soBaoDanh) {
		this.soBaoDanh = soBaoDanh;
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

	public double getMuUuTien() {
		return muUuTien;
	}

	public void setMuUuTien(double muUuTien) {
		this.muUuTien = muUuTien;
	}

	public void inputThisinh(){
		Scanner sc = new Scanner(System.in);
		System.out.print("Nhập số báo danh: ");
		setSoBaoDanh(sc.nextLine());
		System.out.print("Nhập họ tên: ");
		setHoTen(sc.nextLine());
		System.out.print("Nhập địa chỉ: ");
		setDiaChi(sc.nextLine());
		System.out.print("Nhập mức ưu tiên: ");
		setMuUuTien(sc.nextDouble());
	}
	public void printThisinh(){
		System.out.println("\tSố báo danh: "+this.soBaoDanh);
		System.out.println("Họ tên: "+this.hoTen);
		System.out.println("Địa chỉ: "+this.diaChi);
		System.out.println("Mức ưu tiên: "+this.muUuTien);
	}

}


