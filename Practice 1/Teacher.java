public class Teacher extends Person  
{ 
 private String tid; 
 private double salary; 
 private String designation; 
 private String dept; 
  
 public Teacher() 
 { 
  
 } 
 
 public Teacher(String name, int age, String email, int phone, String address ,String tid, double salary, String designation, String dept) 
 { 
  super(name, age, email, phone, address); 
   
  this.tid = tid; 
  this.salary = salary; 
  this.designation = designation; 
  this.dept = dept; 
 } 
 
 
 public void setValues(String name, int age, String email, int phone, String address ,String tid, double salary, String designation, String dept) 
 { 
  super.setValues(name, age, email, phone, address); 
 
  this.tid = tid; 
  this.salary = salary; 
  this.designation = designation; 
  this.dept = dept; 
 } 
 
 
 public void showInfo()
 { 
  System.out.println(" "); 
 
  System.out.print("TEACHER INFORMATIONS"); 
 
  System.out.println(" "); 
 
  super.showInfo(); 
 
  System.out.println("Teacher ID: " +  tid); 
  System.out.println("Salary: " + this.salary); 
  System.out.println("Designation: " + this.designation); 
  System.out.println("Depertment: " + this.dept); 
 } 
  
}