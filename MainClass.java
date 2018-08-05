package com.hibernate.impl;



import java.util.Date;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;




public class MainClass {
	public static void main(String aa[]) {
		SessionFactory sessionFactory=new Configuration().configure().buildSessionFactory();
		Session session=sessionFactory.openSession();
		try {
		UserDetails userDetails=new UserDetails();
		userDetails.setUserId(5);
		userDetails.setUserName("Ajay");
		userDetails.setJoinedDate(new Date());
		userDetails.setDescription("fdghgdf dfhdf dgfdgf");
		Address addr=new Address();
		addr.setStreet("dsfd");
		addr.setState("UP");
		addr.setPincode("263502");
		addr.setCity("Gkp");
		userDetails.setAddress(addr);
		session.beginTransaction();
		
		session.save(userDetails);
		
		session.getTransaction().commit();
		System.out.println("User Created");
		session.close();
		userDetails=null;
		session=sessionFactory.openSession();
		session.beginTransaction();
		userDetails=session.get(UserDetails.class, 5);
		System.out.println("User Details");
		System.out.println("Name "+userDetails.getUserName());
		System.out.println("JoinedDate "+userDetails.getJoinedDate());
		System.out.println("Description "+userDetails.getDescription());
		
		}
		catch(Exception e) {
			session.getTransaction().rollback();
			
		}
		finally {
			session.close();
		}
	}
	

}
