package com.MyFirstHib;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

public class Company {
	public static void main(String[] args) {
		/*
		 * TestEngineer test=new TestEngineer(1, "Rahul",25000, 24); DevEngineer dev=new
		 * DevEngineer(01, "Raushan", 23000, 25);
		 */
		TestEngineer test=new TestEngineer();
		//updating by using setters
		test.setId(1);
		test.setName("Rahul");
		test.setAge(24);
		test.setSalary(20020);
		
		
		//retreiving by getters
		
		System.out.println(test.getId());
		System.out.println(test.getName());
		System.out.println(test.getAge());
		System.out.println(test.getSalary());
		
		
		
		
		
		DevEngineer dev=new DevEngineer();
		//updating by using setters
		dev.setId(01);
		dev.setName("Raushan");
		dev.setAge(25);
		dev.setSalary(32423);
		
		//retreiving by getters
		
		System.out.println(dev.getId());
		System.out.println(dev.getName());
		System.out.println(dev.getAge());
		System.out.println(dev.getSalary());
		
		
		
		
		
		
		Configuration con=new Configuration().configure().addAnnotatedClass(TestEngineer.class).addAnnotatedClass(DevEngineer.class);
		SessionFactory sf=con.buildSessionFactory();
		Session sess=sf.openSession();
		
		Transaction tr=sess.beginTransaction();
		
		sess.save(test);
		sess.save(dev);
		
		tr.commit();
	}

}
