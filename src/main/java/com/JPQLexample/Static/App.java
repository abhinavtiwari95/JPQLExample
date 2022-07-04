package com.JPQLexample.Static;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import javax.persistence.Query;

public class App {

	public static void main(String[] args) {
		
		new Persistence();
		EntityManagerFactory emf = Persistence.createEntityManagerFactory("Student_details");
		EntityManager em = emf.createEntityManager();
		
		em.getTransaction().begin();
		
		Query query = em.createNamedQuery("find name");
		@SuppressWarnings("unchecked")
		List<StudentStatic> list = query.getResultList();
		System.out.println("Student Name:");
		
		for(StudentStatic s:list) {
			System.out.println(s.getS_name());
		}
		em.close();
		emf.close();

	}

}
