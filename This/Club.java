 

public class Club {
    String cName;
	int member;
	double fund;
	
	public Club(String cName,int member) {
		this.cName=cName;
		this.member=member;
	}
	public Club(String cName,int member,double fund ) {
		this(cName,member);
		this.fund=fund;
		 
	}
	
	void display() {
		System.out.println("Club Name : "+cName);
		System.out.println("Total Club Member : "+member+" Person");
	}
	
	void display2() {
		this.display();
		System.out.println("Total Money : "+fund+" USD");
	}
}
