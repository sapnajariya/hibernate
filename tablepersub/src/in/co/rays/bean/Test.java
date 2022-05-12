package in.co.rays.bean;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

public class Test {

	public static void main(String[] args) {
		SessionFactory sf=new Configuration().configure().buildSessionFactory();
		Session session=sf.openSession();
		Transaction tx=session.beginTransaction();
	
		CreditCard c=new CreditCard();

        c.setPaymentId(10);
        c.setAmount(2500);
        c.setCreditCardType("Visa");

        Cheque c1=new Cheque();

        c1.setPaymentId(11);
        c1.setAmount(2600);
        c1.setChequetype("ICICI");

        
        session.save(c);
        session.save(c1);
        System.out.println("Object saved successfully.....!!");
        tx.commit();
        session.close();
        sf.close();
    }
}
