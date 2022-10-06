package Question1;

public class Emp3 extends Employee implements Runnable{

	@Override
	int id() {
		// TODO Auto-generated method stub
		return 103;
	}

	@Override
	String name() {
		// TODO Auto-generated method stub
		return "Ashish";
	}

	@Override
	int salary() {
		// TODO Auto-generated method stub
		return 103;
	}

	@Override
	String position() {
		// TODO Auto-generated method stub
		return "Developer";
	}

	@Override
	int experience() {
		// TODO Auto-generated method stub
		return 3;
	}

	@Override
	String shift() {
		// TODO Auto-generated method stub
		return "Hybrid";
	}

	@Override
	String companyname() {
		// TODO Auto-generated method stub
		return "Exl";
	}

	@Override
	int members() {
		// TODO Auto-generated method stub
		return 6;
	}
	
	public void run() {
		// TODO Auto-generated method stub
		System.out.println("Ashish");
	}
	
	public static void main(String args[] ) {
		Emp3 e3 = new Emp3();
		int id = e3.id();
		String name = e3.name();
		int salary = e3.salary();
		String position = e3.position();
		int experience = e3.experience();
		String shift = e3.shift();
		String companyname = e3.companyname();
		int members = e3.members();
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
