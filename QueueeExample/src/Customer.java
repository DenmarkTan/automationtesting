
public class Customer {
	private boolean hasBeenServed;
	private String name;
	
	public Customer(String name) {
		hasBeenServed = false;
		this.name = name;
	}
	
	public void serve() {
		hasBeenServed = true;
		System.out.println(name + "has been reserved");
	}
	
	@Override
	public String toString() {
		return name;
	}
	
}
