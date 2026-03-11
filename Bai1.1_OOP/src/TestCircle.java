
public class TestCircle {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//tạo 1 đối tượng circle tên c1
		
		Circle c1 = new Circle ();
		
		//gọi các phương thức công khai trên thể hiện c1
		
		System.out.println("Hình tròn có bán kính là: "
		+ c1.getRadius() + " và diện tích của " + c1.getArea());
	
	    // Khai báo một thể hiện của lớp circle có tên là c2.
	    // Khởi tạo thể hiện c2 bằng cách gọi hàm tạo thứ hai
	    // với bán kính và màu sắc mặc định đã cho.
	
		Circle c2 = new Circle(2.0);
		
		// Gọi các phương thức công khai trên thể hiện c2, thông qua toán tử dấu chấm.
	   
		System.out.println("Hình tròn có bán kính là: "
	    + c2.getRadius() + " và diện tích của " + c2.getArea());
	}

}
