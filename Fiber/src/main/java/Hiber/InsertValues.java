package Hiber;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

public class InsertValues {

	public static void main(String[] args) {
		// TODO Auto-generated method 
		EntityManagerFactory factory=Persistence.createEntityManagerFactory("dev");
		EntityManager manager=factory.createEntityManager();
		manager.getTransaction().begin();
		TableDetails td1=new TableDetails();
		td1.setName("Subbu");
		TableDetails td2=new TableDetails();
		td2.setName("Mounisha");
		TableDetails td3=new TableDetails();
		td3.setName("Sravani");
		
		manager.merge(td1);
		manager.merge(td2);
		manager.persist(td3);
		manager.getTransaction().commit();
		
		manager.close();
		factory.close();
		
		System.out.println("Inserted multiple values");

	}

}