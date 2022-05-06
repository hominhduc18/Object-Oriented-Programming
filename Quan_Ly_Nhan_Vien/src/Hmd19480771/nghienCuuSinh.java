package Hmd19480771;
import java.util.Scanner;
public class nghienCuuSinh extends NhanVien{
   private int SoDeTai;
   private int SoBaiBaoKhoaHoc;
   public nghienCuuSinh() {
   }
   public int getSoDeTai() {
      return SoDeTai;
   }
   public void setSoDeTai(int soDeTai) {
      SoDeTai = soDeTai;
   }
   public int getSoBaiBaoKhoaHoc() {
      return SoBaiBaoKhoaHoc;
   }

   public void setSoBaiBaoKhoaHoc(int soBaiBaoKhoaHoc) {
      SoBaiBaoKhoaHoc = soBaiBaoKhoaHoc;
   }
   public void nhapNV() {
      super.nhapNV();
      Scanner sc = new Scanner(System.in);
      System.out.println("Nhập số đề tài");
      setSoDeTai(sc.nextInt());
      System.out.println("Nhập số bài báo khoa học");
      setSoBaiBaoKhoaHoc(sc.nextInt());
   }
   public void xuatNV() {
      super.xuatNV();;
      System.out.println("Số đề tài: "+getSoDeTai());
      System.out.println("Số bài báo khoa học: "+getSoBaiBaoKhoaHoc());
   }
   @Override
   public boolean laoDongTienTien() {
      if(super.laoDongTienTien() && getSoDeTai()>=1 && getSoBaiBaoKhoaHoc()>=2){
         return true;
      }
      return false;
   }
}
