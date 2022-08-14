import java.io.File;

public class Notes{
	public static void main(String args[]){
		File n1 = new File("Go.txt");
		
		try{
              
              n1.createNewFile();

		}catch(Exception ex){

		}
	}
}