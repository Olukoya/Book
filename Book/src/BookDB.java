
public class BookDB {

	public static Book getBook(String bookTitle)
    {
        Book p = new Book();

        p.setTitle(bookTitle);
        if (bookTitle.equalsIgnoreCase("java"))
        {
            p.setDescription("Murach's Beginning Java");
            p.setPrice(49.50);
        }
        else if (bookTitle.equalsIgnoreCase("jsps"))
        {
            p.setDescription(
                "Murach's Java Servlets and JSP");
            p.setPrice(49.50);
        }
        else if (bookTitle.equalsIgnoreCase("mcb2"))
        {
            p.setDescription("Murach's Mainframe COBOL");
            p.setPrice(59.50);
        }
        else
        {
            p.setDescription("Unknown");
        }
        return p;
    }

}
