package Quest3;

public class Super1 {

  String food="Cake";
	
}

class Type extends Super1{
	String food1="ice cream";
	
	void drink() {
		System.out.println(food1);
		System.out.println(super.food);
	}
}

class Super2{
	public static void main(String args[])
	{
		Type obj = new Type();
		obj.drink();
	}
	
}