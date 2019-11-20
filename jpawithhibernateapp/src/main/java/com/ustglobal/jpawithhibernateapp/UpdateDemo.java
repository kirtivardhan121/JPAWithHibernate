package com.ustglobal.jpawithhibernateapp;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

import com.ustglobal.jpawithhibernateapp.dto.product;

public class UpdateDemo {

	public static void main(String[] args) {

		EntityTransaction entityTransaction = null;
		EntityManager entityManager = null;
		
		try {
			
			EntityManagerFactory entityManagerFactory = Persistence.createEntityManagerFactory("TestPersistence");
			entityManager = entityManagerFactory.createEntityManager();
			entityTransaction = entityManager.getTransaction();
			entityTransaction.begin();
			product productinfo =  entityManager.find(product.class , 10);
			productinfo.setPname("T-shirt");
			System.out.println("Update Saved");
			entityTransaction.commit();
		
		} catch (Exception e) {
			e.printStackTrace();
			entityTransaction.rollback();
		
		}
		entityManager.close();

	}//end of main()

}//end of UpdateDeo
