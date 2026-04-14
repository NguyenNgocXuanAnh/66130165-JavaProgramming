package NguyenNgocXuanAnh;

public class KTso {
	private int a;

	
	public KTso(int a) {
		this.a = a;
	}

	public int getA() {
		return a;
	}

	public void setA(int a) {
		this.a = a;
	}
	
	public int KTChan (int a) {
		if (a%2==0)
			return 1;
		else 
			return 0;
	}
	
	public int KTnguyento (int a) {
		for (int i = 2; i<a; i++) {
			if (a%i==0)
				return 0;
		}
		return 1;
	}

}
