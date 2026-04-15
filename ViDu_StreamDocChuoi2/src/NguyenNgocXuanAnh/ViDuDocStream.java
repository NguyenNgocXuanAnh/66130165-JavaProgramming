package NguyenNgocXuanAnh;

import java.io.InputStreamReader;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.FileInputStream;
import java.io.FileReader;

public class ViDuDocStream {
	public static void main(String[] args) throws IOException {
		
		FileInputStream fInput = new FileInputStream ("BaiTho.txt");
		
		// Khai báo biến đối tượng InputStreamReader
		InputStreamReader ipReader = new InputStreamReader(fInput);
		// Khai báo biến đối tượng Buffer
		BufferedReader bufReader = new BufferedReader(ipReader);
	

		// Đọc 1 dòng dữ liệu từ file, cất vào biến chuỗi
		String line1 = bufReader.readLine();
		// In ra dòng đọc được
		System.out.println(line1);
		
		// Đọc 1 dòng dữ liệu từ file, cất vào biến chuỗi
		String line2 = bufReader.readLine();
		// In ra dòng đọc được
		System.out.println(line2);
	
	}
	

}

