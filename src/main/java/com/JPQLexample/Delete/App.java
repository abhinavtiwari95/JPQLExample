package com.JPQLexample.Delete;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import javax.persistence.Query;

public class App {

	public static void main(String[] args) {
		
		EntityManagerFactory emf = Persistence.createEntityManagerFactory( "Student_details" );  
        EntityManager em = emf.createEntityManager();  
        em.getTransaction().begin( );  
          
          
        Query query = em.createQuery( "delete from StudnetDelete where s_id=102");  
          
        query.executeUpdate();  

        em.getTransaction().commit();  
        em.close();  
        emf.close();    

	}

}
