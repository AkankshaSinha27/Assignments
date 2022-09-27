package abstract_inheritance;

public class rooms extends House{

	@Override
	int rooms() {
		// TODO Auto-generated method stub
		return 4;
	}

	@Override
	String name() {
		// TODO Auto-generated method stub
		return "living room";
	}

	@Override
	int floors() {
		// TODO Auto-generated method stub
		return 2;
	}

}
