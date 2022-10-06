package Quest7;

import java.util.HashSet;
import java.util.Set;

public class Setprb {

	public int size() {
	Set<Integer> num = new HashSet<Integer>();
	num.add(1);
	num.add(2);
	num.add(3);
	num.add(4);
	num.add(5);
	num.add(6);
	num.add(7);
	num.add(8);
	num.add(9);
	num.add(10);
	num.add(1);
	num.add(2);
	num.add(3);
	num.add(4);
	num.add(5);
	num.add(6);
	num.add(7);
	num.add(8);
	num.add(9);
	num.add(10);
	
	int element =0;
	for(int x : num) {
		element=x;
	}
	System.out.println("last element" + element);
	
	return element;
	
	}
	public static void main(String args[]) {
		Setprb s = new Setprb();
		s.size();
	
}
}