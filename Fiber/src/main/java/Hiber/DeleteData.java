package Hiber;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

public class DeleteData {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		EntityManagerFactory emf=Persistence.createEntityManagerFactory("dev");
		EntityManager em=emf.createEntityManager();
		
		em.getTransaction().begin();
		TableDetails td=em.find(TableDetails.class, 6);
		TableDetails td1=em.find(TableDetails.class, 7);

		System.out.println(td.getName()+"------"+td.getId());
		
		em.remove(td);
		em.remove(td1);
		System.out.println("removed");
		
		em.getTransaction().commit();
		em.close();
		emf.close();
		System.out.println("operation success");

	}

}
