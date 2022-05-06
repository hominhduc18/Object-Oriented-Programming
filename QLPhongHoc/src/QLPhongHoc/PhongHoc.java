package QLPhongHoc;

import java.util.Scanner;

public class PhongHoc {
	protected int MaP;
	protected int dayNha;
	protected int dienTich;
	protected int soBongDen;
	public int getMaP() {
		return MaP;
	}
	public void setMaP(int maP) {
		MaP = maP;
	}
	public int getDayNha() {
		return dayNha;
	}
	public void setDayNha(int dayNha) {
		this.dayNha = dayNha;
	}
	public int getDienTich() {
		return dienTich;
	}
	public void setDienTich(int dienTich) {
		this.dienTich = dienTich;
	}
	public int getSoBongDen() {
		return soBongDen;
	}
	public void setSoBongDen(int soBongDen) {
		this.soBongDen = soBongDen;
	}
	public PhongHoc(int maP, int dayNha, int dienTich, int soBongDen) {
		super();
		MaP = maP;
		this.dayNha = dayNha;
		this.dienTich = dienTich;
		this.soBongDen = soBongDen;
	}
	public PhongHoc() {
		super();
	}
	@Override
	public String toString() {
		return "PhongHoc [MaP=" + MaP + ", dayNha=" + dayNha + ", dienTich=" + dienTich + ", soBongDen=" + soBongDen
				+ "]";
	}
	public boolean datchuan()
	{
		if(this.getSoBongDen() >=1 && this.getDienTich()>=10)
		{
			return true;
		}
		else
			return false;
	}
	public void nhap()
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("nhập mã phòng");
		MaP=sc.nextInt(); 
		System.out.println("nhập dãy nhà:");
		dayNha=sc.nextInt();
		System.out.println("nhập diện tích:");
		dienTich=sc.nextInt();
		System.out.println("nhập số bóng đèn:");
		soBongDen=sc.nextInt();
	}
	public void xuat()
	{
		System.out.println("Mã phòng: "+this.MaP);
		System.out.println("Dãy Nhà: "+this.dayNha);
		System.out.println("Diện Tích: "+this.dienTich +"cm2");
		System.out.println("Số Bóng đèn: "+this.soBongDen);
	}
}
