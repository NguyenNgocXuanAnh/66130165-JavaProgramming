package NguyenNgocXuanAnh;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Animal a1 = new Animal();
		a1.setName("Cam");
		System.out.println(a1.toString());
		Mammal m1 = new Mammal();
		m1.setName("Ca heo");
		System.out.println(m1.toString());
		Cat c1 = new Cat("Vang");
		System.out.println(c1.toString());
		c1.setName("Banh");
		System.out.println(c1.toString());
		Dog d1 = new Dog("Bong");
		System.out.println(d1.toString());
		
	}

}
