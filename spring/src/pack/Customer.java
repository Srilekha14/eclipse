package pack;

import org.springframework.beans.factory.annotation.Autowired;

public class Customer {
	private Identifier id;
	private Identifier id2;
	@Autowired
//private Identifier id2;

	/*public Customer(Identifier id2) {
	//super();
	this.id2 = id2;
	System.out.println("Customer1(identifier2) is called with id ");

}

	public Identifier getId2() {
		return id2;
	}

	public void setId2(Identifier id2) {
		this.id2 = id2;
		System.out.println("Aadhar setter created");
	}
*/
	public Customer(Identifier id,Identifier id2) {
		super();
		this.id = id;
		System.out.println("Customer(identifier) is called with id ");
		id.display();
		id2.display();
	}

	public Customer() {
		super();
		System.out.println("Customer() is called");
	}

	public Identifier getId() {
		return id;
	}

	public void setId(Identifier id) {
		this.id = id;
		System.out.println("Pan setter created");
	}
	public void getInformation(){
		id.display();
		id2.display();
	}
	
}
