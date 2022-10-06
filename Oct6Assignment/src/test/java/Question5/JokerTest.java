package Question5;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class JokerTest {

	@Test
	
	public void check() {
		Joker j1 = new Joker();
		String a = j1.dance();
		String b = j1.dance2();
		String c = j1.dance3();
		
		assertEquals("Dance1",a);
		assertEquals("Dance2",b);
		assertEquals("Dance3",c);
		
	}
	
}
