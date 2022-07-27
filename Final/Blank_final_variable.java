public class Blank_final_variable {

	final int limit;//blank final variable
	String appName= "Bkash";
	
	// Use Constructor for blank final variable value initialization
	public Blank_final_variable() {
		limit = 25000; 
	}
	
	
	
	
	void display() {
		System.out.println("App name : "+ appName);
		System.out.println("Per Day Transfer limit : "+limit);
	}
	
	public static void main(String[] args) {
		 System.out.println( );
		 
		 Blank_final_variable Bkash = new Blank_final_variable();
		 Bkash.display();
	}

}
