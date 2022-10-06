package Question1;

public class Emp7 extends Employee implements Runnable{

	@Override
	int id() {
		// TODO Auto-generated method stub
		return 107;
	}

	@Override
	String name() {
		// TODO Auto-generated method stub
		return "Kapil";
	}

	@Override
	int salary() {
		// TODO Auto-generated method stub
		return 107;
	}

	@Override
	String position() {
		// TODO Auto-generated method stub
		return "Phd";
	}

	@Override
	int experience() {
		// TODO Auto-generated method stub
		return 7;
	}

	@Override
	String shift() {
		// TODO Auto-generated method stub
		return "Hybrid";
	}

	@Override
	String companyname() {
		// TODO Auto-generated method stub
		return "IIT";
	}

	@Override
	int members() {
		// TODO Auto-generated method stub
		return 6;
	}
	
	public void run() {
		// TODO Auto-generated method stub
		System.out.println("Kapil");
	}
	
	public static void main(String args[] ) {
		Emp7 e7 = new Emp7();
		int id = e7.id();
		String name = e7.name();
		int salary = e7.salary();
		String position = e7.position();
		int experience = e7.experience();
		String shift = e7.shift();
		String companyname = e7.companyname();
		int members = e7.members();
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
