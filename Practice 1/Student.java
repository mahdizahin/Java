public class Student extends Person  
{ 
 private String sid; 
 private float cgpa; 
 private int craditCompleted; 
 private int currentSemester; 
 private String dept; 
  
 public Student() 
 { 
  
 } 
 
 public Student(String name, int age, String email, int phone, String address ,String sid, float cgpa, int craditCompleted, int currentSemester, String dept) 
 { 
  super(name, age, email, phone, address); 
   
  this.sid = sid; 
  this.cgpa = cgpa; 
  this.craditCompleted = craditCompleted; 
  this.currentSemester = currentSemester; 
  this.dept = dept; 
 } 
 
 
 public void setValues(String name, int age, String email, int phone, String address ,String sid, float cgpa, int craditCompleted, int currentSemester, String dept) 
 { 
  super.setValues(name, age, email, phone, address); 
   
  this.sid = sid; 
  this.cgpa = cgpa; 
  this.craditCompleted = craditCompleted; 
  this.currentSemester = currentSemester; 
  this.dept = dept; 
 } 
 
 
 public void showInfo() 
 { 
  System.out.println(" "); 
 
  System.out.print("STUDENT INFORMATIONS"); 
 
  System.out.println(" "); 
 
  super.showInfo(); 
 
  System.out.println("Student ID: " + this.sid); 
  System.out.println("CGPA: " + this.cgpa); 
  System.out.println("Credit Completed: " + this.craditCompleted); 
  System.out.println("Current Semester: " + this.currentSemester); 
  System.out.println("Depertment: " + this.dept); 
 } 
  
}