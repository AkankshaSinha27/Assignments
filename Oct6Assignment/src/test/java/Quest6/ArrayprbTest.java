package Quest6;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class ArrayprbTest {

	@Test
	public void check() {
		Arrayprb a = new Arrayprb();
		int b = a.array();
		assertEquals(1,b);
	}
}
