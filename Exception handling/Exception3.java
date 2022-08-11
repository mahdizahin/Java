 

public class Exception3 {
public static void main(String[] args) {
		
		try {
			int x = 10;
			int y = 0;
			int divison = x/y;
			System.out.println(divison);
		}
		catch(ArrayIndexOutOfBoundsException e1){
			System.out.println(e1);
		}
		catch(ArithmeticException e2){
			System.out.println("Exception is : "+e2);
		}
		finally {
			System.out.println("Used finally for still working");
			System.out.println("Heinon working y");
		}
		
		
	}
}
