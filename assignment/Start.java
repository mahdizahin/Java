package assignment;

public class Start {

	public static void main(String args[]) {
		
		StoryBook b1 = new StoryBook("AAAC95","Bolivia Travels","Professor Zahin",1199,17,"Adventure");
		b1.showDetails();
		
		 
	
		StoryBook sb1 = new StoryBook("A", "Komola Shundori", "C", 66, 8, "Thriller");

        // Display the details before selling
        System.out.println("\nBook Details Before Selling:");
        sb1.showDetails();

        // Sell a quantity of 5
        int quantityToSell = 5;
        sb1.sellQuantity(quantityToSell);

        // Display the details after selling
        System.out.println("\nBook Details After Selling:");
        sb1.showDetails();
        
        
        
        
       
        TextBook textbook1 = new TextBook("X1", "Mathematics", "Author1", 50.0, 10, 10);
        TextBook textbook2 = new TextBook("X2", "Science", "Author2", 40.0, 15, 8);

         
        System.out.println("\nTextbook 1 Details:");
        textbook1.showDetails();

        
        System.out.println("\nTextbook 2 Details:");
        textbook2.showDetails();
	}
}
