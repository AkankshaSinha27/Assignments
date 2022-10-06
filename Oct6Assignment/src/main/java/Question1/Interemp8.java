package Question1;

public class Interemp8 implements Employee1, Runnable{

	public String name() {
		// TODO Auto-generated method stub
		return "Aditi";
	}

	public String location() {
		// TODO Auto-generated method stub
		return "Malda";
	}

	public int id() {
		// TODO Auto-generated method stub
		return 118;
	}

	public int salary() {
		// TODO Auto-generated method stub
		return 118;
	}

	public int joining() {
		// TODO Auto-generated method stub
		return 6;
	}

	public String position() {
		// TODO Auto-generated method stub
		return "Professor";
	}

	public int members() {
		// TODO Auto-generated method stub
		return 4;
	}

	public String shift() {
		// TODO Auto-generated method stub
		return "Half Day";
	}
	
	public void run() {
		// TODO Auto-generated method stub
		System.out.println("Aditi");
	}
	
	public static void main(String args[] ) {
		Interemp8 e18 = new Interemp8();
		int id = e18.id();
		String name = e18.name();
		int salary = e18.salary();
		String position = e18.position();
		String location = e18.location();
		String shift = e18.shift();
		int joining = e18.joining();
		int members = e18.members();
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
