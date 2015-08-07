	import java.util.Scanner;

	public class BookApp
	{
	    public static void main(String args[])
	    {
	        System.out.println(
	            "Welcome to the Product Selector");
	        System.out.println();
	        
	        @SuppressWarnings("resource")
			Scanner sc = new Scanner(System.in);
	        String choice = "y";
	        
	        while (choice.equalsIgnoreCase("y"))
	        {
	            // get the input from the user
	            System.out.print("Enter book title: ");
	            String title = sc.next();
	            
	            System.out.print("How many books do you want?: ");
	            int numOfBooks = sc.nextInt();
	            // read the product code
	            sc.nextLine();
	            // discard any other data
	            // get the Product object
	            Book book = BookDB.getBook(title);

	            // display the output
	            System.out.println();
	            System.out.println("SELECTED PRODUCT");
	            System.out.println("Description: " +book.getDescription());
	            System.out.println("Unit Price:       " +book.getPrice());
	            System.out.println("Total Price:       " +book.totalPrice(numOfBooks));
	            System.out.println();

	            // see if the user wants to continue
	            System.out.print("Continue? (y/n): ");
	            choice = sc.nextLine();
	            System.out.println();
	        }
	    }
	}

