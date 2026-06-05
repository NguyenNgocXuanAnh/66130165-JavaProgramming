package NguyenNgocXuanAnh;

public class Cat extends Mammal{

	public Cat() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Cat(String name) {
		super(name);
		// TODO Auto-generated constructor stub
	}
	public void greets() {
		System.out.println("Meow");
	}

	@Override
	public String toString() {
		return "Cat [" + super.toString()+"]";
	}
	

}
