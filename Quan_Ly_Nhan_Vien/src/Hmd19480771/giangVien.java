package Hmd19480771;

import java.util.Date;
import java.util.Scanner;

public class giangVien extends NhanVien{
   private int SoTietDay;
   private int SoDeTaiKhoaLuan;

   public giangVien() {
   }

   public int getSoTietDay() {
      return SoTietDay;
   }

   public void setSoTietDay(int soTietDay) {
      SoTietDay = soTietDay;
   }

   public int getSoDeTaiKhoaLuan() {
      return SoDeTaiKhoaLuan;
   }

   public void setSoDeTaiKhoaLuan(int soDeTaiKhoaLuan) {
      SoDeTaiKhoaLuan = soDeTaiKhoaLuan;
   }

   public void nhapNV() {
      super.nhapNV();
      Scanner sc = new Scanner(System.in);
      System.out.println("Nhập số tiết dạy");
      setSoTietDay(sc.nextInt());
      System.out.println("Nhập số đề tài");
      setSoDeTaiKhoaLuan(sc.nextInt());
   }
   public void xuatNV() {
      super.xuatNV();
      System.out.println("Số tiết dạy: "+getSoTietDay());
      System.out.println("Số đề tài: "+getSoDeTaiKhoaLuan());
   }
   public boolean laoDongTienTien() {
      if(super.laoDongTienTien() && getSoTietDay()>=300 && getSoDeTaiKhoaLuan()>=5){
         return true;
      }
      return false;
   }
}


