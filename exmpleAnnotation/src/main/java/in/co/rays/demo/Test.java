package in.co.rays.demo;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;

public class Test {

	public static void main(String[] args) {
		User u = new User();
		u.setFname("Ramesh");
		u.setLname("Mehta");
		u.setUserName("ram.mehta");
		u.setPwd("12345");
		
		SessionFactory factory = HibernateUtil.getSessionFactory();
		
		Session session = factory.openSession();
		
		Transaction tx = session.beginTransaction();
		
		session.save(u);
		
		tx.commit();
		
		session.close();
		
		HibernateUtil.shutdown();
	}

}