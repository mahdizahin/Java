package area;

public class Triangle extends Shape{
	double base,hight;
	Triangle(double base,double hight){
		this.base=base;
		this.hight=hight;
	}
	
	double area() {
		return .5*base*hight;
		  
	}
	 

}
