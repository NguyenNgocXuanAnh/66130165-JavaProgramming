package NguyenNgocXuanAnh;

public class Dog extends Mammal{

	public Dog() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Dog(String name) {
		super(name);
		// TODO Auto-generated constructor stub
	}
	
	public void greets() {
		System.out.println("Woof");
	}
	public void greets(Dog dog) {
		System.out.println("Woooof");
	}

	@Override
	public String toString() {
		return "Dog ["+ super.toString( )+"]";
	}
	
	
}
