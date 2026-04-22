package NguyenNgocXuanAnh;

public class ktThucPham {
	private String maHang;
	private String tenHang;
	private double dongia;
	private int NgaySanXuat;
	private int NgayHetHan;
	public ktThucPham() {
		super();
		// TODO Auto-generated constructor stub
	}
	public ktThucPham(String maHang, String tenHang, double dongia, int NgaySanXuat, int NgayHetHan) {
		super();
		this.maHang = maHang;
		this.tenHang = tenHang;
		this.dongia = dongia;
		this.NgaySanXuat = NgaySanXuat;
		this.NgayHetHan = NgayHetHan;
	}
	public String getMaHang() {
		return maHang;
	}
	public String getTenHang() {
		return tenHang;
	}
	
	public void setTenHang(String tenHang) {
		if (tenHang == null)
			System.out.println("Khong ton tai");
		else 
			this.tenHang = tenHang;	
	}
	public double getDonGia (double dongia) {
		return dongia;
	}
	public void setDonGia (double dongia) {
		if (dongia < 0)
			System.out.println("Khong hop le");
		else 
			this.dongia = dongia;
	}
	public int getNgaySanXuat() {
		return NgaySanXuat;
	}
	public void setNgaySanXuat(int ngaySanXuat) {
		if (ngaySanXuat < 0)
			System.out.println("Khong hop le");
		else 
			NgaySanXuat = ngaySanXuat;
	}
	public int getNgayHetHan() {
		return NgayHetHan;
	}
	public void setNgayHetHan(int ngayHetHan) {
		
		if (ngayHetHan > NgaySanXuat)
			System.out.println("Khong hop le");
		else 
			NgayHetHan = ngayHetHan;
	}
	public short kt (int ngayKiemTra){
		if (ngayKiemTra == NgayHetHan)
			return 1;
		else 
			return 0;
	}
	
	
	
}

