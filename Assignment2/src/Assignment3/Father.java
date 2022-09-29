package Assignment3;

public class Father extends Family{

	@Override
	int members() {
		// TODO Auto-generated method stub
		return 4;
	}

	@Override
	String SeniorMemberName() {
		// TODO Auto-generated method stub
		return "Anil";
	}

	@Override
	String Occupation() {
		// TODO Auto-generated method stub
		return "Engineer";
	}

	public static void main(String args[])
	{
		Father obj1= new Father();
		System.out.println(obj1.members());
		System.out.println(obj1.SeniorMemberName());
				
	}
	
}
