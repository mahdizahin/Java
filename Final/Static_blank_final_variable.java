 

public class Static_blank_final_variable {

	static final int limit;// Static blank final variable
	String appName= "Bkash";
	
	// Use static block for blank static final variable value initialization
	static  {
		limit = 25000; 
	}
	
	
	
	
	void display() {
		System.out.println("App name : "+ appName);
		System.out.println("Per Day Transfer limit : "+limit);
	}
	
	public static void main(String[] args) {
		 System.out.println( );
		 
		 Static_blank_final_variable Bkash = new Static_blank_final_variable();
		 Bkash.display();
	}

}
