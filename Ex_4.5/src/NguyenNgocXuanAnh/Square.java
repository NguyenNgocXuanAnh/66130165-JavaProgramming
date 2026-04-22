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
	 
	 public void setWidth (double side) {
		 this.setWidth(side);
	 }
	 public void setLength (double side) {
		 this.setLength(side);
	 }

	 @Override
	 public String toString() {
//		return "Square [color=" + color + ", filled=" + filled + ", getSide()=" + getSide() + ", getWidth()="
//				+ getWidth() + ", getLength()=" + getLength() + ", toString()=" + super.toString() + ", getColor()="
//				+ getColor() + ", isFilled()=" + isFilled() + ", getClass()=" + getClass() + ", hashCode()="
//				+ hashCode() + "]";
		 String chuoiXuat = super.toString();
		 chuoiXuat += ", width= " + getSide();
		 chuoiXuat += ", length= " + getSide();
		 return chuoiXuat;
	 }
	 

}
