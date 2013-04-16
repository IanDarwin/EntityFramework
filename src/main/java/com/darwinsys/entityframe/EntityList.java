package dao;

import java.util.List;

import javax.persistence.EntityManager;

/**
 * Patterned loosely after the Seam2 Entity Framework: methods for getting a list of Entities.
 * @author Ian Darwin
 *
 * @param <T> The type of the JPA entity that you want to list.
 */
public abstract class EntityList<T extends Object> {

	abstract EntityManager getEntityManager();
	
	protected Class<T> entityClass;
	
	@SuppressWarnings("unchecked")
	protected EntityList() {
		entityClass = (Class<T>) EntityQuery.getEntityClass(this);
		System.out.println("Entity class = " + entityClass.getName());
	}
	
	public List<T> getResultList() {
		System.out.printf("EntityList<%s>.getResultList()", entityClass.getName());
		return getEntityManager().createQuery("from " + entityClass.getName()).getResultList();
	}
	
	public long getResultCount() {
		return (Long) getEntityManager().createQuery("select count(*) from " + entityClass.getName()).getSingleResult();
	}
}
