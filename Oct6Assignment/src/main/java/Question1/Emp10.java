package Question1;

public class Emp10 extends Employee implements Runnable{

	@Override
	int id() {
		// TODO Auto-generated method stub
		return 110;
	}

	@Override
	String name() {
		// TODO Auto-generated method stub
		return "Richa";
	}

	@Override
	int salary() {
		// TODO Auto-generated method stub
		return 1000;
	}

	@Override
	String position() {
		// TODO Auto-generated method stub
		return "GET";
	}

	@Override
	int experience() {
		// TODO Auto-generated method stub
		return 1;
	}

	@Override
	String shift() {
		// TODO Auto-generated method stub
		return "Day";
	}

	@Override
	String companyname() {
		// TODO Auto-generated method stub
		return "Vedanta";
	}

	@Override
	int members() {
		// TODO Auto-generated method stub
		return 4;
	}
	
	public void run() {
		// TODO Auto-generated method stub
		System.out.println("Richa");
	}
	
	public static void main(String args[] ) {
		
		
		Emp10 e10 = new Emp10();
		int id = e10.id();
		String name = e10.name();
		int salary = e10.salary();
		String position = e10.position();
		int experience = e10.experience();
		String shift = e10.shift();
		String companyname = e10.companyname();
		int members = e10.members();
		System.out.println(id);
		System.out.println(name);
		System.out.println(salary);
		System.out.println(position);
		System.out.println(experience);
		System.out.println(shift);
		System.out.println(companyname);
		System.out.println(members);
	}

	

}
