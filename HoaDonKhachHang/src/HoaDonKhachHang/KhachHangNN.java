package HoaDonKhachHang;

import java.util.Scanner;

public class KhachHangNN  extends KhachHang{
	protected String quocTich;

	public String getQuocTich() {
		return quocTich;
	}

	public void setQuocTich(String quocTich) {
		this.quocTich = quocTich;
	}
	public KhachHangNN(String maKh, String hoTen, String ngayHĐ, int soLuong, int donGia, String quocTich) {
		super(maKh, hoTen, ngayHĐ, soLuong, donGia);
		this.quocTich = quocTich;
	}
	public KhachHangNN() {
		super();
	}
	public float thanhtien()
	{
		return  this. getSoLuong() * this.getDonGia() ;
	}
	public void nhap()
	{
		super.nhap();
		Scanner sc =new Scanner(System.in);
		System.out.println("nhập vào quốc tịch: ");
		quocTich=sc.nextLine();
	}
	@Override
	public String toString() {
		return "KhachHangNN [quocTich=" + quocTich + "]";
	}
}
