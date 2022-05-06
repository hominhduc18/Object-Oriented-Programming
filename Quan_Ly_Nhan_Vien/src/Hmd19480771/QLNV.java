package Hmd19480771;
import java.util.ArrayList;
import java.util.Scanner;

public class QLNV {
   ArrayList<NhanVien> Danhsach = new ArrayList<NhanVien>();
   public void setNhanVien(NhanVien temp){
      temp.inputNhanVien();
      Danhsach.add(temp);
   }
   public void Nhap(){
      int choice=0;
      while (choice!=4){
         System.out.println("\t\t====\tMENU\t====");
         System.out.println("1. Nhập thông tin giảng viên");
         System.out.println("2. Nhập thông tin nghiên cứu viên");
         System.out.println("3. Nhập thông tin nhân viên văn phòng");
         System.out.println("4. Kết thúc");
         System.out.println("NHẬP LỰA CHỌN");
         choice = new Scanner(System.in).nextInt();
         switch (choice){
            case 1:{
               setNhanVien(new giangVien());
               break;
            }
            case 2:{
               setNhanVien(new nghienCuuSinh());
               break;
               }
               case 3:{
                  setNhanVien(new nvVP());
                  break;
               }
            }
         }
      }
      public void Xuat(){
         System.out.println("\t______ LAO ĐỘNG TIÊN TIẾN ______");
         for (int i = 0; i < Danhsach.size(); i++) {
            if(Danhsach.get(i).laoDongTienTien()){
               Danhsach.get(i).xuatNV();;
            }
         }
      }
      public static void main(String[] args) {
         QLNV a = new QLNV();
         a.Nhap();
         a.Xuat();
      }
   }

