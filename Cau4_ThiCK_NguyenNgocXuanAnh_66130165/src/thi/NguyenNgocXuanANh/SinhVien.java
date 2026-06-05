package thi.NguyenNgocXuanANh;

public class SinhVien {
	private String hoten;
	private double diem;
	public SinhVien() {
		super();
		// TODO Auto-generated constructor stub
	}
	public SinhVien(String hoten, double diem) {
		super();
		this.hoten = hoten;
		this.diem = diem;
	}
	public String getHoten() {
		return hoten;
	}
	public void setHoten(String hoten) {
		this.hoten = hoten;
	}
	public double getDiem() {
		return diem;
	}
	public void setDiem(double diem) {
		this.diem = diem;
	}
	@Override
	public String toString() {
		return "SinhVien [Ho Ten: " + hoten + " - Diem: " + diem + "]";
	}
	
	
}
