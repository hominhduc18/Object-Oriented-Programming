package HDKhachSan;

import java.util.Scanner;

public class soNgayThue extends HoaDon{
	protected int soNgayThue;

	public int getSoNgayThue() {
		return soNgayThue;
	}

	public void setSoNgayThue(int soNgayThue) {
		this.soNgayThue = soNgayThue;
	}

	public soNgayThue(int maHD, String ngayHD, String tenKH, int maP, int donGia, int soNgayThue) {
		super(maHD, ngayHD, tenKH, maP, donGia);
		this.soNgayThue = soNgayThue;
	}

	public soNgayThue() {
		super();
	}
	public float thanhtien()
	{
		if(this.getSoNgayThue()<7)
		{
			return this.getSoNgayThue() *this.getDonGia();
		}
		else 
			return this.getSoNgayThue() * this.getDonGia()*0.8f;
	}
	public void nhap()
	{
		Scanner sc=new Scanner(System.in);
		super.nhap();
		System.out.println("nhập vào số ngày thuê:");
		soNgayThue=sc.nextInt();
	}

	@Override
	public String toString() {
		return "soNgayThue [soNgayThue=" + soNgayThue + "]";
	}
	

}
