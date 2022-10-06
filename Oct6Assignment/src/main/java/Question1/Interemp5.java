package Question1;

public class Interemp5 implements Employee1, Runnable{

	public String name() {
		// TODO Auto-generated method stub
		return "Mahima";
	}

	public String location() {
		// TODO Auto-generated method stub
		return "Udaipur";
	}

	public int id() {
		// TODO Auto-generated method stub
		return 115;
	}

	public int salary() {
		// TODO Auto-generated method stub
		return 115;
	}

	public int joining() {
		// TODO Auto-generated method stub
		return 20;
	}

	public String position() {
		// TODO Auto-generated method stub
		return "Teacher";
	}

	public int members() {
		// TODO Auto-generated method stub
		return 4;
	}

	public String shift() {
		// TODO Auto-generated method stub
		return "Hybrid";
	}
	
	public void run() {
		// TODO Auto-generated method stub
		System.out.println("Mahima");
	}
	
	public static void main(String args[] ) {
		Interemp5 e15 = new Interemp5();
		int id = e15.id();
		String name = e15.name();
		int salary = e15.salary();
		String position = e15.position();
		String location = e15.location();
		String shift = e15.shift();
		int joining = e15.joining();
		int members = e15.members();
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
