package first;

public class Test {
	public static void main(String args[]) {
		Start sammy = new Start("Sammy COW",58);
		sammy.display();
		
		Cart GreenCart = new Cart("Green Cart",0001,"French Fry",10);
		GreenCart.display();
		
		Agro V = new Agro("Farmi agro",89,"Bulgerian Bull",170000.90);
		V.display();
	}
}
