package Assignment1;

public class Laptop {
	
	int Price;
	String brand;
	int Weight;
	int Screensize;
	
	
	public Laptop(int Pricee) {
		Price = Pricee;
	}

	
	public Laptop(int Pricee,String brandd) {
		Price = Pricee;
		brand = brandd;
	}
	
	public Laptop(String brandd, int weight, int screensize) {
		brand=brandd;
		Weight=weight;
		Screensize=screensize;
		
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
     Laptop lappi1 = new Laptop(50000);
     Laptop lappi2 = new Laptop(80000,"Asus");
     Laptop lappi3 = new Laptop(50000);
     Laptop lappi4 = new Laptop("Lenovo",2,15);
     Laptop lappi5 = new Laptop(500000,"Mac");
     
     
     
     System.out.println(lappi1.Price);
     System.out.println(lappi2.brand);
     System.out.println(lappi3.Price);
     System.out.println(lappi4.Screensize);
     System.out.println(lappi5.brand);
     
	}

}
