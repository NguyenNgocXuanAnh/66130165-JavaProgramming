package thi.NguyenNgocXuanAnh;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		//cau a
		Scanner sc = new Scanner(System.in);
		int n = 0;
		do {
			System.out.println("Nhap n (n>=0): ");
			n=sc.nextInt();
			if (n<0)
				System.out.println("Loi n < 0");
		}
		while (n<0);
		//cau b
		int S = n*(n+1)/2;
		System.out.println("S = "+S);
	}

}
