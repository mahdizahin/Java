
public class Final {

	final int limit = 25000; //Constant Value #not Changeable
	String appName= "Bkash";
 
	void display() {
		System.out.println("App name : "+ appName);
		System.out.println("Per Day Transfer limit : "+limit);
	}
	
	public static void main(String[] args) {
		 System.out.println( );
		 
		 Final Bkash = new Final();
		 Bkash.display();
	}

}
