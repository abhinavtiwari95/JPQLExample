package com.JPQLexample.Update;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import javax.persistence.Query;

public class App {

	public static void main(String[] args) {
	
		EntityManagerFactory emf = Persistence.createEntityManagerFactory( "Student_details" );  
        EntityManager em = emf.createEntityManager();  
        em.getTransaction().begin( );  
          
          
        Query query = em.createQuery( "update from StudentUpdate set s_age=25 where s_id>103");  
          
        query.executeUpdate();  

        System.out.println();
        em.getTransaction().commit();  
        em.close();  
        emf.close();    
	}

}
