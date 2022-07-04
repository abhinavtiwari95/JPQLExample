package com.JPQLexample.AdvancedOperations;

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
		
		Query query = em.createQuery("select s from StudentAdvancedOperations s where s.s_age between 21 and 26 ");
		List<StudentAdvancedOperations> list = query.getResultList();
		
		System.out.println("Between Clause");
		System.out.print("s_id");
		System.out.print("\t s_name");
		System.out.println("\t s_age");
		
		for(StudentAdvancedOperations s:list) {
			
			System.out.print(s.getS_id());
			System.out.print("\t"+s.getS_name());
			System.out.print("\t"+s.getS_age());
			System.out.println();
		}
		System.out.println();
		
		Query query1 = em.createQuery("select s from StudentAdvancedOperations s where s.s_age IN(21,24,23)");
		List<StudentAdvancedOperations> list1 = query1.getResultList();
		
		System.out.println("IN Clause");
		System.out.print("s_id");
		System.out.print("\t s_name");
		System.out.println("\t s_age");
		
		for(StudentAdvancedOperations s:list1) {
			
			System.out.print(s.getS_id());
			System.out.print("\t"+s.getS_name());
			System.out.print("\t"+s.getS_age());
			
		}
		System.out.println();
		
		Query query2 = em.createQuery("select s from StudentAdvancedOperations s where s.s_name like '%r%'");
		List<StudentAdvancedOperations> list2 = query2.getResultList();
		
		System.out.println("Like Clause");
		System.out.print("s_id");
		System.out.print("\t s_name");
		System.out.println("\t s_age");
		
		for(StudentAdvancedOperations s:list2) {
			
			System.out.print(s.getS_id());
			System.out.print("\t"+s.getS_name());
			System.out.print("\t"+s.getS_age());
			
		}
		System.out.println();
		
		em.close();
		emf.close();
		
	}

}
