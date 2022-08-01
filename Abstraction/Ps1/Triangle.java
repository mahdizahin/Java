package Ps1;

public class Triangle extends Shape{

	Triangle(double height, double width){
		super(height,width);
		}

	void area() {
		System.out.println("Area for triangle "+.5*height*width);
	}
}
