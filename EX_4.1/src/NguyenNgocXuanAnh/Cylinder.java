package NguyenNgocXuanAnh;

public class Cylinder extends Circle {
	private double height;

	public Cylinder() {
		super();
		height = 1.0;
	}

	public Cylinder(double height) {
		super();
		this.height = height;
	}

	public Cylinder(double radius, String color) {
		super(radius);
		this.height = height;
		
	}
	
	public double getHeight() {
		return height;
	}
	
	public void setHeight () {
		this.height = height;
	}
	
	public double getVolume () {
		return getArea()*height;
	}
}
