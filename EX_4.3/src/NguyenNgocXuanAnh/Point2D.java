package NguyenNgocXuanAnh;

public class Point2D {
	private float x;
	private float y;
	
	public Point2D() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Point2D(float x, float y) {
		super();
		this.x = x;
		this.y = y;
	}

	public float getX() {
		return x;
	}

	public void setX(float x) {
		this.x = x;
	}

	public float getY() {
		return y;
	}

	public void setY(float y) {
		this.y = y;
	}
	
	public float[] getXY() { 
	       float[] result = new float[2];   // tạo một mảng gồm 2 phần tử 
	       result[0] = x; 
	       result[1] =  y;
	       return result;   // trả về mảng 
	}
	
	public void setXY (float x, float y) {
		this.x = x;
		this.y = y;
	}

	@Override
	public String toString() {
		return "(" + x + ", " + y + ")";
	}
	
}
