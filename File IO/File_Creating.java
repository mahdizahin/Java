package File;

import java.util.*;
import java.io.File;

public class File_Creating {

	public static void main(String args[]) {
		
		Scanner sc = new Scanner(System.in);
	   // String 	name = sc.nextLine();
	    String txt_type = sc.nextLine();
	    
	  //  File f1= new File(name);
	   // f1.mkdir();
	    File f2 = new File("mz.txt");
	    
	    
	   
	    
	    try {
	    	
	    	 f2.createNewFile();
//	    	 if( f2.createNewFile()) {
//	    		 System.out.println("FIle Created");
//	    	 }else {
//	    		 System.out.println("Something Wrong");
//	    	 }
	    }catch( Exception ex ) {
	    	System.out.println(ex);
	    }
	    finally {
	    	System.out.println("Please allah give me dhorjo");
	    }
	    /*if(f1.mkdir()) {
	    	System.out.println("FIle Created");
	    }else {
	    	System.out.println("Something Wrong");
	    }*/
	}
}
