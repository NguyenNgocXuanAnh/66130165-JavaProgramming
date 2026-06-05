package thigk2.NguyenNgocXuanAnh;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		ArrayList<SinhVien> ds = new ArrayList<SinhVien>();
		
		SinhVien sv1 = new SinhVien();
		sv1.setMaSV("SV01");
		sv1.setHoTen("Huỳnh Huy Hoàng");
		sv1.setNamSinh(2006);
		sv1.setDiemTB(10.0);
		
		SinhVien sv2 = new SinhVien();
		sv2.setMaSV("SV02");
		sv2.setHoTen("Văn Mai Thanh");
		sv2.setNamSinh(2005);
		sv2.setDiemTB(7.2);
		SinhVien sv3 = new SinhVien();
		sv3.setMaSV("SV03");
		sv3.setHoTen("Nguyen Van A");
		sv3.setNamSinh(2004);
		sv3.setDiemTB(4.5);
		
		ds.add(sv1);
		ds.add(sv2);
		ds.add(sv3);
		
		System.out.println("Danh sach ban dau:");
		for (SinhVien sv : ds) {
			System.out.println(sv);
			System.out.println("-----");
		}
	Scanner sc = new Scanner(System.in);
	
	SinhVien svMoi = new SinhVien();
	
	System.out.print("Nhap ma SV: ");
	svMoi.setMaSV(sc.nextLine());
	
	System.out.print("Nhap ho ten: ");
	svMoi.setHoTen(sc.nextLine());
	
	System.out.print("Nhap nam sinh: ");
	svMoi.setNamSinh(sc.nextInt());
	
	System.out.print("Nhap diem TB: ");
	svMoi.setDiemTB(sc.nextDouble());
	
	ds.add(svMoi);
	
	System.out.println("\nDanh sach sau khi them:");
	for (SinhVien sv : ds) {
		System.out.println(sv);
		System.out.println("-----");
	}
	
	System.out.println("\nSinh vien lon hon 20 tuoi:");
	for (SinhVien sv : ds) {
		if (sv.tinhTuoi() > 20) {
			System.out.println(sv);
			System.out.println("-----");
		}
	}
}
}