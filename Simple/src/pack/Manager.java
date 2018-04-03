package pack;

public class Manager extends Employee {
	private int emp;
	
	public Manager() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Manager(String name, int age, int emp) {
		super(name, age);
		this.emp = emp;
	}

	public int getEmp() {
		return emp;
	}

	public void setEmp(int emp) {
		this.emp = emp;
	}

	@Override
	public String toString() {
		return "Manager [emp=" + emp + ", getName()=" + getName()
				+ ", getAge()=" + getAge() + "]";
	}


	
	
	 
}
