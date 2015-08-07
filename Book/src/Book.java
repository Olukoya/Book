
public class Book {

	private String title, author, description;
	private boolean inStock;
	private double price;
	
	public Book ()
	{
		title = "";
		author = "";
		description = "";
		price = 0;
		inStock = true;
	}
	
	public void setTitle (String title)
	{
		this.title = title;
	}
	
	public String getTitle ()
	{
		return title;
	}
	
	public void setAuthor (String author)
	{
		this.author = author;
	}
	
	public String getAuthor ()
	{
		return author;
	}
	
	public void setDescription (String description)
	{
		this.description = description;
	}
	
	public String getDescription ()
	{
		return description;
	}
	
	public void setStockStatus (boolean inStock)
	{
		this.inStock = inStock;
	}
	
	public boolean getStockStatus ()
	{
		return inStock;
	}
	
	public void setPrice (double price)
	{
		this.price = price;
	}
	
	public double getPrice ()
	{
		return price;
	}
	
	public double totalPrice (int numOfBooks)
	{
		if (this.inStock = true)
				return this.getPrice()*numOfBooks;
		else
			return 0;
	}
}
