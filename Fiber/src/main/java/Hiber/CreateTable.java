package Hiber;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

public class CreateTable {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		EntityManagerFactory factory=Persistence.createEntityManagerFactory("dev");
		EntityManager manager=factory.createEntityManager();
		manager.getTransaction().begin();
		TableDetails td=new TableDetails();
		td.setId(2);
		td.setName("Subbu");
		
	
		
		
		manager.merge(td);
		manager.getTransaction().commit();
		
		manager.close();
		
		factory.close();
		
		System.out.println("Completed Transaction");
		
	}

}
