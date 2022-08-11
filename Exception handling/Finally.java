public class Finally{
	public static void main(String args []){

 	try{

     int num1=15, num2=0;

     int result=num1/num2;                              //Exception is here

     System.out.println("Result us : " + result);
 }catch(ArrayStoreException ex){        
     System.out.println("Exception is : "+ex);
                                                        //Exception deal korte pare nai
 }                                                      //Tai finally use kora hyse 
 finally{                                               //J jonno program run korbe
      System.out.println("Last Line of the Code");
 }

   




	}
}