package thi.NguyenNgocXuanAnh;

import java.util.ArrayList;

public class Main {

	public static void main(String[] args) {
		ArrayList<SanPham> ten = new ArrayList<>();
		SanPham sp1 = new SanPham("SP01","Kem danh rang",45000);
		ten.add(sp1);
		SanPham sp2 = new SanPham("SP02","Ban chai danh rang",35000);
		ten.add(sp2);
		SanPham sp3 = new SanPham("SP03","Nuoc suc mieng",150000);
		ten.add(sp3);
		for (SanPham x : ten) {
			System.out.println(x.toString());
		}
		System.out.println("--San pham co gia tu minGia(36000) den maxGia(100000)--");
		for (int i=0; i< ten.size(); i++) {
			if ( ten.get(i).getGia()>36000 && ten.get(i).getGia()<100000 )
				System.out.println(ten.get(i).toString());
		}
		

	}

}
