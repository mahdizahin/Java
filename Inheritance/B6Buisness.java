public class B6Buisness extends B6Student {
	private	double balances;
	
	public B6Buisness(String name, int id,double balance,double balances ) {
		super(name, id,balance);
		this.balances=balances;
	}
	 
	  void show() {
		  super.show();
		  System.out.println("Account Balances for buisness "+balances);
	  }

	
}
