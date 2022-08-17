package swichCase;
import java.util.Scanner;
public class Money_Trans {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("1. Money Transfer\n2. Send Money\n3. Payment\n4. Check Balance\n5. Home ");
		int num = sc.nextInt();
		
		if (num<7) {
		
		switch(num){
			case 1 :
				System.out.println("Transection Complete");
				break;
			case 2 :
				 
				System.out.println("Enter Reciever Number");
				
				break;
			case 3 :
				System.out.println("Enter Marchant Number");
				break;
			case 4 :
				System.out.println("Check Balance");
				break;
			case 5 :
				System.out.println("Here is Home");
				break;
				
		}

	}else {
		System.out.println("You typed Wrong");
	}
	
		
	}

}
