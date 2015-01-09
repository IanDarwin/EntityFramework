package entityframe;

import static org.junit.Assert.assertNotNull;
import static org.junit.Assert.assertTrue;

import java.util.List;

import org.junit.Test;

import entityframe.test.Class1;
import entityframe.test.Class1List;

public class EntityListDbTest extends DatabaseUsingTest {
	
	Class1List rl = new Class1List();

	@Test
	public void testGetResultList() {
		System.out.println("Class1ListDbTest.testGetResultList()");
		assertNotNull(entityManager);
		rl.setEntityManager(entityManager);
		final List<Class1> resultList = rl.getResultList();
		assertNotNull(resultList);
		assertTrue("rl.getResultList()", resultList.size() > 0);
	}
}
