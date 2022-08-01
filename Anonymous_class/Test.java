package Anonymous_class;

public class Test {

	public static void main(String[] args) {
		 
		Country Norway = new Country() {
			void display() {
				System.out.println("Print From Anonymous Class");
			}
		};
		
		Norway.display();
	}

}
