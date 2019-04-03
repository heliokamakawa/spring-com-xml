package banco;

import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

public class Fabrica {
	
	private static EntityManagerFactory factory;
	
	public static EntityManagerFactory get(){
		return Persistence.createEntityManagerFactory("mysqlPU");
	}

}
