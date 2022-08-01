package first;

import java.util.LinkedList;

public class Final {
	
	
	public static void main(String args[]) {

		 LinkedList<String> Cars = new  LinkedList<String>();
		 
		 Cars.add("Audi");
		 Cars.add("Tesla");
		 Cars.add("Miko");
		 Cars.add("Mars Rover");
		 Cars.remove("Miko");
		 Cars.addFirst("Al Burakh");
		 
		 System.out.println(Cars);
		 
		 
		 LinkedList<String> Car = new  LinkedList<String>();
		 
		 Car.add("Audi");
		 Car.add("Tesla");
		 Car.add("Miko");
		 Car.add("Mars Rover");
		 Car.remove("f");
		 
		 
		// System.out.println(Car[]);
	}
	
	
	
}
