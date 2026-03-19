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
	
}
