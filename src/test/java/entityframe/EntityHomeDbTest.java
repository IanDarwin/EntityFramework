package entityframe;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;
import static org.junit.Assert.assertNull;

import javax.persistence.EntityTransaction;

import org.junit.Test;

import entityframe.test.Class1;
import entityframe.test.Class1Home;

public class EntityHomeDbTest extends DatabaseUsingTest {
	
	Class1Home homer = new Class1Home();

	@Test
	public void testPersist() {
		System.out.println("Class1ListDbTest.testGetResultList()");
		assertNotNull(entityManager);
		homer.setEntityManager(entityManager);
		final EntityTransaction transaction = entityManager.getTransaction();
		transaction.begin();
		Class1 c = new Class1(); final String personName = "Atypical User";
		c.name = personName;
		homer.persist(c);
		entityManager.flush();
		Class1 result = entityManager.find(Class1.class, c.id);
		assertEquals("name", personName, result.name);
		assertNull(result.address);
		transaction.commit();
		
	}
}
