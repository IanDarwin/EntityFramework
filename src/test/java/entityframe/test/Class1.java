package entityframe.test;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

/**
 * A very crude entity for testing.
 * Fields are public for testing; not necessarily "best practices" for production code.
 */
@Entity
public class Class1 {
	
	@Id @GeneratedValue(strategy=GenerationType.AUTO)
	public long id;
	
	public String name;
	public String address;
	
	@Override
	public String toString() {
		return String.format("Class1: name=%s", name);
	}

}
