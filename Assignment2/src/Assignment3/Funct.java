package Assignment3;

public class Funct {
		public static void main(String[] args) {
			int width=10;
			Functional2 d2 = ()-> {
				System.out.println("Draw"+width);
			};
			d2.draw();
		}
	}

