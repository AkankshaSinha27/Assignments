package Question1;

public class Emp4 extends Employee implements Runnable{

	@Override
	int id() {
		// TODO Auto-generated method stub
		return 104;
	}

	@Override
	String name() {
		// TODO Auto-generated method stub
		return "Ruchika";
	}

	@Override
	int salary() {
		// TODO Auto-generated method stub
		return 104;
	}

	@Override
	String position() {
		// TODO Auto-generated method stub
		return "Testing";
	}

	@Override
	int experience() {
		// TODO Auto-generated method stub
		return 3;
	}

	@Override
	String shift() {
		// TODO Auto-generated method stub
		return "Day";
	}

	@Override
	String companyname() {
		// TODO Auto-generated method stub
		return "Tansunion";
	}

	@Override
	int members() {
		// TODO Auto-generated method stub
		return 5;
	}
	public void run() {
		// TODO Auto-generated method stub
		System.out.println("Ruchika");
	}
	
	public static void main(String args[] ) {
		Emp4 e4 = new Emp4();
		int id = e4.id();
		String name = e4.name();
		int salary = e4.salary();
		String position = e4.position();
		int experience = e4.experience();
		String shift = e4.shift();
		String companyname = e4.companyname();
		int members = e4.members();
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
