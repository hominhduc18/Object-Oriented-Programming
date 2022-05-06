package Hmd19480771;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;

public class NhanVien {
   protected String MaNV;
   protected String Hoten;
   protected Date Ngaysinh;

   public NhanVien() {
   }

   public NhanVien(String maNV, String hoten, Date ngaysinh) {
      MaNV = maNV;
      Hoten = hoten;
      Ngaysinh = ngaysinh;
   }

   public String getMaNV() {
      return MaNV;
   }

   public void setMaNV(String maNV) {
      MaNV = maNV;
   }

   public String getHoten() {
      return Hoten;
   }

   public void setHoten(String hoten) {
      Hoten = hoten;
   }

   public Date getNgaysinh() {
      return Ngaysinh;
   }

   public boolean setNgaysinh(String ngaysinh) {
      SimpleDateFormat SDF = new SimpleDateFormat("dd/MM/yyyy");
      try {
         this.Ngaysinh = SDF.parse(ngaysinh);
         return true;
      }catch (Exception ex){
         System.out.println("Nhập lỗi ngày sinh !! Nhập lại");
         return false;
      }
   }

   public void nhapNV(){
      Scanner sc = new Scanner(System.in);
      System.out.println("Nhập mã nhân viên");
      setMaNV(sc.nextLine());
      System.out.println("Nhập họ tên");
      setHoten(sc.nextLine());
      boolean check=false;
      while(!check)
      {
         System.out.println("Nhập ngày sinh");
         check = setNgaysinh(sc.nextLine());
      }
   }
   public void xuatNV(){
      SimpleDateFormat SDF = new SimpleDateFormat("dd/MM/yyyy");
      System.out.println("Mã nhân viên: "+this.getMaNV());
      System.out.println("Họ tên: "+this.getHoten());
      System.out.println("Ngày sinh: "+SDF.format(this.getNgaysinh()));
   }
   public boolean laoDongTienTien(){
      return true;
   }
}

