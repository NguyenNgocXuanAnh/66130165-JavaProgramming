package thi.NguyenNgocXuanAnh;

public class SanPham {
	private String maSP;
	private String tenSP;
	private double gia;
	public SanPham() {
		super();
		// TODO Auto-generated constructor stub
	}
	public SanPham(String maSP, String tenSP, double gia) {
		super();
		this.maSP = maSP;
		this.tenSP = tenSP;
		this.gia = gia;
	}
	public String getMaSP() {
		return maSP;
	}
	public void setMaSP(String maSP) {
		this.maSP = maSP;
	}
	public String getTenSP() {
		return tenSP;
	}
	public void setTenSP(String tenSP) {
		this.tenSP = tenSP;
	}
	public double getGia() {
		return gia;
	}
	public void setGia(double gia) {
		this.gia = gia;
	}
	@Override
	public String toString() {
		return "SanPham [maSP=" + maSP + ", tenSP=" + tenSP + ", gia=" + gia + "]";
	}
	
	
}
