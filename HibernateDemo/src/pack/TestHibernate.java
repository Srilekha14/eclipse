package pack;

import org.hibernate.Transaction;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

@SuppressWarnings("unused")
public class TestHibernate {
	public static void main(String[] args)
	{
		Configuration c=new Configuration();
		c.configure();
		@SuppressWarnings("deprecation")
		SessionFactory sf=c.buildSessionFactory();
		Session s=sf.openSession();
	/*	Transaction  tx=s.beginTransaction();
		Employee emp=new Employee(555,"sri",5000);
		s.save(emp);
		tx.commit();
		*/
		Employee e=(Employee)s.get(Employee.class,555);
		System.out.println("ID="+e.getId()+",Name = "+e.getName()+",Salary ="+e.getSalary());
		s.close();
		sf.close();
		System.out.println("****DONE******");
	}
}
