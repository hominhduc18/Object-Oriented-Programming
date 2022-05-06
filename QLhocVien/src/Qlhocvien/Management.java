package Qlhocvien;
import java.util.ArrayList;
import java.util.Scanner;
import java.util.Collections;
import java.util.Comparator;
public class Management {
		public static void main(String[] args) {
			int luachon, k = 0;
			String doiTuong, xoa;
			Scanner p = new Scanner(System.in);
			ArrayList<Person> list  = new ArrayList<Person>();
			Person o = new Person();
			Strudent s;
			Employee e;
			Customer c;
			
			do {
				o.menu();
				System.out.println("Nhap vao lua chon: ");
				luachon = Integer.parseInt(p.nextLine());
				switch(luachon) {
				case 1:
					System.out.print("Nhap vao doi tuong muon luu: ");
					doiTuong = p.nextLine();
					if(doiTuong.equals("S")) {
						s = new Strudent();
						s.nhap();
						list.add(s);
					}
					
					if(doiTuong.equals("E")) {
						e = new Employee();
						e.nhap();
						list.add(e);
					}
					
					if(doiTuong.equals("C")) {
						c = new Customer();
						c.nhap();
						list.add(c);
					}
					break;
				case 2:
					System.out.print("Nhap vao ten nguoi can xoa: ");
					xoa = p.nextLine();
					for (int i = 0; i < list.size(); i++) {
						if(xoa.equals(list.get(i).getHoTen())) {
							list.remove(i);
							System.out.println("Da xoa thanh cong");
							k++;
						}
					}
					if( k == 0)
						System.err.println("Xoa khong thanh cong");
					break;
				case 3:
					Collections.sort(list, new Comparator<Person>(){ 
					@Override
					public int compare(Person o1, Person o2) {
						return o1.getHoTen().compareTo(o2.getHoTen());
					}
					});
					System.out.println("Danh sach sau khi sap xep la");
					for (int i = 0; i < list.size(); i++) {
						System.out.println(list.get(i).toString());
					}
					break;
				case 4:
					System.out.println("Danh sach quan ly la ");
					for (int i = 0; i < list.size(); i++) {
						System.out.println(list.get(i).toString());
					}
					break;
				case 5:
					System.out.println("Da thoat chuong trinh");
					break;
				default: System.err.println("Loi nhap lua chon!!!");
				}
			}while(luachon != 5);
		}
	}

