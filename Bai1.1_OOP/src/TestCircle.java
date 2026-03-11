
public class TestCircle {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//tạo 1 đối tượng circle tên c1
		
		Circle c1 = new Circle ();
		
		//gọi các phương thức công khai trên thể hiện c1
		
		System.out.print("Hình tròn có bán kính là: "
		+ c1.getRadius() + " và diện tích của " + c1.getArea());
	}

}
