package NguyenNgocXuanAnh.ntu;

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
		
	}

}
