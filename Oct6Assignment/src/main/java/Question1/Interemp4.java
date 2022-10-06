package Question1;

public class Interemp4 implements Employee1, Runnable{

	public String name() {
		// TODO Auto-generated method stub
		return "Archana";
	}

	public String location() {
		// TODO Auto-generated method stub
		return "Bhilwara";
	}

	public int id() {
		// TODO Auto-generated method stub
		return 114;
	}

	public int salary() {
		// TODO Auto-generated method stub
		return 114;
	}

	public int joining() {
		// TODO Auto-generated method stub
		return 21;
	}

	public String position() {
		// TODO Auto-generated method stub
		return "GET";
	}

	public int members() {
		// TODO Auto-generated method stub
		return 4;
	}

	public String shift() {
		// TODO Auto-generated method stub
		return "Day";
	}
	
	public void run() {
		// TODO Auto-generated method stub
		System.out.println("Archana");
	}
	
	public static void main(String args[] ) {
		Interemp4 e14 = new Interemp4();
		int id = e14.id();
		String name = e14.name();
		int salary = e14.salary();
		String position = e14.position();
		String location = e14.location();
		String shift = e14.shift();
		int joining = e14.joining();
		int members = e14.members();
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
