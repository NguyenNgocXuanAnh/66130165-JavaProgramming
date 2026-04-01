package NguyenNgocXuanAnh.ntu;
import java.util.Scanner;
public class run {

	public static void main(String[] args) {

		//2a: Tạo mới 2 hs, hard-code dl
		HocSinh hs1 = new HocSinh ();
		
		String tenHS1 = "Trần văn A";
		hs1.setTenHS(tenHS1);
		
		short tuoiHS1 = 10;
		hs1.setTuoiHS(tuoiHS1);
		
		String lopHS1 = "8A-12";
		hs1.setLopHS(lopHS1);
		
		HocSinh hs2 = new HocSinh ("Trần Thị B", (short)12, "6C");
		//in ra màn hình
		System.out.print(hs1.toString());
		
		System.out.print("\nTên của HS 2 là: " + hs2.getTenHS() );
		System.out.print("\nTuổi của HS 2 là: " + hs2.getTuoiHS() );
		System.out.print("\nLớp của HS 2 là: " + hs2.getLopHS() );
		
		// NHẬP DỮ LIỆU TỪ BÀN PHÍM
		Scanner banPhim = new Scanner (System.in);
		// Nhập dữ liệu học sinh thứ 3
		HocSinh hs3 = new HocSinh ();
		 // hỏi user nhập vào 
		System.out.print("\nMời nhập tên của của học sinh thứ 3: "); //in ra hd và đợi
		String tenHS3 = banPhim.nextLine();
		//gói vào biến hs3
		hs3.setTenHS(tenHS3);
		
		System.out.print("Mời nhập tuổi của học sinh thứ 3: ");
		short tuoiHS3 = banPhim.nextShort();
		hs3.setTuoiHS(tuoiHS3);
		banPhim.nextLine();
		
		System.out.print("Mời nhập lớp của học sinh thứ 3: ");
		String lopHS3 = banPhim.nextLine();
		hs3.setLopHS(lopHS3);
		 
		//In hs 3 ra màn hình 
		
		System.out.print(hs3.toString() );
		
	}

}
