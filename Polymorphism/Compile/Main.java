package Compile;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		 Currency c1 = new 	Currency();
		 c1.consructor(6, 7);
		 c1.consructor(6.8, 7.9);
		 
		 System.out.print("Type Something for Passing String");
		 try (Scanner sc = new Scanner (System.in)) {
			String input = sc.nextLine();
			 
			 c1.consructor(input);
		}
	}

}
