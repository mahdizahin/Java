import java.util.Scanner;
public class Basic{
	public static void main(String args []){

		Scanner sc = new Scanner(System.in);
		System.out.print("Enter a number : ");
			int num = sc.nextInt();


     if(num>10){
     	System.out.println(num +" is Greater than 10");
     }else{
     	System.out.println(num +" is Smaller than 10");
     }
	}
}