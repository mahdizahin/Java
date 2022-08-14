package File;
import java.io.File;

public class Basic {

	public static void main(String[] args) {
		
		File dir = new File("iugwf");
		dir.mkdir();
		dir.delete();
		System.out.println("ILYsm\n"+dir.getAbsolutePath());
	
		if(dir.delete()) {
			System.out.println("Congratulation You Hacked nasa By deleting this Dir");
	}

	}

}
