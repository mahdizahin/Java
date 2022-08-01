package Final;

public class Uv {

	final String name;
	
	static final int num;
	
	Uv(){
		name="ZAHIN";
	}
 
	static {
		num=45;
	}
	
	
	void display() {
		System.out.println(name);
		System.out.println(num);
	}
}
