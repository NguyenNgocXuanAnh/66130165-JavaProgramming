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

	public Cylinder(double radius, double height) {
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

	@Override //ghi de
	public String toString() {
		return "Cylinder: lớp con của " + super.toString() //super.toString -> goi lop cha   
        + " height=" + height; 
	}
	
	
}
