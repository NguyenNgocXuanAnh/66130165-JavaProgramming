package thi.NguyenNgocXuanANh;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.time.LocalDate;
import java.util.ArrayList;



public class Main {

	public static void main(String[] args) throws IOException {
		FileReader fr = new FileReader("diem.txt");
		BufferedReader br = new BufferedReader(fr);
		ArrayList <SinhVien> ten = new ArrayList<>();
		while (true) {
			String line = br.readLine();
			if (line==null) {
				break;
			}
			String s[]=line.split(",");
			SinhVien temp = new SinhVien(s[0], Double.parseDouble(s[1]));
			ten.add(temp);
		}	
		for (SinhVien x : ten) {
			System.out.println(x.toString());
		}
		SinhVien tmp = ten.get(0);
		for (int i=0; i<ten.size(); i++) {
//			double temp = ten.get(0).getDiem();
			if (tmp.getDiem() > ten.get(i).getDiem())
				tmp = ten.get(i);
			
		}
		System.out.println("----------------------");
		System.out.println("Sinh vien co diem thap nhat la: "+ tmp);
		
	}

}
