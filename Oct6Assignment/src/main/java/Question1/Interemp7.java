package Question1;

public class Interemp7 implements Employee1, Runnable{

	public String name() {
		// TODO Auto-generated method stub
		return "Akshat";
	}

	public String location() {
		// TODO Auto-generated method stub
		return "Bhopal";
	}

	public int id() {
		// TODO Auto-generated method stub
		return 117;
	}

	public int salary() {
		// TODO Auto-generated method stub
		return 117;
	}

	public int joining() {
		// TODO Auto-generated method stub
		return 10;
	}

	public String position() {
		// TODO Auto-generated method stub
		return "Consultant";
	}

	public int members() {
		// TODO Auto-generated method stub
		return 5;
	}

	public String shift() {
		// TODO Auto-generated method stub
		return "Hybrid";
	}
	
	public void run() {
		// TODO Auto-generated method stub
		System.out.println("Akshat");
	}
	
	public static void main(String args[] ) {
		Interemp7 e17 = new Interemp7();
		int id = e17.id();
		String name = e17.name();
		int salary = e17.salary();
		String position = e17.position();
		String location = e17.location();
		String shift = e17.shift();
		int joining = e17.joining();
		int members = e17.members();
		System.out.println(id);
		System.out.println(name);
		System.out.println(salary);
		System.out.println(position);
		System.out.println(location);
		System.out.println(joining);
		System.out.println(shift);
		System.out.println(members);
	}

	

}
