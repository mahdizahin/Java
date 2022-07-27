public class Person2 {
private String name;
private int age;

//public Person2(String name,int age) {
//	this.name=name;
//	this.age=age;
//}

public void setName (String name) {
	this.name=name;
}
public String getName() {
	return name;
}


public void setAge (int age) {
	this.age=age;
}
public int getAge() {
	return age;
}


void show1() {
	System.out.println("Name : "+getName());
	System.out.println("Age : "+age);
}
}
