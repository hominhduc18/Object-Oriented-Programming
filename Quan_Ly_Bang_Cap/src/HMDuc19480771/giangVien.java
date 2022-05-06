package HMDuc19480771;

import java.util.Date;
import java.util.Scanner;

public class giangVien extends NhanVien {
	protected int sotietday;
	protected int sodetai;
	public giangVien(int maNV, String hoTen, Date ngaySinh, int sotietday, int sodetai) {
		super(maNV, hoTen, ngaySinh);
		this.sotietday = sotietday;
		this.sodetai = sodetai;
	}
	public giangVien() {
		super();
	}
	public int getSotietday() {
		return sotietday;
	}
	public void setSotietday(int sotietday) {
		this.sotietday = sotietday;
	}
	public int getSodetai() {
		return sodetai;
	}
	public void setSodetai(int sodetai) {
		this.sodetai = sodetai;
	}
	public boolean LĐTT()
	{
		if(this.getSotietday() >300 && this.getSodetai()>=5)
		{
			return true;
		}
		else 
			return false;
	}
	public void nhap()
	{
		Scanner sc=new Scanner(System.in);
		super.nhap();
		System.out.println("nhập số tiết dạy:  ");
		sotietday=sc.nextInt();
		System.out.println("nhập số đề tài hướng dẫn:  ");
		sodetai=sc.nextInt();
	}
	public void xuat()
	{
		Scanner sc =new Scanner(System.in);
		super.xuat();
		System.out.println("số tiết dạy:  "+this.getSotietday());
		System.out.println("số đề tài hướng dẫn:  "+this.getSodetai());
	}

}
