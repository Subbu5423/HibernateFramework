package OperationsCrud;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

public class Create {
	public static void main(String[] args) {
		EntityManagerFactory factory=Persistence.createEntityManagerFactory("dev");
		EntityManager manager=factory.createEntityManager();
		try {
		manager.getTransaction().begin();
		EntityMain main=new EntityMain();
		main.setName("Subbu");
		main.setSalary(30000);
		main.setDeptname("Manager");
		main.setDeptno(10);
		
		manager.merge(main);
		manager.getTransaction().commit();
		}finally {
			manager.close();
			System.out.println("Success");
			factory.close();
			System.out.println("Success");
		}
	}
	

}
