import java.util.*;
import java.io.File;

public class Fox{
	public static void main(String args[]){

		File folder = new File("Beat");

		folder.mkdir();
		String path = folder.getAbsolutePath();
		File file1 = new File(path+"/Ultron.txt");
		try{
      		  file1.createNewFile();
      		  String file_path = file1.getAbsolutePath();

      		 Formatter inText = new Formatter(file_path);
      		 Scanner input= new Scanner(System.in);
      		 System.out.println("Write somthing in file");
      		 String inf= input.nextLine();
      		 inText.format(inf);
      		 inText.close();

		}catch(Exception ex){
			System.out.println("Exception is "+ex);
		}
		
	}
}