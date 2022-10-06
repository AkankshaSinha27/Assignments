package Question1;

public class Emp2 extends Employee implements Runnable{

	@Override
	int id() {
		// TODO Auto-generated method stub
		return 102;
	}

	@Override
	String name() {
		// TODO Auto-generated method stub
		return "Bhawana";
	}

	@Override
	int salary() {
		// TODO Auto-generated method stub
		return 102;
	}

	@Override
	String position() {
		// TODO Auto-generated method stub
		return "Electrical Eng";
	}

	@Override
	int experience() {
		// TODO Auto-generated method stub
		return 2;
	}

	@Override
	String shift() {
		// TODO Auto-generated method stub
		return "Night";
	}

	@Override
	String companyname() {
		// TODO Auto-generated method stub
		return "Jindal";
	}

	@Override
	int members() {
		// TODO Auto-generated method stub
		return 5;
	}
	
	public void run() {
		// TODO Auto-generated method stub
		System.out.println("Bhawana");
	}
	public static void main(String args[] ) {
		Emp2 e2 = new Emp2();
		int id = e2.id();
		String name = e2.name();
		int salary = e2.salary();
		String position = e2.position();
		int experience = e2.experience();
		String shift = e2.shift();
		String companyname = e2.companyname();
		int members = e2.members();
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
