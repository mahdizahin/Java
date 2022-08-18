import java.io.File;
public class Pro {
	public static void main(String args []){

		File f1 = new File("Neo");
		String road = f1.getAbsolutePath();
		//File f2 = new File("E:/Java/File IO/Himo5/Neo/Min.txt");
		File f2 = new File(road+"/din.txt");
		try{
			f1.mkdir();
			f2.createNewFile();
			System.out.println(road);
		}catch(Exception ex){
			System.out.println(ex);
		}
		

	}
}