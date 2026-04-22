package NguyenNgocXuanAnh;

import java.text.NumberFormat;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.Locale;

public class ktThucPham {
	private int maHang;
	private String tenHang;
	private double dongia;
	private Date NgaySanXuat, NgayHetHan;
	public ktThucPham() {
		super();
		// TODO Auto-generated constructor stub
	}
	public ktThucPham(int maHang, String tenHang, double dongia, Date NgaySanXuat, Date NgayHetHan) {
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
	public void setNgaySanXuat(Date ngaySanXuat) {
		if (ngaySanXuat < 0)
			System.out.println("Khong hop le");
		else 
			NgaySanXuat = ngaySanXuat;
	}
	public int getNgayHetHan() {
		return NgayHetHan;
	}
	public void setNgayHetHan(Date ngayHetHan) {
		
		if (ngayHetHan > NgaySanXuat)
			System.out.println("Khong hop le");
		else 
			NgayHetHan = ngayHetHan;
	}
	public short kt (Date ngayKiemTra){
		if (ngayKiemTra == NgayHetHan)
			return 1;
		else 
			return 0;
	}
	@Override
	public String toString() {
		return "ktThucPham [maHang=" + maHang + ", tenHang=" + tenHang + ", dongia=" + dongia + ", NgaySanXuat="
				+ NgaySanXuat + ", NgayHetHan=" + NgayHetHan + "]";
	}
	
	
	
}

