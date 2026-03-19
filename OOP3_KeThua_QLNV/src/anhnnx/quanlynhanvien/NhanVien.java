package anhnnx.quanlynhanvien;

public class NhanVien {
	//thuộc tính
	private String maNV;
	private String hoTen;
	private double luongCoBan;
	//hàm tạo
	public NhanVien () {
		
	}
	
	public NhanVien (String maNhanVien, String tenNhanVien, double luongCoban) {
		maNV = maNhanVien;
		hoTen = tenNhanVien;
		this.luongCoBan = luongCoBan;
	}
	public double tinhLuong () {
		return luongCoBan;
	}

	@Override
	public String toString() {
		return "NhanVien [maNV=" + maNV + ", hoTen=" + hoTen + ", luongCoBan=" + luongCoBan + "]";
	}
	public void hienThiThongTin () {
		System.out.println ("Mã NV: " + maNV);
		System.out.println ("Họ Tên: " + hoTen);
		System.out.println ("Lương cơ bản: " + luongCoBan);
	}
}
