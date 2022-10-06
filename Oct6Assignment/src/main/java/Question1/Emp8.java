package Question1;

public class Emp8 extends Employee implements Runnable{

	@Override
	int id() {
		// TODO Auto-generated method stub
		return 108;
	}

	@Override
	String name() {
		// TODO Auto-generated method stub
		return "Shane";
	}

	@Override
	int salary() {
		// TODO Auto-generated method stub
		return 108;
	}

	@Override
	String position() {
		// TODO Auto-generated method stub
		return "Mechanical Eng";
	}

	@Override
	int experience() {
		// TODO Auto-generated method stub
		return 2;
	}

	@Override
	String shift() {
		// TODO Auto-generated method stub
		return "Day";
	}

	@Override
	String companyname() {
		// TODO Auto-generated method stub
		return "Shell";
	}

	@Override
	int members() {
		// TODO Auto-generated method stub
		return 4;
	}
	
	public void run() {
		// TODO Auto-generated method stub
		System.out.println("Shane");
	} 
	public static void main(String args[] ) {
		Emp8 e8 = new Emp8();
		int id = e8.id();
		String name = e8.name();
		int salary = e8.salary();
		String position = e8.position();
		int experience = e8.experience();
		String shift = e8.shift();
		String companyname = e8.companyname();
		int members = e8.members();
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
