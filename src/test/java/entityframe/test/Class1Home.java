package entityframe.test;

import javax.inject.Named;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

import com.darwinsys.entityframe.*;

@Named("classHome")
public class Class1Home extends EntityHome<Class1> {

	@PersistenceContext
	protected EntityManager entityManager;
	
	@Override
	public EntityManager getEntityManager() {
		return entityManager;
	}
	
	public void setEntityManager(EntityManager entityManager) {
		this.entityManager = entityManager;
	}

}
