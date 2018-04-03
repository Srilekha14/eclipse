package pack;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;

public class TestInheritance {
	public static void main(String[] args) {
		SessionFactory sf=hibernateutility.getSessionFactory();
		Session s=sf.openSession();
		Transaction tx=s.beginTransaction();
		Person p=new Person(141,"Sri");
		Customer c = new Customer(142,"Ramya","AXIS");
		Student v= new Student(143,"rO","O");
		s.save(p);
		s.save(c);
		s.save(s);
		tx.commit();
		s.close();
		sf.close();
		
	}
}
