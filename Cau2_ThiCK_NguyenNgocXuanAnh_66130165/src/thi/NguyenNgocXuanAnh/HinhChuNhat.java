package thi.NguyenNgocXuanAnh;

public class HinhChuNhat implements HinhHoc{
	private double cdai;
	private double crong;
	
	public HinhChuNhat() {

	}
	public HinhChuNhat(double cdai, double crong) {
		this.cdai = cdai;
		this.crong = crong;
	}
	
	public double getCdai() {
		return cdai;
	}
	public void setCdai(double cdai) {
		this.cdai = cdai;
	}
	public double getCrong() {
		return crong;
	}
	public void setCrong(double crong) {
		this.crong = crong;
	}
	@Override
	public double tinhDienTich() {
		return cdai*crong;
	}
	@Override
	public double tinhChuVi() {
		return (cdai+crong)*2;
	}
	@Override
	public String getTenHinh() {
		String s = "Hinh Chu Nhat: "+ "Dien Tich: " +tinhDienTich() + ", " + "Chu Vi: " + tinhChuVi();
		return s;
	}
	
	
	
	
}
