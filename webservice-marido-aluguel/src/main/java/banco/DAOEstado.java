package banco;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.Persistence;

import entidade.Estado;

public class DAOEstado {
	
	public List<Estado> buscar(){
		EntityManager manager = Fabrica.get().createEntityManager();
		return manager.createQuery("from Estado").getResultList();
	}

}
