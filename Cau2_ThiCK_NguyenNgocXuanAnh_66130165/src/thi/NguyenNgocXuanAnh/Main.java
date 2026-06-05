package thi.NguyenNgocXuanAnh;

import java.util.ArrayList;

public class Main {

	public static void main(String[] args) {
		HinhTron ht1 = new HinhTron (2.7);
		HinhChuNhat hcn1 = new HinhChuNhat(3.3,1.3);
		ArrayList <HinhHoc> ten = new ArrayList<>();
		ten.add(ht1);
		ten.add(hcn1);
		for (HinhHoc x : ten) {
			System.out.println(x.getTenHinh());
		}

	}

}
