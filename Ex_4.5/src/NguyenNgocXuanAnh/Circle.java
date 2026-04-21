package NguyenNgocXuanAnh;

public class Circle extends Shape {
	private double radious;

	
	public Circle() {
		super();

	}

	public Circle(double radious) {
		this.radious = radious;

	}

	public Circle(String color, boolean filled, double radious) {
		super(color, filled);
		this.radious = radious;
	}


	public double getRadious() {
		return radious;
	}


	public void setRadious(double radious) {
		this.radious = radious;
	}
	
	public double getArea (double radius) {
		return radius*radius*Math.PI;
	}
	
	 public double getPerimeter (double radius) {
		 return radius*2*Math.PI;
	}


	 @Override
	 public String toString() {
		return "Circle [radious=" + radious + ", color=" + color + ", filled=" + filled + ", getRadious()="
				+ getRadious() + ", getColor()=" + getColor() + ", isFilled()=" + isFilled() + ", toString()="
				+ super.toString() + ", getClass()=" + getClass() + ", hashCode()=" + hashCode() + "]";
	 }
	 
	
	
}
