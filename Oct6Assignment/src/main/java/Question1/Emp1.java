package Question1;

public class Emp1 extends Employee implements Runnable{

	@Override
	int id() {
		// TODO Auto-generated method stub
		return 101;
	}

	@Override
	String name() {
		// TODO Auto-generated method stub
		return "Akanksha";
	}

	@Override
	int salary() {
		// TODO Auto-generated method stub
		return 101;
	}

	@Override
	String position() {
		// TODO Auto-generated method stub
		return "Project Trainee";
	}

	@Override
	int experience() {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	String shift() {
		// TODO Auto-generated method stub
		return "Day";
	}

	@Override
	String companyname() {
		// TODO Auto-generated method stub
		return "Kpi";
	}

	@Override
	int members() {
		// TODO Auto-generated method stub
		return 4;
	}
	
	public void run() {
		// TODO Auto-generated method stub
		System.out.println("Akanksha");
	}
	
	
	public static void main(String args[] ) {
		
		Thread t1 = new Thread("First employee");
		t1.start();
		
		Emp1 e1 = new Emp1();
		int id = e1.id();
		String name = e1.name();
		int salary = e1.salary();
		String position = e1.position();
		int experience = e1.experience();
		String shift = e1.shift();
		String companyname = e1.companyname();
		int members = e1.members();
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
