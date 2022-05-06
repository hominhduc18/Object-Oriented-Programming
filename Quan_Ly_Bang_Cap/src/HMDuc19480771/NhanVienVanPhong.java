package HMDuc19480771;

import java.util.Date;
import java.util.Scanner;

import com.sun.org.apache.xalan.internal.xsltc.compiler.sym;

public class NhanVienVanPhong extends NhanVien {
	protected int thamgiaboiduong;
	protected int giolaodongcongit;
	public NhanVienVanPhong(int maNV, String hoTen, Date ngaySinh, int thamgiaboiduong, int giolaodongcongit) {
		super(maNV, hoTen, ngaySinh);
		this.thamgiaboiduong = thamgiaboiduong;
		this.giolaodongcongit = giolaodongcongit;
	}
	public NhanVienVanPhong() {
		super();
	}
	public int getThamgiaboiduong() {
		return thamgiaboiduong;
	}
	public void setThamgiaboiduong(int thamgiaboiduong) {
		this.thamgiaboiduong = thamgiaboiduong;
	}
	public int getGiolaodongcongit() {
		return giolaodongcongit;
	}
	public void setGiolaodongcongit(int giolaodongcongit) {
		this.giolaodongcongit = giolaodongcongit;
	}
	public boolean LĐTT()
	{
		if(this.getThamgiaboiduong() >=1 && this.getGiolaodongcongit() >=20)
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
		System.out.println("nhập số lần tham gia lớp bồi dưỡng:");
		thamgiaboiduong=sc.nextInt();
		System.out.println("nhập số giờ lao động công ít:");
		giolaodongcongit=sc.nextInt();
	}
	public void xuat()
	{
		super.xuat();
		System.out.println("số lần tham gia lớp bồi dưỡng:   "+this.getThamgiaboiduong());
		System.out.println("số giờ lao động công ít:   "+this.getGiolaodongcongit());
	}

}
