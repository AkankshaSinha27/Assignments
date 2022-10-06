package Question5;

public class Joker implements Jokerinter{
	
	
	String Jokername;
	String Dance;

	Joker(){
	}
	
	Joker(String Jokername,String Dance){  
	    this.Jokername = Jokername;  
	    this.Dance = Dance;  
	    } 


public static void main(String args[]) {
	Joker a = new Joker();
	Joker a1 = new Joker("Joker1","Dance1");
	Joker b = new Joker();
	Joker b1 = new Joker("Joker2","Dance2");
	Joker c = new Joker();
	Joker c1 = new Joker("Joker3","Dance3");
	Joker d = new Joker();
	Joker d1 = new Joker("Joker4","Dance4");
	Joker e = new Joker();
	Joker e1 = new Joker("Joker5","Dance5");
	Joker f = new Joker();
	Joker f1 = new Joker("Joker6","Dance6");
	Joker g = new Joker();
	Joker g1 = new Joker("Joker7","Dance7");
	Joker h = new Joker();
	Joker h1 = new Joker("Joker8","Dance8");
	
	
	
	
	System.out.println(a.Jokername+" "+"dancing"+" "+a.Dance);
	System.out.println(a1.Jokername+" "+"dancing"+" "+a1.Dance);
	System.out.println(b.Jokername+" "+"dancing"+" "+b.Dance);
	System.out.println(b1.Jokername+" "+"dancing"+" "+b1.Dance);
	System.out.println(c.Jokername+" "+"dancing"+" "+c.Dance);
	System.out.println(c1.Jokername+" "+"dancing"+" "+c1.Dance);
	System.out.println(d.Jokername+" "+"dancing"+" "+d.Dance);
	System.out.println(d1.Jokername+" "+"dancing"+" "+d1.Dance);
	System.out.println(e.Jokername+" "+"dancing"+" "+e.Dance);
	System.out.println(e1.Jokername+" "+"dancing"+" "+e1.Dance);
	System.out.println(f.Jokername+" "+"dancing"+" "+f.Dance);
	System.out.println(f1.Jokername+" "+"dancing"+" "+f1.Dance);
	System.out.println(g.Jokername+" "+"dancing"+" "+g.Dance);
	System.out.println(g1.Jokername+" "+"dancing"+" "+g1.Dance);
	System.out.println(h.Jokername+" "+"dancing"+" "+h.Dance);
	System.out.println(h1.Jokername+" "+"dancing"+" "+h1.Dance);
	
	
	
	
}

public String dance() {
	return "Dance1";
}

public String dance2() {
	return "Dance2";
}

public String dance3() {
	return "Dance3";
}

public void dance(String Jokername, String name) {
	// TODO Auto-generated method stub
	
}}