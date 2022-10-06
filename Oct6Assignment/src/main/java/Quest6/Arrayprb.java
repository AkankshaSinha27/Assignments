package Quest6;

import java.util.ArrayList;

public class Arrayprb {

	public int array() {
	ArrayList<String> list1= new ArrayList<String>();
	list1.add("hi");
	list1.add("b");
	list1.add("u");
	list1.add("w");
	
	ArrayList<String> list2= new ArrayList<String>();
	list2.add("hi");
	list2.add("a");
	list2.add("c");
	list2.add("d");
	list2.add("e");
	ArrayList<String> list3= new ArrayList<String>();
	list3.add("hi");
	list3.add("fi");
	list3.add("g");
	ArrayList<String> list4= new ArrayList<String>();
	list4.add("hi");
	list4.add("f");
	list4.add("i");
	ArrayList<String> list5= new ArrayList<String>();
	list5.add("j");
	list5.add("hi");
	list5.add("k");
	list5.add("l");
	
	list2.retainAll(list2);
	list2.retainAll(list3);
	list2.retainAll(list4);
	list2.retainAll(list5);
	
	System.out.println("Common value" +list1);
	String a= list1.get(0);
	int index = list5.indexOf(a);
	System.out.println("Index is "+ index);
	return index;
	}
	
	
	
}