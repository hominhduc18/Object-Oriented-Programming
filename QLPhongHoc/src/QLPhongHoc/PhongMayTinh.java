package QLPhongHoc;

public class PhongMayTinh extends PhongHoc{
	protected int soMayTinh;

	public int getSoMayTinh() {
		return soMayTinh;
	}

	public void setSoMayTinh(int soMayTinh) {
		this.soMayTinh = soMayTinh;
	}

	public PhongMayTinh(int maP, int dayNha, int dienTich, int soBongDen, int soMayTinh) {
		super(maP, dayNha, dienTich, soBongDen);
		this.soMayTinh = soMayTinh;
	}

	public PhongMayTinh() {
		super();
	}

	@Override
	public String toString() {
		return "PhongMayTinh [soMayTinh=" + soMayTinh + "]";
	}
	public void nhap()
	{
		super.nhap();
		System.out.println();
	}

}
