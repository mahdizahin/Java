//package SendingMassage;
//import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		System.out.print("Please Type For Sending : ");
		Scanner sc = new Scanner(System.in);
		
		String sender =  sc.nextLine();
		String Reciever =  sc.nextLine();
		
		 
		
		 MassageClass massage;
		 massage = new SendClass();
		 massage.display(sender );
	 
		 massage = new RecieveMessage();
		 massage.display(Reciever);

	}

}
