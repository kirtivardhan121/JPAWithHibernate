package com.ustglobal.jpawithhibernateapp;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

import com.ustglobal.jpawithhibernateapp.dto.product;

public class ReadDemo {

	public static void main(String[] args) {


		EntityManagerFactory entityManagerFactory = Persistence.createEntityManagerFactory("TestPersistence");
		EntityManager entityManager = entityManagerFactory.createEntityManager();

		//		find() method is use to retrieve data from database
		product productDetails = entityManager.find(product.class , 10);
		System.out.println("id --> " + productDetails.getPid());
		System.out.println("Name --> " + productDetails.getPname());
		System.out.println("Quantity--> " + productDetails.getQuantity());


	}//end of main()

}//end of ReadDemo
