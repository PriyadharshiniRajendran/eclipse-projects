package pack;

public class Customer {
	private Identifier id;

	public Customer() {
		super();
	
	}

	public Customer(Identifier id) {
		super();
		this.id = id;
	}

	public Identifier getId() {
		return id;
		
	}

	public void setId(Identifier id) {
		this.id = id;
		System.out.println("setid is called");
	}
	public void getInformations() {
		id.display();
	}
	
}
