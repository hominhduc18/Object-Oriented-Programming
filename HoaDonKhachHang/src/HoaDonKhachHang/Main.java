package HoaDonKhachHang;
import java.math.RoundingMode;
import java.util.ArrayList;
import java.util.Scanner;
public class Main {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		ArrayList<KhachHangVn> arrkhanhhangvn= new ArrayList<KhachHangVn>();
		ArrayList<KhachHangNN>arrkhhangnn=new ArrayList<KhachHangNN>();
		int tongvn=0;
		int tongnn=0;
		int i;
		float tongSH=0,tongKD=0,tongSX=0;
		float trungbinhNN=0;
		System.out.println("Nhập số lượng khách hàng Vn: ");
		tongvn=sc.nextInt();
		System.out.println("Nhập số luwọng khác nước ngoài: ");
		tongnn=sc.nextInt();
		for( i=0;i<tongnn;i++)
		{
			System.out.println("nhập thông tin khách hàng nước ngoài: ");
			KhachHangNN khachhangnn=new KhachHangNN();
			khachhangnn.nhap();
			arrkhhangnn.add(khachhangnn);
		}
		for(i=0;i<tongvn;i++)
		{
			System.out.println("nhậpthông tin khác hàng việt nam: ");
			KhachHangVn khachangvn=new KhachHangVn();
			khachangvn.nhap();
			arrkhanhhangvn.add(khachangvn);
		}
		for( i=0;i<arrkhhangnn.size();i++)
		{
			System.out.printf("Thông tin khách hàng nước ngoài : %d",i+1);
			System.out.printf(arrkhhangnn.get(i).toString());
		}
		for(i=0;i<arrkhanhhangvn.size();i++)
		{
			System.out.printf("thông tin khách hàng việt nam: %d",i+1);
			System.out.printf(arrkhanhhangvn.get(i).toString());
		}
		for ( i=0;i<arrkhanhhangvn.size();i++)
		{
			if(arrkhanhhangvn.get(i).getDoiTuongKH()=="sinh hoạt")
			{
				tongSH +=arrkhanhhangvn.get(i).thanhtien();
			}
			else if (arrkhanhhangvn.get(i).getDoiTuongKH()=="kinh doanh")
			{
				tongKD +=arrkhanhhangvn.get(i).thanhtien();
			}
			else 
				tongSX +=arrkhanhhangvn.get(i).thanhtien();
		}
		System.out.println("Tổng khách hàng sinh hoạt là: "+tongSH);
		System.out.println("Tổng khách hàng kinh doanh là: "+tongKD);
		System.out.println("Tổng khách hàng sản xuất là: "+tongSX);
		for ( i=0;i<arrkhhangnn.size();i++)
		{
			trungbinhNN +=arrkhhangnn.get(i).thanhtien();
		}
		
		System.out.println("Tổng khách nước ngoài là: "+trungbinhNN/arrkhhangnn.size());
		System.out.println("Các giao dịch trong tháng 9 năm 2013:");
		for( i=0;i<arrkhhangnn.size();i++)
		{
			String [] datekhacHangnn=arrkhhangnn.get(i).getNgayHĐ().split("/");
			if(datekhacHangnn[1].equals("9") && datekhacHangnn[2].equals("2013"))
			{
					System.out.println(arrkhhangnn.get(i).toString());
		 }
			System.out.println("Các giao dịch trong tháng 9/2013");
			
		for( i=0;i<arrkhanhhangvn.size();i++)
		{
			String [] datekhachangvn=arrkhanhhangvn.get(i).getNgayHĐ().split("/");
			if(datekhachangvn[1].equals("9") && datekhachangvn[2].equals("2013"))
			{
					System.out.println(arrkhanhhangvn.get(i).toString());
			 }
		}
	}
	}
}

