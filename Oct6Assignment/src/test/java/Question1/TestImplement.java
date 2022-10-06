package Question1;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class TestImplement {

	@Test
	public void evaluatesExpression() {
		Interemp11 i = new Interemp11();
		
	
		String test1 = i.name();
		String test2 = i.location();
		int test3 = i.id();
		int test4 = i.salary();
		int test5 = i.joining();
		String test6 = i.position();
		int test7 = i.members();
		String test8 = i.shift();
		
	
		
		assertEquals("Harsh",test1);
		assertEquals("Nashik",test2);
		assertEquals(111,test3);
		assertEquals(111,test4);
		assertEquals(3,test5);
		assertEquals("ASE",test6);
		assertEquals(5,test7);
		assertEquals("Day",test8);
		
		Interemp2 i1 = new Interemp2();
		
		
		String test9 = i1.name();
		String test10 = i1.location();
		int test11 = i1.id();
		int test12 = i1.salary();
		int test13 = i1.joining();
		String test14 = i1.position();
		int test15 = i1.members();
		String test16 = i1.shift();
		
	
		
		assertEquals("Abhijeet",test9);
		assertEquals("Delhi",test10);
		assertEquals(112,test11);
		assertEquals(112,test12);
		assertEquals(7,test13);
		assertEquals("Java Developer",test14);
		assertEquals(5,test15);
		assertEquals("Night",test16);
		
		Interemp3 i2 = new Interemp3();
		
		String test17 = i2.name();
		String test18 = i2.location();
		int test19 = i2.id();
		int test20 = i2.salary();
		int test21 = i2.joining();
		String test22 = i2.position();
		int test23 = i2.members();
		String test24 = i2.shift();
		
	
		
		assertEquals("Shreya",test17);
		assertEquals("Gurugram",test18);
		assertEquals(113,test19);
		assertEquals(113,test20);
		assertEquals(8,test21);
		assertEquals("SE",test22);
		assertEquals(5,test23);
		assertEquals("Night",test24);
	
	}
}