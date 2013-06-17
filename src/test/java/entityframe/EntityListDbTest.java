package entityframe;

import static org.junit.Assert.assertNotNull;
import static org.junit.Assert.assertTrue;

import java.util.List;

import org.junit.Test;

public class EntityListDbTest extends DatabaseUsingTest {
	
	Entity1List rl = new Entity1List();

	@Test
	public void testGetResultList() {
		System.out.println("Entity1ListDbTest.testGetResultList()");
		assertNotNull(entityManager);
		rl.setEntityManager(entityManager);
		final List<Entity1> resultList = rl.getResultList();
		assertNotNull(resultList);
		assertTrue("rl.getResultList()", resultList.size() > 0);
	}
}
