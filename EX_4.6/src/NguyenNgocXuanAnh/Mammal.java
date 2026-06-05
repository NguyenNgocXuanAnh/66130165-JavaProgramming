package NguyenNgocXuanAnh;

public class Mammal extends Animal{

	public Mammal() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Mammal(String name) {
		super(name);
		// TODO Auto-generated constructor stub
	}

	@Override
	public String toString() {
		String s = "Mammal";
		return s + "[" + super.toString()+"]";
	}

	

	
	

}
