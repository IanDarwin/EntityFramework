package entityframe.test;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

import entityframe.EntityList;

public class Class1List extends EntityList<Class1> {

	@PersistenceContext(unitName = "demo")
	protected EntityManager entityManager;
	
	@Override
	public EntityManager getEntityManager() {
		return entityManager;
	}
	
	public void setEntityManager(EntityManager entityManager) {
		this.entityManager = entityManager;
	}

}