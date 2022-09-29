package Assignment3;

@FunctionalInterface
public interface Interface1 {

	void cal();
	
}

public class void main(String args[])
{
	int a =5;
	
	Interface1 s = (int x) -> x+x;
	
	
	
	int y= s.cal(a);
	System.out.println(y);
}
}