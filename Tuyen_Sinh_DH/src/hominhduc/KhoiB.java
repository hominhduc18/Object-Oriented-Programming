package hominhduc;

import java.util.Scanner;

public class KhoiB extends Thisinh{
	private double diemToan;
	private double diemSinh;
	private double diemHoa;

	public KhoiB() {
	}

	public KhoiB(String soBaoDanh, String hoTen, String diaChi, double muUuTien, double diemToan,
		double diemSinh, double diemHoa) {
		super(soBaoDanh, hoTen, diaChi, muUuTien);
		this.diemToan = diemToan;
		this.diemSinh = diemSinh;
		this.diemHoa = diemHoa;
	}

	public double getDiemToan() {
		return diemToan;
	}

	public boolean setDiemToan(double diemToan) {
		if(diemToan>=0 && diemToan<=10){
			this.diemToan = diemToan;
			return true;
		}else {
			System.out.println("Số điểm được tính từ (0-10)!!");
			return false;
		}
	}

	public double getDiemSinh() {
		return diemSinh;
	}
	public boolean setDiemSinh(double diemSinh) {
		if(diemSinh>=0 && diemSinh<=10){
			this.diemSinh = diemSinh;
			return true;
		}else {
			System.out.println("Số điểm được tính từ (0-10)!!");
			return false;
		}
	}

	public double getDiemHoa() {
		return diemHoa;
	}

	public boolean setDiemHoa(double diemHoa) {
		if(diemHoa>=0 && diemHoa<=10){
			this.diemHoa = diemHoa;
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
			System.out.print("Nhập điểm toán: ");
			double x = Double.parseDouble(sc.nextLine());
			boolean check = setDiemToan(x);
			if(check){
				break;
			}
		}
		while (1==1){
			System.out.print("Nhập điểm lý: ");
			double x = Double.parseDouble(sc.nextLine());
			boolean check = setDiemSinh(x);
			if(check){
				break;
			}
		}while (1==1){
			System.out.print("Nhập điểm hóa: ");
			double x = Double.parseDouble(sc.nextLine());
			boolean check = setDiemHoa(x);
			if(check){
				break;
			}
		}
	}

	@Override
	public void printThisinh() {
		System.out.print("\tThí sinh khối B\n");
		super.printThisinh();
		System.out.println("Điểm toán: "+this.diemToan+" Điểm lý: "+this.diemSinh+" Điểm hóa: "+this.diemHoa);
	}
}
