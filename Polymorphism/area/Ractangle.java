package area;

public class Ractangle extends Shape{
	
	double length,width;
	Ractangle (double length,double width){
		this.length=length;
		this.width=width;
	}
	
	double area() {
		return length*width;
	}
//	void display() {
//		System.out.println("Person Class"+area);
//		System.out.println("Person Class");
//	}

}
