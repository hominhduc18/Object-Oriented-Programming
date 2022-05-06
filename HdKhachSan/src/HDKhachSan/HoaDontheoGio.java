package HDKhachSan;

import java.util.Scanner;

public class HoaDontheoGio extends HoaDon {
	protected int soGioThue;

	public int getSoGioThue() {
		return soGioThue;
	}

	public void setSoGioThue(int soGioThue) {
		this.soGioThue = soGioThue;
	}

	public HoaDontheoGio(int maHD, String ngayHD, String tenKH, int maP, int donGia, int soGioThue) {
		super(maHD, ngayHD, tenKH, maP, donGia);
		this.soGioThue = soGioThue;
	}

	public HoaDontheoGio() {
		super();
	}
	public void nhap()
	{
		Scanner sc= new Scanner(System.in);
		super.nhap();
		System.out.println("nhâp vào số giờ hợp động" );
		soGioThue=sc.nextInt();	
	}
	public float thanhtien()
	{
		if(this.getSoGioThue() <=24)
		{
			return this.getDonGia() * this.getSoGioThue();
		}
		else if(this.getSoGioThue() >24 && this.getSoGioThue()<=30)
		{
			return this.getDonGia() *24f;
		}
		else 
			return 0;
	}

	@Override
	public String toString() {
		return "HoaDontheoGio [soGioThue=" + soGioThue + "]";
	}
	
}
