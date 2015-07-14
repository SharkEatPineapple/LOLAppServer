package com.lol.common.test;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;
import org.junit.Test;

import com.lol.common.dto.Employee;

public class EmployeeTest {

//	private static ThreadLocal<Session> threadLocal = new ThreadLocal<>();
	@Test
	public void testSave() throws Exception {
		Employee emp = new Employee();
		emp.setName("abc");
		
		
		Configuration conf = new Configuration();
		conf.configure();
		SessionFactory factory = conf.buildSessionFactory();
		Session session = factory.openSession();
		Transaction tran = session.beginTransaction();
		session.save(emp);
		tran.commit();
		session.close();
		factory.close();
		
		
		
	}
}
