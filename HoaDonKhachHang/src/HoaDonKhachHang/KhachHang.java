package HoaDonKhachHang;

import java.util.Scanner;

public class KhachHang {
	protected String maKh;
	protected String hoTen;
	protected String ngayHĐ;
	protected int soLuong;
	protected int donGia;

	public String getMaKh() {
		return maKh;
	}
	public void setMaKh(String maKh) {
		this.maKh = maKh;
	}
	public String getHoTen() {
		return hoTen;
	}
	public void setHoTen(String hoTen) {
		this.hoTen = hoTen;
	}
	public String getNgayHĐ() {
		return ngayHĐ;
	}
	public void setNgayHĐ(String ngayHĐ) {
		this.ngayHĐ = ngayHĐ;
	}
	public int getSoLuong() {
		return soLuong;
	}
	public void setSoLuong(int soLuong) {
		this.soLuong = soLuong;
	}
	public int getDonGia() {
		return donGia;
	}
	public void setDonGia(int donGia) {
		this.donGia = donGia;
	}
	
	public KhachHang(String maKh, String hoTen, String ngayHĐ, int soLuong, int donGia) {
		super();
		this.maKh = maKh;
		this.hoTen = hoTen;
		this.ngayHĐ = ngayHĐ;
		this.soLuong = soLuong;
		this.donGia = donGia;
	}
	public KhachHang() {
		super();
	}
	public void nhap(){
		Scanner sc =new Scanner(System.in);
		System.out.println("Nhập vào mã khác hàng: ");
		maKh=sc.nextLine();
		System.out.println("Nhập vào họ tên khách: ");
		hoTen=sc.nextLine();
		System.out.println("nhập vào ngày hóa đơn: ");
		ngayHĐ=sc.nextLine();
		System.out.println("nhập vào số lượng: ");
		soLuong=sc.nextInt();
		System.out.println("nhập vào đơn giá: ");
		donGia=sc.nextInt();
	}
	public void xuat()
	{
		System.out.println("Mã Khách hàng :"+this.maKh);
		System.out.println("Họ và tên :"+this.hoTen);
		System.out.println("Ngày hóa đơn :"+this.ngayHĐ);
		System.out.println("Số Lượng:"+this.soLuong);
		System.out.println("Đơn Gía:"+this.donGia);
	}
	@Override
	public String toString() {
		return "KhachHang [maKh=" + maKh + ", hoTen=" + hoTen + ", ngayHĐ=" + ngayHĐ + ", soLuong=" + soLuong
				+ ", donGia=" + donGia + "]";
	}
	

}
