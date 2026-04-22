package NguyenNgocXuanAnh;

public class Square extends Rectangle {
	public Square(double side) { 
		   super(side, side);   // Gọi lớp cha Rectangle(double, double) 
		}

	public Square() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Square(double side, double side1) {
		super(side1, side1);
		// TODO Auto-generated constructor stub
	}

	public Square(String color, boolean filled, double side) {
		super(color, filled, side, side);
		// TODO Auto-generated constructor stub
	}
	
	public double getSide () {
		return this.getLength();
	}
	 public void setSide (double side) {
		 this.setLength(side);
	 }
	 

}
