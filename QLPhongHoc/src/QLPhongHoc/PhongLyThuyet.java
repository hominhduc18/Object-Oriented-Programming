package QLPhongHoc;

import java.util.Scanner;

public class PhongLyThuyet extends PhongHoc{
	protected int mayChieu;

	public int getMayChieu() {
		return mayChieu;
	}

	public void setMayChieu(int mayChieu) {
		this.mayChieu = mayChieu;
	}

	public PhongLyThuyet(int maP, int dayNha, int dienTich, int soBongDen, int mayChieu) {
		super(maP, dayNha, dienTich, soBongDen);
		this.mayChieu = mayChieu;
	}

	public PhongLyThuyet() {
		super();
	}

	@Override
	public String toString() {
		return "PhongLyThuyet [mayChieu=" + mayChieu + "]";
	}
	public boolean datchuan()
	{
		if(this.mayChieu>=1)
		{
			return true;
		}
		else 
			return false;
	}
	public void nhap()
	{
		super.nhap();
		Scanner sc=new Scanner(System.in);
		System.out.println("nhập số máy chiếu trong phòng:");
		mayChieu=sc.nextInt();
	}
	public void xuat()
	{
		super.xuat();
		System.out.println("Số máy chiếu: "+this.mayChieu);
	}
}
