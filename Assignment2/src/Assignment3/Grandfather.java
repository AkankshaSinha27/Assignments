package Assignment3;

public class Grandfather extends Family{

	@Override
	int members() {
		// TODO Auto-generated method stub
		return 6;
	}

	@Override
	String SeniorMemberName() {
		// TODO Auto-generated method stub
		return "Gopal";
	}

	@Override
	String Occupation() {
		// TODO Auto-generated method stub
		return "Doctor";
	}

	public static void main(String args[])
	{
		Grandfather obj1= new Grandfather();
		System.out.println(obj1.members());
		System.out.println(obj1.SeniorMemberName());
				
	}
}
