package pack;

import org.springframework.stereotype.Component;

@Component
public class Address {

	public Address() {
		System.out.println("Address() is created");
	}
	public void display()
	{
		System.out.println("display() of address is called");
	}
	

}
