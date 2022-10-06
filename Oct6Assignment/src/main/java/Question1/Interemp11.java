package Question1;

public class Interemp11 implements Employee1, Runnable{

	public String name() {
		// TODO Auto-generated method stub
		return "Harsh";
	}

	public String location() {
		// TODO Auto-generated method stub
		return "Nashik";
	}

	public int id() {
		// TODO Auto-generated method stub
		return 111;
	}

	public int salary() {
		// TODO Auto-generated method stub
		return 111;
	}

	public int joining() {
		// TODO Auto-generated method stub
		return 3;
	}

	public String position() {
		// TODO Auto-generated method stub
		return "ASE";
	}

	public int members() {
		// TODO Auto-generated method stub
		return 5;
	}

	public String shift() {
		// TODO Auto-generated method stub
		return "Day";
	}
	
	public void run() {
		// TODO Auto-generated method stub
		System.out.println("Harsh");
	}
	public static void main(String args[] ) {
		Interemp11 e11 = new Interemp11();
		int id = e11.id();
		String name = e11.name();
		int salary = e11.salary();
		String position = e11.position();
		String location = e11.location();
		String shift = e11.shift();
		int joining = e11.joining();
		int members = e11.members();
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
