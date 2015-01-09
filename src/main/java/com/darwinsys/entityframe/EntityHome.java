package com.darwinsys.entityframe;

import javax.persistence.EntityManager;

/**
 * Patterned loosely after the Seam2 Entity Framework; contains
 * methods to manipulate one entity. Typical usage:
 * <pre>
 * @ManagedBean(name="frameworkHome")
 * public class FrameworkHome extends EntityHome<Framework> {
 *
 * 	@PersistenceContext
 * 	protected EntityManager entityManager;
 *	
 * 	@Override
 * 	EntityManager getEntityManager() {
 * 		return entityManager;
 * 	}
 * }
 * </pre>
 * @author Ian Darwin
 * @param <T> The type of the JPA Entity we want to manipulate.
 */
public abstract class EntityHome<T extends Object> {

	abstract EntityManager getEntityManager();
	protected Class<T> entityClass;
	
	@SuppressWarnings("unchecked")
	protected EntityHome() {
		entityClass = (Class<T>) EntityQuery.getEntityClass(this);
		System.out.println("Entity class = " + entityClass.getName());
	}

	/** The C of CRUD - create a new T in the database */
	public void persist(T entity) {
		getEntityManager().persist(entity);
	}

	/** The R of CRUD - Download a T by primary key */
	public T find(long id) {		
		return getEntityManager().find(entityClass, id);
	}
	
	/** The U of CRUD - update an Entity */
	public void update(T entity) {
		// Nothing to do here - if the Entity is persistent, changes to
		// it will be persisted by the EntityManager automagically.
	}
	
	/** The D of CRUD - delete an Entity. Use with care! */
	public void delete(T entity) {
		getEntityManager().remove(entity);
	}
}
