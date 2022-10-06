package Question1;

public class Interemp3 implements Employee1, Runnable{

	public String name() {
		// TODO Auto-generated method stub
		return "Shreya";
	}

	public String location() {
		// TODO Auto-generated method stub
		return "Gurugram";
	}

	public int id() {
		// TODO Auto-generated method stub
		return 113;
	}

	public int salary() {
		// TODO Auto-generated method stub
		return 113;
	}

	public int joining() {
		// TODO Auto-generated method stub
		return 8;
	}

	public String position() {
		// TODO Auto-generated method stub
		return "SE";
	}

	public int members() {
		// TODO Auto-generated method stub
		return 5;
	}

	public String shift() {
		// TODO Auto-generated method stub
		return "Night";
	}
	
	public void run() {
		// TODO Auto-generated method stub
		System.out.println("Shreya");
	}
	public static void main(String args[] ) {
		Interemp3 e13 = new Interemp3();
		int id = e13.id();
		String name = e13.name();
		int salary = e13.salary();
		String position = e13.position();
		String location = e13.location();
		String shift = e13.shift();
		int joining = e13.joining();
		int members = e13.members();
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
