 

public class Exception1 {
	public static void main(String[] args) {
		
		try {
			int x = 10;
			int y = 00;
			int divison = x/y;
			System.out.println(divison);
		}
		catch(Exception e){
			System.out.println("Exception is : "+e);
		}
		finally {
			System.out.println("Used finally for still working");
		}
		System.out.println("Heinon workin");
		
	}
}
