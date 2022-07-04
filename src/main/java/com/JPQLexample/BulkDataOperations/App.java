package com.JPQLexample.BulkDataOperations;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import javax.persistence.Query;

public class App {

	public static void main(String[] args) {
	
		EntityManagerFactory emf = Persistence.createEntityManagerFactory("Student_details");
		EntityManager em = emf.createEntityManager();
		
		em.getTransaction().begin();
		Query query = em.createQuery("Select s from StudentBulkDataOperations s");
		List<StudentBulkDataOperations> list = query.getResultList();
		System.out.print("s_id");
		System.out.print("\t s_name");
		System.out.println("\t s_age");
		
		for(StudentBulkDataOperations s:list) {
			System.out.print(s.getS_id());
			System.out.print("\t"+s.getS_name());
			System.out.print("\t"+s.getS_age());
			System.out.println();
		}
		em.getTransaction().commit();
		em.close();
		emf.close();

	}

}
