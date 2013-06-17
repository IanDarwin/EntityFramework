package entityframe;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

public class Class1List extends EntityList<Class1> {

	@PersistenceContext(unitName = "demo")
	protected EntityManager entityManager;
	
	@Override
	EntityManager getEntityManager() {
		return entityManager;
	}
	
	public void setEntityManager(EntityManager entityManager) {
		this.entityManager = entityManager;
	}

}