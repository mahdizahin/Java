package File;
import java.io.*;
import java.util.*;

public class onePlus {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		System.out.print("Insert Folder Name : ");
		String fldr_name = input.nextLine();
		
		System.out.print("Insert File Name : ");
		String File_name = input.nextLine();
		
		System.out.print("Insert File Extention type : ");
		String File_ext_type = input.nextLine();
		
		File folder = new File(fldr_name);
		String path = folder.getAbsolutePath();
		File file1 = new File(path+"/"+File_name+"."+File_ext_type);
		try {
			//folder.mkdir();
			 if(folder.mkdir()) {
				 System.out.println("Folder "+fldr_name+" has been Successfully Created");
			 }else {
				 System.out.println("Folder is NOT Created");
			 }
			
			if(file1.createNewFile()) {
				 System.out.println("File has been Successfully Created");
			}
			else {
				 System.out.println("File is NOT Created");
			 }
			
			
		}catch(Exception ex) {
			System.out.println(ex);
		}
	}

}
