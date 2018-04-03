package pack;

import java.util.Iterator;
import java.util.List;





import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;

public class Testhq {
	@SuppressWarnings("rawtypes")
	public static void main(String[] args) {
		SessionFactory sf=hibernateutility.getSessionFactory();
		Session s=sf.openSession();
		String hql="select e.name,e.salary from pack.Employee e ";
		Query q=s.createQuery(hql);
		List l=q.list();
		Iterator it= l.iterator();
		while(it.hasNext()){
			Object[] obj=(Object[])it.next();
			String Name=(String)obj[0];
			double salary=(double)obj[1];
			System.out.println("Nmae="+Name+",Salary="+salary);
		}
		sf.close();
		//   s.close();
	}
}
