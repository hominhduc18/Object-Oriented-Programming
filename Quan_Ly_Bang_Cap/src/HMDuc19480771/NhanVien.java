package HMDuc19480771;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;;
public class NhanVien {
	protected int MaNV;
	protected String hoTen;
	protected Date ngaySinh;
	public NhanVien(int maNV, String hoTen, Date ngaySinh) {
		super();
		MaNV = maNV;
		this.hoTen = hoTen;
		this.ngaySinh = ngaySinh;
	}
	public NhanVien() {
		super();
	}
	public int getMaNV() {
		return MaNV;
	}
	public void setMaNV(int maNV) {
		MaNV = maNV;
	}
	public String getHoTen() {
		return hoTen;
	}
	public void setHoTen(String hoTen) {
		this.hoTen = hoTen;
	}
	public Date getNgaySinh() {
		return ngaySinh;
	}
	public void setNgaySinh(Date ngaySinh) {
		this.ngaySinh = ngaySinh;
	}
	public boolean setNgaysinh(String ngaysinh) {
	     SimpleDateFormat ddd = new SimpleDateFormat("dd/MM/yyyy");
	      try {
	         this.ngaySinh = ddd.parse(ngaysinh);
	         return true;
	      }catch (Exception ex){
	         return false;
	      }
	   }
	public void nhap()
	{
		Scanner sc= new Scanner(System.in);
		System.out.println("nhập vào mã nhân viêm:");
		MaNV=sc.nextInt();
		System.out.println("nhập vào họ tên:");
		hoTen=new Scanner(System.in).nextLine();
		boolean ktra=false;
	      while(!ktra)
	      {
	         System.out.println("Nhập ngày sinh");
	        ktra= setNgaysinh(sc.nextLine());
	      }
	   }
	public void xuat()
	{
		SimpleDateFormat dd=new SimpleDateFormat("dd/MM/yy");
		System.out.println("mã nhân viên:"+this.getMaNV());
		System.out.println("Họ tên:"+this.getHoTen());
		System.out.println("ngày tháng năm:"+dd.format(this.getNgaySinh()));
	}
	public boolean LĐTT()
	{
		return true;
	}
	
	}

