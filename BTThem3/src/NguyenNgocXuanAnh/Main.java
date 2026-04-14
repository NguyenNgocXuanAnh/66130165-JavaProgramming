package NguyenNgocXuanAnh;

import java.util.Scanner;
public class Main {
	public static void main(String[] args) {
		//tạo và nhập
		Scanner bp = new Scanner (System.in);
		KTso kt = new KTso ();
		System.out.println("Nhập a: ");
		int soA = bp.nextInt();
		//gói vào a
		kt.setA(soA);
		//kt chẵn lẻ
		if (kt.KTChan(soA) == 1)
			System.out.println(soA + " là số chẵn");
		else 
			System.out.println(soA +" không là số chẵn");
		//kt số nguyên tố 
		if (kt.KTnguyento(soA) == 1)
			System.out.println (soA +" là số nguyên tố");
		else 
			System.out.println(soA + " không là số nguyên tố");
	}
}
