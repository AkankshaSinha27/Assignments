
package Question1;
import static org.junit.Assert.assertEquals;

import org.junit.Test;

import Question1.Emp1;



public class TestAbstract {

	@Test
	public void evaluatesExpression() {
		Emp1 m = new Emp1();
		
		int testcase1 = m.id();
		String testcase2 = m.name();
		int testcase3 = m.salary();
		String testcase4 = m.position();
		int testcase5 = m.experience();
		String testcase6 = m.shift();
		String testcase7 = m.companyname();
		int testcase8 = m.members();
		
		
		
		
		assertEquals(101,testcase1);
		assertEquals("Akanksha",testcase2);
		assertEquals(101,testcase3);
		assertEquals("Project Trainee",testcase4);
		assertEquals(0,testcase5);
		assertEquals("Day",testcase6);
		assertEquals("Kpi",testcase7);
		assertEquals(4,testcase8);

		
		
		
Emp2 m1 = new Emp2();
		
		int testcase9 = m1.id();
		String testcase10 = m1.name();
		int testcase11 = m1.salary();
		String testcase12 = m1.position();
		int testcase13 = m1.experience();
		String testcase14 = m1.shift();
		String testcase15 = m1.companyname();
		int testcase16 = m1.members();
		
		
		
		
		assertEquals(102,testcase9);
		assertEquals("Bhawana",testcase10);
		assertEquals(102,testcase11);
		assertEquals("Electrical Eng",testcase12);
		assertEquals(2,testcase13);
		assertEquals("Night",testcase14);
		assertEquals("Jindal",testcase15);
		assertEquals(5,testcase16);
		
	
	
	
	Emp3 m2 = new Emp3();
	
	int testcase17 = m2.id();
	String testcase18 = m2.name();
	int testcase19 = m2.salary();
	String testcase20 = m2.position();
	int testcase21 = m2.experience();
	String testcase22 = m2.shift();
	String testcase23 = m2.companyname();
	int testcase24 = m2.members();
	
	
	
	
	assertEquals(103,testcase17);
	assertEquals("Ashish",testcase18);
	assertEquals(103,testcase19);
	assertEquals("Developer",testcase20);
	assertEquals(3,testcase21);
	assertEquals("Hybrid",testcase22);
	assertEquals("Exl",testcase23);
	assertEquals(6,testcase24);
	
Emp4 m3 = new Emp4();
	
	int testcase25 = m3.id();
	String testcase26 = m3.name();
	int testcase27 = m3.salary();
	String testcase28 = m3.position();
	int testcase29 = m3.experience();
	String testcase30 = m3.shift();
	String testcase31 = m3.companyname();
	int testcase32 = m3.members();
	
	
	
	
	assertEquals(104,testcase25);
	assertEquals("Ruchika",testcase26);
	assertEquals(104,testcase27);
	assertEquals("Testing",testcase28);
	assertEquals(3,testcase29);
	assertEquals("Day",testcase30);
	assertEquals("Tansunion",testcase31);
	assertEquals(5,testcase32);

	
Emp5 m4 = new Emp5();
	
	int testcase33 = m4.id();
	String testcase34 = m4.name();
	int testcase35 = m4.salary();
	String testcase36 = m4.position();
	int testcase37 = m4.experience();
	String testcase38 = m4.shift();
	String testcase39 = m4.companyname();
	int testcase40 = m4.members();
	
	
	
	
	assertEquals(105,testcase33);
	assertEquals("Sanu",testcase34);
	assertEquals(105,testcase35);
	assertEquals("Data Analyst",testcase36);
	assertEquals(2,testcase37);
	assertEquals("Flexible",testcase38);
	assertEquals("Amazon",testcase39);
	assertEquals(5,testcase40);
	
	
Emp6 m5 = new Emp6();
	
	int testcase41 = m5.id();
	String testcase42 = m5.name();
	int testcase43 = m5.salary();
	String testcase44 = m5.position();
	int testcase45 = m5.experience();
	String testcase46 = m5.shift();
	String testcase47 = m5.companyname();
	int testcase48 = m5.members();
	
	
	
	
	assertEquals(106,testcase41);
	assertEquals("Rohit",testcase42);
	assertEquals(106,testcase43);
	assertEquals("Developer",testcase44);
	assertEquals(6,testcase45);
	assertEquals("Day",testcase46);
	assertEquals("TCS",testcase47);
	assertEquals(7,testcase48);
	
Emp7 m6 = new Emp7();
	
	int testcase49 = m6.id();
	String testcase50 = m6.name();
	int testcase51 = m6.salary();
	String testcase52 = m6.position();
	int testcase53 = m6.experience();
	String testcase54 = m6.shift();
	String testcase55 = m6.companyname();
	int testcase56 = m6.members();
	
	
	
	
	assertEquals(107,testcase49);
	assertEquals("Kapil",testcase50);
	assertEquals(107,testcase51);
	assertEquals("Phd",testcase52);
	assertEquals(7,testcase53);
	assertEquals("Hybrid",testcase54);
	assertEquals("IIT",testcase55);
	assertEquals(6,testcase56);
	
Emp8 m7 = new Emp8();
	
	int testcase57 = m7.id();
	String testcase58 = m7.name();
	int testcase59 = m7.salary();
	String testcase60 = m7.position();
	int testcase61 = m7.experience();
	String testcase62 = m7.shift();
	String testcase63 = m7.companyname();
	int testcase64 = m7.members();
	
	
	
	
	assertEquals(108,testcase57);
	assertEquals("Shane",testcase58);
	assertEquals(108,testcase59);
	assertEquals("Mechanical Eng",testcase60);
	assertEquals(2,testcase61);
	assertEquals("Day",testcase62);
	assertEquals("Shell",testcase63);
	assertEquals(4,testcase64);
	
	

}
}
