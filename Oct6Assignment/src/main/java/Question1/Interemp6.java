package Question1;

public class Interemp6 implements Employee1, Runnable{

	public String name() {
		// TODO Auto-generated method stub
		return "Adhirath";
	}

	public String location() {
		// TODO Auto-generated method stub
		return "Mumbai";
	}

	public int id() {
		// TODO Auto-generated method stub
		return 116;
	}

	public int salary() {
		// TODO Auto-generated method stub
		return 116;
	}

	public int joining() {
		// TODO Auto-generated method stub
		return 23;
	}

	public String position() {
		// TODO Auto-generated method stub
		return "Data Scientist";
	}

	public int members() {
		// TODO Auto-generated method stub
		return 5;
	}

	public String shift() {
		// TODO Auto-generated method stub
		return "WFH";
	}
	
	public void run() {
		// TODO Auto-generated method stub
		System.out.println("Adhirath");
	}
	
	public static void main(String args[] ) {
		Interemp6 e16 = new Interemp6();
		int id = e16.id();
		String name = e16.name();
		int salary = e16.salary();
		String position = e16.position();
		String location = e16.location();
		String shift = e16.shift();
		int joining = e16.joining();
		int members = e16.members();
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
