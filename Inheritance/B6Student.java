public class B6Student extends B6Account {
private	double balance;
	
   public B6Student(String name, int id,double balance) {
		super(name, id);
		this.balance=balance;
		// TODO Auto-generated constructor stub
	}
  
  void show() {
	  super.show();
	  System.out.println("Account Balance "+balance);
  }

}
