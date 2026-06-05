package thi.NguyenNgocXuanAnh;

public class HinhTron implements HinhHoc {

	private double bk;

	public HinhTron() {

	}

	public HinhTron(double bk) {
		this.bk = bk;
	}
	

	public double getBk() {
		return bk;
	}

	public void setBk(double bk) {
		this.bk = bk;
	}

	@Override
	public double tinhDienTich() {
		return bk*bk*3.14;
	}

	@Override
	public double tinhChuVi() {
		return bk*2*3.14;
	}

	@Override
	public String getTenHinh() {
		String s = "Hinh Tron: "+ "Dien Tich: " +tinhDienTich() + ", " + "Chu Vi: " + tinhChuVi();
		return s;
	}
	
}
