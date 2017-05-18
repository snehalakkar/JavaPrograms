package com.bridgeLabz.crudOperation.dao;

import java.util.List;

import org.hibernate.Query;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.AnnotationConfiguration;
import org.hibernate.cfg.Configuration;
import org.hibernate.classic.Session;
import org.hibernate.hql.QueryExecutionRequestException;

import com.bridgeLabz.crudOperation.dto.Student;

public class StudentDao {
	private static SessionFactory sessionFactory;
	
static{
	Configuration cfg=new AnnotationConfiguration();
	cfg.configure();
	sessionFactory=cfg.buildSessionFactory();
}

public static SessionFactory getFactory(){
	return sessionFactory;
}
	
	public void save(Student student){
		sessionFactory=getFactory();
		
	Session session=sessionFactory.openSession();
	Transaction tran=session.beginTransaction();
	session.save(student);
	tran.commit();
	session.close();
	System.out.println("save successfull...\n");
	}
	
	public void update(int id,String name){
		sessionFactory=getFactory();
		
		Session session=sessionFactory.openSession();
		Transaction tran=session.beginTransaction();
		Student s1 = (Student) session.get(Student.class, id);
		
		s1.setName(name);
		session.persist(s1);
		tran.commit();
		session.close();
		System.out.println("update successfull...\n");

		}
	
	public void delete(int id){
		sessionFactory=getFactory();
		
		Session session=sessionFactory.openSession();
		Transaction tran=session.beginTransaction();
		Student s1 = (Student) session.get(Student.class, id);
		session.delete(s1);
		tran.commit();
		session.close();
		System.out.println("delete successfull...\n");

		}
	
	public void displayAll(){
		sessionFactory=getFactory();
		
		Session session=sessionFactory.openSession();
		Transaction tran=session.beginTransaction();
		Query qry=session.createQuery("from Student");
		List list=qry.list();
		for(Object o1:list)
		{
			System.out.println(o1);
		}
		tran.commit();
		session.close();
		System.out.println("displaying all record successfully...\n");

		}
	
	public void displayParticular(int id){
		sessionFactory=getFactory();
		
		Session session=sessionFactory.openSession();
		Transaction tran=session.beginTransaction();
		Student s1=(Student) session.get(Student.class, id);
		Query qry=session.createQuery("from Student where id="+id);
		List list=qry.list();
		System.out.println(list);
		tran.commit();
		session.close();
		System.out.println("displaying all record successfully...\n");

		}
	
}
