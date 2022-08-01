package first;

public class Cart extends Start{
    String item1;
    int price1;
	public Cart(String name, int id, String item1,int price1) {
		super(name, id);
		this.item1=item1;
		this.price1=price1;
		 
	}
	
	public void display() {
		 super.display();
		 System.out.println("Item name :"+item1);
		 System.out.println("Item Price : "+price1);
	 }
	
	 
}
