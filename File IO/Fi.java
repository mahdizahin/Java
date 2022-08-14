package File;
import java.io.File;
import java.util.Scanner;

public class Fi{
	
	public static void main(String args[]){
		
		Scanner sc = new Scanner(System.in);
		String name = sc.nextLine();

		File f1 = new File(name+".txt");
		f1.mkdir();
		f1.mkdirs();
		f1.delete();

		System.out.print("FIle io");
	}
}