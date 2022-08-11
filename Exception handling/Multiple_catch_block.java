

public class Multiple_catch_block{
	public static void main(String args []){

 	try{

     int num1=15, num2=0;

     int result=num1/num2;                              //Exception is here

     System.out.println("Result us : " + result);
 }catch(ArrayStoreException ex){        
     System.out.println("Exception is : "+ex);
                                                        //Exception deal korte pare nai
 }   
 catch(Exception ex2){        
     System.out.println("Exception is : "+ex2);
                                                        //Exception deal korte parbe
 }                                                       
 finally{                                               //J jonno program run korbe
      System.out.println("Last Line of the Code");
 }

   




	}
}