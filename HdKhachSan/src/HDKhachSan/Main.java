package HDKhachSan;
import java.util.ArrayList;
import java.util.Scanner;
public class Main {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		ArrayList<HoaDontheoGio> arrhoadontheogio=new ArrayList<HoaDontheoGio>();
		ArrayList<soNgayThue>  arrsongaythue=new ArrayList<soNgayThue>();
		int chon;
		int tonggio=0;
		int tongngay=0;
		System.out.println("nhập đối tương: ");
		chon=new Scanner(System.in).nextInt();
		switch(chon)
		{
		case 1:
		{
			System.out.println("nhập hóa đơn theo giờ: ");
			HoaDontheoGio hoadontheogio=new HoaDontheoGio();
			hoadontheogio.nhap();
			arrhoadontheogio.add(hoadontheogio);
			for(int i=0;i<arrhoadontheogio.size();i++)
			{
				System.out.printf("Hóa đơn theo giờ: %d",i+1);
				System.out.printf(arrhoadontheogio.get(i).toString());
			}
			for (int i=0;i<arrhoadontheogio.size();i++)
			{
				tonggio+=arrhoadontheogio.get(i).thanhtien();
				System.out.println("tính tiền :"+tonggio);
			}
			break;
		}
		case 2:
		{
		System.out.println("Hóa đơn theo ngày: ");
		soNgayThue songaythue=new soNgayThue();
		songaythue.nhap();
		arrsongaythue.add(songaythue);
		for(int i=0;i<arrsongaythue.size();i++)
		{
			System.out.printf("Hóa đơn theo ngày: %d",i+1);
			System.out.printf(arrsongaythue.get(i).toString());
		}
		for(int i=0;i<arrsongaythue.size();i++)
		{
			tongngay+=arrsongaythue.get(i).thanhtien();
			System.out.println("tính tiền :"+tongngay);
		}
		break;
	}
	}
	}
}
