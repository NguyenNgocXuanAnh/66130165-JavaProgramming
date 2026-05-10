package NguyenNgocXuanAnh;

public class Peson {
	private String name;
	private String address;
	
	public Peson(String name, String address) {
		super();
		this.name = name;
		this.address = address;
	}
	
	public String getName() {
		return name;
	}
	
	public String getAddress() {
		return address;
	}
	
	public void setAddress(String address) {
		this.address = address;
	}

	@Override
	public String toString() {
		return "Peson [name = " + name + ", address = " + address + "]";
	}
	
	
}
