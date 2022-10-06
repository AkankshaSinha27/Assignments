package practice2;

import java.util.Scanner;

public class Percen {

	
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner s = new Scanner(System.in);
	
		int a = s.nextInt();
		int b = s.nextInt();
		int c = s.nextInt();
		int d = s.nextInt();
		System.out.println("String value");
		String e = s.next();
		System.out.println("String value 2");
		String g = s.nextLine();
		
		int f = (a + b + c + d ) / 5;
		System.out.println("Result is " + f);
		System.out.println(e);
		System.out.println(g);
		

	}

}
