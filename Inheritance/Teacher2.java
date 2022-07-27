 

public class Teacher2 extends Person2 {
	
	  private String subject;
	  
	  public void setsubject (String subject) {
			this.subject=subject;
		}
		public String getsubject() {
			return subject;
		}
	

	 void show2(){
		 show1();
		 System.out.println("Subject : "+getsubject());
}
}