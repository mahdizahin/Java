import java.lang.*; 
 
public class Person 
{ 
 protected String name; 
 protected int age; 
 protected String email; 
 protected int phone; 
 protected String address; 
 
 public Person() 
 { 
 
 } 
 
 public Person(String name, int age, String email, int phone, String address) 
 { 
  this.name = name; 
  this.age = age; 
  this.email = email; 
  this.phone = phone; 
  this.address = address; 
 } 
 
 public void setValues(String name, int age, String email, int phone, String address) 
 { 
  this.name = name; 
  this.age = age; 
  this.email = email; 
  this.phone = phone; 
  this.address = address; 
 } 
  
 
 public void showInfo() 
 { 
  System.out.println(" "); 
 
  System.out.println("Name: " +name); 
  System.out.println("Age: " +age); 
  System.out.println("Email: " +email); 
  System.out.println("Phone: " +phone); 
  System.out.println("Address: " +address); 
 } 
 
}