package NguyenNgocXuanAnh;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Shape kh = new Shape("red",true);
		System.out.println(kh.toString());
		
		Shape kh1 = new Shape();
		System.out.println(kh1.toString());
		//test lopws htron
		Circle tron = new Circle("red", true, 3.4);
		System.out.println(tron.toString());
		
		Circle tron1 = new Circle();
		System.out.println(tron1.toString());
		
		//test lop hinh chu nhat
		Rectangle hcn = new Rectangle("black", true, 5, 10);
		System.out.println(hcn.toString());
		
		Rectangle hcn1 = new Rectangle();
		System.out.println(hcn1.toString());
		
		//test lop hinh vuong
		Square hv = new Square("pink", true, 5);
		System.out.println(hv.toString());
		
		Square hv1 = new Square();
		System.out.println(hv1.toString());
		
		
		
	}

}
