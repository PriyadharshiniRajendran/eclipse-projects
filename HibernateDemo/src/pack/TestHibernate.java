package pack;


import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;
import org.hibernate.service.ConfigLoader;

public class TestHibernate {

	public static void main(String[] args) {
		Configuration c = new Configuration();
		c.configure();
		
		SessionFactory sf = c.buildSessionFactory();
		Session s = sf.openSession();
		/*
		Transaction tx = s.beginTransaction();
		demos dem = new demos(505, "jeevan", 47000);
		s.save(dem);
		tx.commit();
		*/
		//to retrieve demos instance
		demos d = (demos) s.get(demos.class, 505);
		System.out.println("ID = "+d.getId()+" NAME= "+d.getName()+" ,SALARY= "+d.getSalary());
		
		s.close();
		sf.close();
		System.out.println("*****DONE*****");
		
	}

}
