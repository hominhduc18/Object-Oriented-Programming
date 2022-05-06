package HDKhachSan;

import java.util.Scanner;

public class HoaDon {
	protected  int maHD;
	protected String ngayHD;
	protected String tenKH;
	protected int maP;
	protected int donGia;
	public int getMaHD() {
		return maHD;
	}
	public void setMaHD(int maHD) {
		this.maHD = maHD;
	}
	public String getNgayHD() {
		return ngayHD;
	}
	public void setNgayHD(String ngayHD) {
		this.ngayHD = ngayHD;
	}
	public String getTenKH() {
		return tenKH;
	}
	public void setTenKH(String tenKH) {
		this.tenKH = tenKH;
	}
	public int getMaP() {
		return maP;
	}
	public void setMaP(int maP) {
		this.maP = maP;
	}
	public int getDonGia() {
		return donGia;
	}
	public void setDonGia(int donGia) {
		this.donGia = donGia;
	}
	public HoaDon(int maHD, String ngayHD, String tenKH, int maP, int donGia) {
		super();
		this.maHD = maHD;
		this.ngayHD = ngayHD;
		this.tenKH = tenKH;
		this.maP = maP;
		this.donGia = donGia;
	}
	public HoaDon() {
		super();
	}
	public void nhap()
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("nhập vào mã hóa đơn : ");
		maHD=sc.nextInt();
		System.out.println("nhập vào ngày hóa đơn: ");
		ngayHD=sc.nextLine();
		System.out.println("nhập vào tên khách hàng: ");
		tenKH=sc.nextLine();
		System.out.println("nhập vào mã phòng: ");
		maHD=sc.nextInt();
		System.out.println("nhập vào đơn giá: ");
		donGia=sc.nextInt();
	}
	@Override
	public String toString() {
		return "HoaDon [maHD=" + maHD + ", ngayHD=" + ngayHD + ", tenKH=" + tenKH + ", maP=" + maP + ", donGia="
				+ donGia + "]";
	}
	

}
