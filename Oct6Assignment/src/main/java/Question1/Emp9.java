package Question1;

public class Emp9 extends Employee implements Runnable{

	@Override
	int id() {
		// TODO Auto-generated method stub
		return 109;
	}

	@Override
	String name() {
		// TODO Auto-generated method stub
		return "Gayathri";
	}

	@Override
	int salary() {
		// TODO Auto-generated method stub
		return 109;
	}

	@Override
	String position() {
		// TODO Auto-generated method stub
		return "ASE";
	}

	@Override
	int experience() {
		// TODO Auto-generated method stub
		return 1;
	}

	@Override
	String shift() {
		// TODO Auto-generated method stub
		return "Night";
	}

	@Override
	String companyname() {
		// TODO Auto-generated method stub
		return "EY";
	}

	@Override
	int members() {
		// TODO Auto-generated method stub
		return 5;
	}
	
	public void run() {
		// TODO Auto-generated method stub
		System.out.println("Gayathri");
	}
	
	public static void main(String args[] ) {
		Emp9 e9 = new Emp9();
		int id = e9.id();
		String name = e9.name();
		int salary = e9.salary();
		String position = e9.position();
		int experience = e9.experience();
		String shift = e9.shift();
		String companyname = e9.companyname();
		int members = e9.members();
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
