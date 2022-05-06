package HMDuc19480771;

import java.util.Date;
import java.util.Scanner;

public class NghienCuuVien extends NhanVien{
	protected int thamgiadetai;
	protected int baibaocao;
	public NghienCuuVien(int maNV, String hoTen, Date ngaySinh, int thamgiadetai, int baibaocao) {
		super(maNV, hoTen, ngaySinh);
		this.thamgiadetai = thamgiadetai;
		this.baibaocao = baibaocao;
	}
	public NghienCuuVien() {
		super();
	}
	public int getThamgiadetai() {
		return thamgiadetai;
	}
	public void setThamgiadetai(int thamgiadetai) {
		this.thamgiadetai = thamgiadetai;
	}
	public int getBaibaocao() {
		return baibaocao;
	}
	public void setBaibaocao(int baibaocao) {
		this.baibaocao = baibaocao;
	}
	public boolean LĐTT()
	{
		if(this.getThamgiadetai() >=1 && this.getBaibaocao() >=2)
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
		System.out.println("nhập số lần tham gia đề tài:");
		thamgiadetai=sc.nextInt();
		System.out.println("nhập số bài báo cáo:");
		baibaocao=sc.nextInt();
	}
	public void xuat()
	{
		Scanner sc=new Scanner(System.in);
		super.xuat();
		System.out.println("số lần tham gia đề tài:"+this.getThamgiadetai());
		System.out.println("số bài báo cáo:"+this.getBaibaocao());
	}

}
