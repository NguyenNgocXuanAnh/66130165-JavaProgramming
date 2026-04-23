package thigk2.NguyenNgocXuanAnh;

public class SinhVien {
	private String mssv;
	private String HoTen;
    private int namsinh;
    private String lopHS;
	
    //khởi tạop 0 tham số
	public SinhVien() {
		super();
		// TODO Auto-generated constructor stub
	}

	//khởi tạo có tham số

	public SinhVien(String mssv, String hoTen, int namsinh, String lopHS) {
		super();
		this.mssv = mssv;
		HoTen = hoTen;
		this.namsinh = namsinh;
		this.lopHS = lopHS;
	}

	//các getter và setter

	public String getMssv() {
		return mssv;
	}


	public void setMssv(String mssv) {
		this.mssv = mssv;
	}



	public String getHoTen() {
		return HoTen;
	}



	public void setHoTen(String hoTen) {
		HoTen = hoTen;
	}



	public int getNamSinh() {
		return namsinh; 
	}



	public void setNamSinh(int namsinh) {
		this.namsinh = namsinh;
	}



	public String getLopHS() {
		return lopHS;
	}



	public void setLopHS(String lopHS) {
		this.lopHS = lopHS;
	}



	@Override
	public String toString() {
		String chuoiXuat;
		chuoiXuat = "\nMã số sinh viên: " + mssv;
		chuoiXuat = "\nHọ và Tên: " + HoTen;
		chuoiXuat = chuoiXuat + "\nNăm sinh: " + namsinh;
		chuoiXuat = chuoiXuat + "\nLớp HS: " + lopHS;

		return chuoiXuat;
	}
	
}
