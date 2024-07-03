package Hiber;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import javax.persistence.TypedQuery;

import antlr.collections.List;

public class FetchAll {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		EntityManagerFactory entityManagerFactory = Persistence.createEntityManagerFactory("dev");
		EntityManager entityManager = entityManagerFactory.createEntityManager();
		entityManager.getTransaction().begin();
		// Create a TypedQuery with JPQL
		String jpql = "SELECT e FROM TableDetails e "; // YourEntity is your entity class name
		//for single record use where clause in above query and give condition
		
		
	TypedQuery<TableDetails> tdall =entityManager.createQuery(jpql, TableDetails.class);

		// Execute the query and get the list of results
		java.util.List<TableDetails> entities =tdall.getResultList();

		// Process the results
		for (TableDetails entity : entities) {
		    // Process each entity as needed
		    System.out.println(entity.getId()+"--->"+entity.getName());
		}
		entityManager.getTransaction().commit();

		// Close the EntityManager when done
		entityManager.close();
		entityManagerFactory.close();

	}

}
