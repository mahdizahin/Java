package assignment;

public class TextBook extends Book {

	int standard;
	
	
	public TextBook(String isbn,String bookTitle,String authorName,double price,int availableQuantity,int standard) {
		super(isbn,bookTitle,authorName,price,availableQuantity);
		this.standard=standard;
	}
	
	public TextBook() {
		System.out.println("\nDefault Constructor of Textbook Class");
	}
	
	public void setStandard(int standard) {this.standard=standard;}
	public int getStandard() {return standard;}

	public void showDetails() {
		super.showDetails();
		System.out.println("Standard   : "+standard);
	}
}
