package NguyeNgocXuanAnh;

public class TamGiac {
	private float a;
	private float b;
	private float c;
	
	//hàm tạo
	public TamGiac(float a, float b, float c) {
		super();
		this.a = a;
		this.b = b;
		this.c = c;
	}
	
	public float getA() {
		return a;
	}
	
	public void setA(float a) {
		this.a = a;
	}
	
	public float getB() {
		return b;
	}
	
	public void setB(float b) {
		this.b = b;
	}
	
	public float getC() {
		return c;
	}
	
	public void setC(float c) {
		this.c = c;
	}
	
	//kt a, b, c có phải tam giác không
	public int kiemtraTG (float a, float b, float c) {
		if (a + b > c && a + c > b && b + c > a) {
			System.out.println ("Ba cạnh a, b, c là ba cạnh của một tam giác");
			return 1;
		}
		else {
			System.out.println ("Ba cạnh a, b, c không là ba cạnh của một tam giác");
			return 0;
		}
	}
	//nếu là tam giac thì a, b, c là tam giác gì
	public void loạiTG (float a, float b, float c) {
		if ((a == b) && (b == c))
			System.out.println ("Đây là tam giac đều");
		else if ((a *a + b *b == c *c) || (a *a + c *c == b *b) || (b *b + c *c == a *a))
			System.out.println ("Đây là tam giác vuông");
		else if ((a == b) || (a == c) || (b == c))
			System.out.println ("Đây là tam giác cân");
		else if (((a *a + b *b == c *c) || (a *a + c *c == b *b) || (b *b + c *c == a *a))
					&& ((a == b) || (a == c) || (b == c)))
			System.out.println ("Đây là tam giac vuông cân");
		else 
			System.out.println ("Đây là tam giac thường");
		
	}
	public float ChuVi (float a, float b, float c) {
		return (a + b + c)/2;
	}
	public double DienTich (float a, float b, float c) {
		float p = (a + b + c)/2;
		return Math.sqrt(p*(p-a)*(p-b)*(p-c));
	}
	
}
