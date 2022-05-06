package hominhduc;

import java.util.ArrayList;
import java.util.Scanner;

public class Tuyensinh {
	ArrayList<Thisinh> thisinhs = new ArrayList<Thisinh>();

	public Tuyensinh() {
	}

	public ArrayList<Thisinh> getThisinhs() {
		return thisinhs;
	}

	public void setThisinhs(ArrayList<Thisinh> thisinhs) {
		this.thisinhs = thisinhs;
	}
	public void menu(){
		while (1==1)
		{
			System.out.println("\t1. Thêm nhiều thí sinh vào danh sách");
			System.out.println("\t2. Xuất danh sách thí sinh");
			System.out.println("\t3. Tìm kiếm thí sinh");
			System.out.println("\t4. Kết thút");
			int choice = new Scanner(System.in).nextInt();
			switch (choice){
				case 1:
				{
					addThisinh();
					break;
				}
				case 2:
				{
					printThisinhs();
					break;
				}
				case 3:
				{
					findThisinh();
					break;
				}
				case 4:
				{
					System.out.println("Kết thúc chương trình");
					System.exit(0);
					break;
				}
			}
		}

	}
	private void addThisinh(){
		Scanner sc = new Scanner(System.in);
		System.out.print("\tNhập số lượng thí sinh cần thêm: ");
		int n = sc.nextInt();
		System.out.println("\t1. Thêm sinh viên khối A");
		System.out.println("\t2. Thêm sinh viên khối B");
		System.out.println("\t3. Thêm sinh viên khối C");
		for (int i = 0; i < n; i++) {
			System.out.print("\t\tNhập khối thí sinh: ");
			int choice = sc.nextInt();
			switch (choice){
				case 1:{
					KhoiA temp = new KhoiA();
					temp.inputThisinh();
					thisinhs.add(temp);
					break;
				}
				case 2:{
					KhoiB temp = new KhoiB();
					temp.inputThisinh();
					thisinhs.add(temp);
					break;
				}
				case 3:{
					KhoiC temp = new KhoiC();
					temp.inputThisinh();
					thisinhs.add(temp);
					break;
				}
			}
		}
	}
	private void printThisinhs(){
		System.out.println("\t\t====In danh sách sinh viên====");
		for (int i = 0; i < thisinhs.size(); i++) {
			thisinhs.get(i).printThisinh();
		}
	}
	private void findThisinh(){
		System.out.print("\t\tNhập số báo danh cần tìm: ");
		String temp = new Scanner(System.in).nextLine();
		for (int i = 0; i < thisinhs.size(); i++) {
			String temp2 = thisinhs.get(i).getSoBaoDanh();
			if(temp.compareTo(temp2)==0){
				System.out.println("\tTìm thấy thí sinh: "+thisinhs.get(i).getSoBaoDanh());
				thisinhs.get(i).printThisinh();
			}
		}
	}
}
