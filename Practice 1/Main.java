import java.lang.*; 
 
public class Main 
{ 
 public static void main(String[] args) 
 { 
  Student s1 = new Student(); 
 
  s1.setValues("Mahdi Zahin", 22, "mahdizahin@gmail.com", 10002839, "Mymensing", "22-46447-1", 3.75F, 15, 2, "CSE"); 
 
  s1.showInfo(); 
 
  Teacher t1 = new Teacher(); 
 
  t1.setValues("Md. rogan ", 32, "rogan@gmail.com", 100038728, "Dhaka", "678-77", 98000, "Lecturer", "CSE"); 
 
  t1.showInfo(); 
 } 
}