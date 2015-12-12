package net.mv.util;


import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;


public class HibernateUtil {
	
	private static SessionFactory sessionFactory; 

	public static Session getSession(){
		if(sessionFactory == null){
			sessionFactory = new Configuration().configure("hibernate.cfg.xml").buildSessionFactory();
			
		}
		return  sessionFactory.openSession();
		
	}
	
	

}
