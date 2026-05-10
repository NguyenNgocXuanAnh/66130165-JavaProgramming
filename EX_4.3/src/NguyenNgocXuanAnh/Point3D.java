package NguyenNgocXuanAnh;

public class Point3D extends Point2D {
	private float z;

	public Point3D() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Point3D(float x, float y, float z) {
		super(x, y);
		this.z = z;
	}

	public float getZ() {
		return z;
	}

	public void setZ(float z) {
		this.z = z;
	}
	
	public void setXYZ (float x, float y, float z) {
		setX(x);
		setY(y);
		this.z = z;
	}
	
	public float[] getXYZ () {
		 float[] result = new float[2];   // tạo một mảng gồm 2 phần tử 
	       result[0] = getX(); 
	       result[1] =  getY();
	       result[2] = z;
	       return result;   // trả về mảng 
	}

	@Override
	public String toString() {
		return "(" + getX() + ", " + getY() + ", " + z;
	}
	
	
	
}
