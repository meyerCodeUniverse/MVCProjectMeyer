package edu.dmacc.spring.mvcprojectmeyer;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import javax.persistence.TypedQuery;

import edu.dmacc.spring.mvcprojectmeyer.Product;

public class UserDao {
EntityManagerFactory emfactory = Persistence.createEntityManagerFactory("MVCProjectMeyer");
	
	public void insertProduct(Product productToAdd) {
		EntityManager em = emfactory.createEntityManager();
		em.getTransaction().begin();
		em.persist(productToAdd);
		em.getTransaction().commit();
		em.close();
	}

	public List<Product> getAllProducts() {
		EntityManager em = emfactory.createEntityManager();
		em.getTransaction().begin();
		String q = "select u from Product u";
		TypedQuery<Product> typedQuery = em.createQuery(q, Product.class);
		List<Product> all = typedQuery.getResultList();
		return all;
	}
}
