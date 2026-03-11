
public class Circle {
	
	//khai báo
	
	private double bk;
	private String color;
	
	//hàm tạo 1 (mặc định)
	
	public Circle() {
		bk = 1.0;
		color = "red";
	}
	
	//hàm tạo 2
	
	public Circle(double r) {
		bk = r;
		color = "red";
	}
	
	//trả về bán kính
	
	public double getRadius() {
		return bk;
	}
	
	//trả về diện tích của đtuong Circle 
	
	public double getArea() {
		return bk * bk * Math.PI;
	}
}
