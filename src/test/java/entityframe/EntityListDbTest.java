package entityframe;

import static org.junit.Assert.assertNotNull;
import static org.junit.Assert.assertTrue;

import java.util.List;

import javax.persistence.EntityTransaction;

import org.junit.Test;

import entityframe.test.Class1;
import entityframe.test.Class1List;

public class EntityListDbTest extends DatabaseUsingTest {
	
	Class1List lister = new Class1List();

	@Test
	public void testGetResultList() {
		System.out.println("Class1ListDbTest.testGetResultList()");
		assertNotNull(entityManager);
		lister.setEntityManager(entityManager);
		final EntityTransaction transaction = entityManager.getTransaction();
		transaction.begin();
		Class1 c = new Class1(); c.name = "Atypical User";
		entityManager.persist(c);
		entityManager.flush();
		final List<Class1> resultList = lister.getResultList();
		transaction.commit();
		assertNotNull(resultList);
		final int size = resultList.size();
		System.out.println("Found " + size + " records.");
		assertTrue("rl.getResultList()", size > 0);
	}
}
