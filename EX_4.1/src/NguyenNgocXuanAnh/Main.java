package NguyenNgocXuanAnh;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	     Cylinder c1 = new Cylinder();
	     System.out.println ("Xi lanh:"
	            + " bán kính=" + c1.getRadius()
	            + " chiều cao=" + c1.getHeight()
	            + " diện tích cơ sở=" + c1.getArea()
	            + " volume=" + c1.getVolume());
		
	     Cylinder c2 = new Cylinder(10.0);
	     System.out.println("Xi lanh:"
	            + " bán kính=" + c2.getRadius()
	            + " chiều cao=" + c2.getHeight()
	            + " diện tích cơ sở=" + c2.getArea()
	            + " volume=" + c2.getVolume());
	     Cylinder c3 = new Cylinder(2.0, 10.0);
	     System.out.println("Xi lanh:"
	            + " bán kính=" + c3.getRadius()
	            + " chiều cao=" + c3.getHeight()
	            + " diện tích cơ sở=" + c3.getArea()
	            + " Volume=" + c3.getVolume());
	     Cylinder c4 = new Cylinder ();
	     System.out.println(c4.toString());
	}

}
