package NguyenNgocXuanAnh;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Point3D p1 = new Point3D(2, 4, 6);
		System.out.println (p1.toString());
		
		p1.setXYZ(6, 5, 7);
		System.out.println (p1.toString());
		
		p1.setXY(3, 9);
		System.out.println (p1.toString());
	}

}
