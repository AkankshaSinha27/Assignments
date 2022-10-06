package Question1;

public class Emp6 extends Employee implements Runnable{

	@Override
	int id() {
		// TODO Auto-generated method stub
		return 106;
	}

	@Override
	String name() {
		// TODO Auto-generated method stub
		return "Rohit";
	}

	@Override
	int salary() {
		// TODO Auto-generated method stub
		return 106;
	}

	@Override
	String position() {
		// TODO Auto-generated method stub
		return "Developer";
	}

	@Override
	int experience() {
		// TODO Auto-generated method stub
		return 6;
	}

	@Override
	String shift() {
		// TODO Auto-generated method stub
		return "Day";
	}

	@Override
	String companyname() {
		// TODO Auto-generated method stub
		return "TCS";
	}

	@Override
	int members() {
		// TODO Auto-generated method stub
		return 7;
	}
	
	public void run() {
		// TODO Auto-generated method stub
		System.out.println("Rohit");
	}
	
	public static void main(String args[] ) {
		Emp6 e6 = new Emp6();
		int id = e6.id();
		String name = e6.name();
		int salary = e6.salary();
		String position = e6.position();
		int experience = e6.experience();
		String shift = e6.shift();
		String companyname = e6.companyname();
		int members = e6.members();
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
