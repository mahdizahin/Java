package area;

public class Main {
	public static void main( String []args ) {
		
		Shape r1 = new Ractangle(6,9);
		System.out.println("Area Of Ractangle "+r1.area()+" Meter");
		r1 = new Triangle(6,9);
		System.out.println("Area Of Triangle "+r1.area()+" Meter");
		
	}

}
