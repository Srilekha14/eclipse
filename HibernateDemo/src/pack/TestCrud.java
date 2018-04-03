package pack;

import java.util.Scanner;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;


public class TestCrud {
public static void main(String[] args){
		System.out.println("Doing updated operation");
		Scanner sc = new Scanner(System.in);
		SessionFactory sf=hibernateutility.getSessionFactory();
		Session s=sf.openSession();
		Transaction tx=s.beginTransaction();
		System.out.println("Enter the id");
		int tempid=sc.nextInt();
		sc.nextLine();
		Employee e=(Employee)s.get(Employee.class, tempid);
		if(e!=null){
			System.out.println("Old name:"+e.getName());
			System.out.println("Enter name to update");
			String tempName=sc.nextLine();
			e.setName(tempName);
			System.out.println("New name="+e.getName());
			s.update(e);
			tx.commit();
		}else{
			System.err.println("Sorry,Id"+tempid+"not found");
		}
		s.close();
		sf.close();
		sc.close();
}
}
