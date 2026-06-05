package NguyenNgocXuanAnh;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		FileReader fr = new FileReader("DanhSach.txt");
		BufferedReader br = new BufferedReader(fr);
		ArrayList <XeVinfast> ten = new ArrayList<>();
		while (true) {
			String line = br.readLine();
			if (line==null) {
				break;
			}
			String s[]=line.split(" ");
			XeVinfast temp = new XeVinfast(s[0], Integer.parseInt(s[1]), LocalDate.parse(s[2]), Double.parseDouble(s[3]), s[4]);
			ten.add(temp);
		}	
		for (XeVinfast x : ten) {
			x.Xuat();
		}
		//sap xep
		
		for (int i = 1; i < ten.size(); i++) {
		    XeVinfast k = ten.get(i);
		    int j = i - 1;

		    while (j >= 0 && ten.get(j).TinhlanBanh() > k.TinhlanBanh()) {
		        ten.set(j + 1, ten.get(j));
		        j--;
		    }

		    ten.set(j + 1, k);
		}
		System.out.println("------------THONG TIN XE SAU KHI SAP XEP----------");
		for (XeVinfast x : ten) {
			x.Xuat();
		}
		
		System.out.print("Nhap vi tri chen: ");
		int p = 0;
		Scanner sc = new Scanner(System.in);
		p = sc.nextInt();
		XeVinfast xhm = new XeVinfast();
		xhm.Nhap();
		ten.add(p, xhm);
		System.out.println("------------THONG TIN XE SAU KHI CHEN THEM----------");

		for (XeVinfast x : ten) {
			x.Xuat();
		}
		sc.nextLine();
		System.out.print("Nhap dong xe can xoa: ");
		String x =sc.nextLine();
		for (int i = ten.size() - 1; i >= 0; i--) {
		    if (ten.get(i).getDongxe().equalsIgnoreCase(x)) {
		        ten.remove(i);
		    }
		}
		System.out.println("------------THONG TIN XE SAU KHI XOA----------");

		for (XeVinfast Z : ten) {
			Z.Xuat();
		}
	}



}
