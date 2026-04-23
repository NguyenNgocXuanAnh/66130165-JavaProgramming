package thigk2.NguyenNgocXuanAnh;

import java.util.Scanner;
import java.util.ArrayList;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		SinhVien sv1 = new SinhVien ();
		//hard-code
		String msSV1 = "66130165";
		sv1.setMssv(msSV1);
		
		String tenSV1 = "Nguyễn Ngọc Xuân Ánh";
		sv1.setHoTen(tenSV1);
		
		int nsSV1 = 2006;
		sv1.setNamSinh(nsSV1);
		
		String lopSV1 = "66.cntt-3";
		sv1.setLopHS(lopSV1);
		
		SinhVien sv2 = new SinhVien ("66131266","Võ Trần Gia Hưng", 2006, "66.cntt-3");
		SinhVien sv3 = new SinhVien ("66134543","Huỳnh Tấn Vũ", 2006, "66.cntt-3");
		
		//in ra màn hình
		System.out.println(sv1.toString());
		System.out.println(sv2.toString());
		System.out.println(sv3.toString());
		
		// NHẬP DỮ LIỆU TỪ BÀN PHÍM
		Scanner banPhim = new Scanner (System.in);
		// Nhập dữ liệu sv thứ 3
		SinhVien sv4 = new SinhVien ();
			 
		// hỏi user nhập vào 
		System.out.print("\nMời nhập mssv của của học sinh thứ 4: "); //in ra hd và đợi
		String msSV4 = banPhim.nextLine();
		//gói vào biến sv3
		sv4.setMssv(msSV4);
		
		System.out.print("\nMời nhập tên của của học sinh thứ 4: "); //in ra hd và đợi
		String tenSV4 = banPhim.nextLine();
		//gói vào biến sv3
		sv4.setHoTen(tenSV4);
		
		System.out.print("Mời nhập năm sinh của học sinh thứ 4: ");
		int nsSV4 = banPhim.nextInt();
		sv4.setNamSinh(nsSV4);
		banPhim.nextLine();
			
		System.out.print("Mời nhập lớp của học sinh thứ 4: ");
		String lopSV4 = banPhim.nextLine();
		sv4.setLopHS(lopSV4);
		
		//in ra màn hình lại 
        System.out.println("\n--- DANH SÁCH SINH VIÊN ---");
        System.out.println(sv1);
        System.out.println(sv2);
        System.out.println(sv3);
        System.out.println(sv4);

	}

}
