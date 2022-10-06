package Question1;

public class Emp5 extends Employee implements Runnable{

	@Override
	int id() {
		// TODO Auto-generated method stub
		return 105;
	}

	@Override
	String name() {
		// TODO Auto-generated method stub
		return "Sanu";
	}

	@Override
	int salary() {
		// TODO Auto-generated method stub
		return 105;
	}

	@Override
	String position() {
		// TODO Auto-generated method stub
		return "Data Analyst";
	}

	@Override
	int experience() {
		// TODO Auto-generated method stub
		return 2;
	}

	@Override
	String shift() {
		// TODO Auto-generated method stub
		return "Flexible";
	}

	@Override
	String companyname() {
		// TODO Auto-generated method stub
		return "Amazon";
	}

	@Override
	int members() {
		// TODO Auto-generated method stub
		return 5;
	}
	
	public void run() {
		// TODO Auto-generated method stub
		System.out.println("Sanu");
	}
	public static void main(String args[] ) {
		Emp5 e5 = new Emp5();
		int id = e5.id();
		String name = e5.name();
		int salary = e5.salary();
		String position = e5.position();
		int experience = e5.experience();
		String shift = e5.shift();
		String companyname = e5.companyname();
		int members = e5.members();
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
