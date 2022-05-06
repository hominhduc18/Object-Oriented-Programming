package HMDuc19480771;

import java.util.Scanner;
import java.util.ArrayList;
public class QLNV {
	Scanner sc=new Scanner(System.in);
	ArrayList<NhanVien>arrnhanvien=new ArrayList<>();
	public void nhanvienv(NhanVien nv)
	{
		nv.nhap();
		arrnhanvien.add(nv);
	}
	public void nhapds()
	{
		int chon=0;
		System.out.println("\t\t----------\t menu \t----------------");
		System.out.println("1.Nhập giảng viên:");
		System.out.println("2.nhập nghiên cứu sinh");
		System.out.println("3.nhập nhân viên văn phòng");
		System.out.println("4.------------kết thúc--------------------");
		chon=new Scanner(System.in).nextInt();
		switch(chon)
		{
		case 1:
		{
			nhanvienv(new giangVien());
			break;
		}
		case 2:
		{
			nhanvienv(new NghienCuuVien());
			break;
		}
		case 3:
		{
			nhanvienv(new NhanVienVanPhong());
			break;
		}
		}
	}
	public void xuatds()
	{
		System.out.println("Danh sách lao động tien tiến");
		for(int i=0;i<arrnhanvien.size();i++)
		{
			if(arrnhanvien.get(i).LĐTT())
			{
				arrnhanvien.get(i).xuat();
				
			}
		}

	}
	
	

}
