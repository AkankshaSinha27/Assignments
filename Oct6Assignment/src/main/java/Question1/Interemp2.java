package Question1;

public class Interemp2 implements Employee1, Runnable{

	public String name() {
		// TODO Auto-generated method stub
		return "Abhijeet";
	}

	public String location() {
		// TODO Auto-generated method stub
		return "Delhi";
	}

	public int id() {
		// TODO Auto-generated method stub
		return 112;
	}

	public int salary() {
		// TODO Auto-generated method stub
		return 112;
	}

	public int joining() {
		// TODO Auto-generated method stub
		return 7;
	}

	public String position() {
		// TODO Auto-generated method stub
		return "Java Developer";
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
		System.out.println("Abhijeet");
	}
	
	public static void main(String args[] ) {
		Interemp2 e12 = new Interemp2();
		int id = e12.id();
		String name = e12.name();
		int salary = e12.salary();
		String position = e12.position();
		String location = e12.location();
		String shift = e12.shift();
		int joining = e12.joining();
		int members = e12.members();
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
