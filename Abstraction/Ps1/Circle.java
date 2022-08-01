package Ps1;

public class Circle extends Shape{
	
	
	int r;
	
	Circle(double r){
		super(r,r);
	}
	void area() {
		System.out.println("Area for Circle "+3.1416*height*width);
	}
}
