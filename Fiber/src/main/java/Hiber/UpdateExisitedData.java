package Hiber;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import javax.persistence.TypedQuery;

public class UpdateExisitedData {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		EntityManagerFactory factory=Persistence.createEntityManagerFactory("dev");
		EntityManager manager=factory.createEntityManager();
		manager.getTransaction().begin();
			TableDetails td=manager.find(TableDetails.class, 2);
			td.setName("Raghu");
		manager.getTransaction().commit();
		manager.close();
		factory.close();
		
		System.out.println("Successfully updated");

	}

}
