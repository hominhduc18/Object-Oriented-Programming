package hominhduc;

import java.util.Scanner;

public class KhoiC extends Thisinh{
	private double diemVan;
	private double diemSu;
	private double diemDia;

	public KhoiC() {
	}

	public KhoiC(String soBaoDanh, String hoTen, String diaChi, double muUuTien, double diemVan,
		double diemSu, double diemDia) {
		super(soBaoDanh, hoTen, diaChi, muUuTien);
		this.diemVan = diemVan;
		this.diemSu = diemSu;
		this.diemDia = diemDia;
	}

	public double getDiemVan() {
		return diemVan;
	}

	public boolean setDiemVan(double diemVan) {
		if(diemVan>=0 && diemVan<=10){
			this.diemVan = diemVan;
			return true;
		}else {
			System.out.println("Số điểm được tính từ (0-10)!!");
			return false;
		}
	}

	public double getDiemSu() {
		return diemSu;
	}
	public boolean setDiemSu(double diemSu) {
		if(diemSu>=0 && diemSu<=10){
			this.diemSu = diemSu;
			return true;
		}else {
			System.out.println("Số điểm được tính từ (0-10)!!");
			return false;
		}
	}

	public double getDiemDia() {
		return diemDia;
	}

	public boolean setdiemDia(double diemDia) {
		if(diemDia>=0 && diemDia<=10){
			this.diemDia = diemDia;
			return true;
		}else {
			System.out.println("Số điểm được tính từ (0-10)!!");
			return false;
		}
	}

	// Hàm chức năng
	@Override
	public void inputThisinh() {
		super.inputThisinh();
		Scanner sc = new Scanner(System.in);
		while (1==1){
			System.out.print("Nhập điểm văn: ");
			double x = Double.parseDouble(sc.nextLine());
			boolean check = setDiemVan(x);
			if(check){
				break;
			}
		}
		while (1==1){
			System.out.print("Nhập điểm sử: ");
			double x = Double.parseDouble(sc.nextLine());
			boolean check = setDiemSu(x);
			if(check){
				break;
			}
		}while (1==1){
			System.out.print("Nhập điểm địa: ");
			double x = Double.parseDouble(sc.nextLine());
			boolean check = setdiemDia(x);
			if(check){
				break;
			}
		}
	}

	@Override
	public void printThisinh() {
		System.out.print("Thí sinh khối C\n");
		super.printThisinh();
		System.out.println("Điểm toán: "+this.diemVan+" Điểm lý: "+this.diemSu+" Điểm hóa: "+this.diemDia);
	}
}
