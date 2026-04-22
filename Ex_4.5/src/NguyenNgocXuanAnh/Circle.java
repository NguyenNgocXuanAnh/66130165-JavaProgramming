package NguyenNgocXuanAnh;

public class Circle extends Shape {
	private double radius;

	
	public Circle() {
		super();

	}

	public Circle(double radius) {
		this.radius = radius;

	}

	public Circle(String color, boolean filled, double radious) {
		super(color, filled);
		this.radius = radius;
	}


	public double getRadius() {
		return radius;
	}


	public void setRadius(double radius) {
		this.radius = radius;
	}
	
	public double getArea (double radius) {
		return radius*radius*Math.PI;
	}
	
	 public double getPerimeter (double radius) {
		 return radius*2*Math.PI;
	}


	 @Override
	 public String toString() {
//		return "Circle [radious=" + radious + ", color=" + color + ", filled=" + filled + ", getRadious()="
//				+ getRadious() + ", getColor()=" + getColor() + ", isFilled()=" + isFilled() + ", toString()="
//				+ super.toString() + ", getClass()=" + getClass() + ", hashCode()=" + hashCode() + "]";
		 String chuoiXuat = super.toString();
		 chuoiXuat += ", radius: " + radius;
		 return chuoiXuat;
	 }
	 
	
	
}
