package Ps1;

public abstract class Shape {
  
	double height,width;
	
	Shape(double height, double width){
		this.height= height;
		this.width=width;
		
	}
	
	abstract void area();
}
