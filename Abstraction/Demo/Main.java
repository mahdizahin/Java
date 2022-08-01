package Demo;

public class Main {

	public static void main(String[] args) {
		Massage m1;
		
		m1 = new SendMassage();
		m1.display(6,9);
		
		m1= new RecieveMassage();
        m1.display(0,0);
        
        
        

	}

}
