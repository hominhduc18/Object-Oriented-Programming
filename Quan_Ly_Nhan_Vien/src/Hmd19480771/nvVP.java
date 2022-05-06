package Hmd19480771;

import java.util.Scanner;
public class nvVP extends NhanVien{
   private int SoLopBoiDuong;
   private int SoGioLaoDongCongIch;

   public nvVP() {
   }
   public int getSoLopBoiDuong() {
      return SoLopBoiDuong;
   }
   public void setSoLopBoiDuong(int soLopBoiDuong) {
      SoLopBoiDuong = soLopBoiDuong;
   }
   public int getSoGioLaoDongCongIch() {
      return SoGioLaoDongCongIch;
   }
   public void setSoGioLaoDongCongIch(int soGioLaoDongCongIch) {
      SoGioLaoDongCongIch = soGioLaoDongCongIch;
      SoGioLaoDongCongIch = soGioLaoDongCongIch;
      }
      public void nhapNV() {
         super.nhapNV();;
         Scanner sc = new Scanner(System.in);
         System.out.println("Nhập số lớp bồi dưỡng");
         setSoLopBoiDuong(sc.nextInt());
         System.out.println("Nhập số giờ lao động công ích");
         setSoGioLaoDongCongIch(sc.nextInt());
      }
      public void xuatNV (){
         super.xuatNV();
         System.out.println("Số  lớp bồi dưỡng: "+getSoLopBoiDuong());
         System.out.println("Số giờ lao động công ích: "+getSoGioLaoDongCongIch());
      }
}
