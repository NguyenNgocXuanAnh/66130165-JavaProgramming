package NguyeNgocXuanAnh;

import java.util.Scanner;
public class Main {

	public static void main(String[] args) {
		
		// Nhap a, b, c tu ban phim
		Scanner bp = new Scanner (System.in); 
		TamGiac tg1 = new TamGiac ();
		
		//hoi nguoi dung nhap 
		System.out.println("Nhap ba canh: ");
		
		//nhap ba canh a b c 
		System.out.println("Nhap canh a: ");
		float canha = bp.nextFloat();
		
		//goi vao canh a
		tg1.setA(canha);
		
		System.out.println("Nhap canh b: ");
		float canhb = bp.nextFloat();
		tg1.setB(canhb);
		
		System.out.println("Nhap canh c: ");
		float canhc = bp.nextFloat();
		tg1.setC(canhc);
		
		//in tg ra man hinh
		if (tg1.kiemtraTG(canha, canhb, canhc) == 1) {
		    System.out.println(tg1.toString());
		    tg1.loạiTG(canha, canhb, canhc);
		    System.out.println("Chu vi: " + tg1.ChuVi(canha, canhb, canhc));
		    System.out.printf("Dien tich: %f\n", tg1.DienTich(canha, canhb, canhc));
		} 
		else {
		    System.out.println(tg1.toString());
		}
		
	}

}
