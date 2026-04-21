package NguyenNgocXuanAnh;

public class Rectangle extends Shape {
	private double width;
	private double length;
	public Rectangle() {
		super();

	}
	public Rectangle (double width, double length) {
		this.width = width;
		this.length = length;
	}
	public Rectangle(String color, boolean filled, double width, double length) {
		super(color, filled);
		this.width = width;
		this.length = length;
	}
	public double getWidth() {
		return width;
	}
	public void setWidth(double width) {
		this.width = width;
	}
	public double getLength() {
		return length;
	}
	public void setLength(double length) {
		this.length = length;
	}
	
	public double getArea (double wedth, double length) {
		return wedth*length;
	}
	
	 public double getPerimeter (double wedth, double length) {
		 return (wedth+length)*2;
	}
	 @Override
	 public String toString() {
		return "Rectangle [width=" + width + ", length=" + length + ", color=" + color + ", filled=" + filled
				+ ", getWidth()=" + getWidth() + ", getLength()=" + getLength() + ", getColor()=" + getColor()
				+ ", isFilled()=" + isFilled() + ", toString()=" + super.toString() + ", getClass()=" + getClass()
				+ ", hashCode()=" + hashCode() + "]";
	 }
	 
	
	 
	
}
