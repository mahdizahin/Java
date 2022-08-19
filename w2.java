import java.util.Formatter;
import java.io.File;

public class w2{
	public static void main(String args[]){
 
		try{
      		 
      		 Formatter inText = new Formatter("E:/Java/File IO/ab.txt");
      		 inText.format("Ultron is not here");
      		 inText.close();

		}catch(Exception ex){
			System.out.println("Exception is "+ex);
		}
		
	}
}