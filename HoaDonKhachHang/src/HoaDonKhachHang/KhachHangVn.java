package HoaDonKhachHang;

import java.util.Scanner;

public class KhachHangVn  extends KhachHang{
	protected String doiTuongKH;
	protected  int dinhMuc;


	public String getDoiTuongKH() {
		return doiTuongKH;
	}
	public void setDoiTuongKH(String doiTuongKH) {
		this.doiTuongKH = doiTuongKH;
	}
	public int getDinhMuc() {
		return dinhMuc;
	}
	public void setDinhMuc(int dinhMuc) {
		this.dinhMuc = dinhMuc;
	}
	
	public KhachHangVn(String maKh, String hoTen, String ngayHĐ, int soLuong, double donGia, String doiTuongKH,int dinhMuc) {
		super();
		this.doiTuongKH = doiTuongKH;
		this.dinhMuc = dinhMuc;
	}
	
	public KhachHangVn() {
		super();
	}
	public void nhap()
	{
	 super.nhap();
	 Scanner sc=new  Scanner(System.in);
	 System.out.println("nhập vào đối tượng khách hàng:");
	int choose=new Scanner(System.in).nextInt();
	switch (choose) 
	{
	case 1:
	{
		doiTuongKH="Sinh Hoạt";
		break;
	}
	case 2:
	{
		doiTuongKH="Kinh Doanh";
		break;
	}
	case 3:
	{
		doiTuongKH="Sản Xuất";
	}
	default:
        System.out.println("Chọn số không hợp lệ.");
        break;
	}
	System.out.println("nhập vào giá trị định mức:");
	dinhMuc=sc.nextInt();
 	}
  	public void xuat()
  	{
  		super.xuat();
  		System.out.println("Đối tượng khách hàng: "+this.doiTuongKH);
  		System.out.println("Đinh mức: "+this.dinhMuc);
  	}
  	public float thanhtien()
  	{
  		if(this.getSoLuong() <= this.getDinhMuc())
  		{
  				return this.getSoLuong() *this.getDinhMuc();
  		}
  		else 
  		{
  				return this.getSoLuong() * this.getDonGia() *this.getDinhMuc() +(this.getSoLuong()-this.getDinhMuc())*this.getDonGia()*2.5f;
  		}
  	}
	@Override
	public String toString() {
		return "KhachHangVn [doiTuongKH=" + doiTuongKH + ", dinhMuc=" + dinhMuc + "]";
	}
  	
}
