package thigk2.NguyenNgocXuanAnh;

import java.util.Scanner;
import java.util.ArrayList;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner bp = new Scanner(System.in);
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
		
	}

}
