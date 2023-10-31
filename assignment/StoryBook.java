package assignment;

public class StoryBook extends Book{
String category;

public StoryBook(String isbn,String bookTitle,String authorName,double price,int availableQuantity,String category) {
	super(isbn,bookTitle,authorName,price,availableQuantity);
	this.category=category;
}

public StoryBook() {
	System.out.println("\nDefault Constructor of StoryBook Class");
}

public void setCategory(String category) {this.category=category;}
public String getCategory() {return category;}
	

public void showDetails() {
	
	super.showDetails();
	System.out.println("Category   : "+category);
}
	
}
