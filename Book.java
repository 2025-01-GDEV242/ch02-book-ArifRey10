/**
 * A class that maintains information on a book.
 * This might form part of a larger application such
 * as a library system, for instance.
 *
 * @author (Arif Reyhan)
 * @version (2/3/2025)
 */
class Book
{
    // The fields.
    private String author;
    private String title;
    private int pages;

    /**
     * Set the author and title fields when this object
     * is constructed.
     */
    public Book(String bookAuthor, String bookTitle, int bookPages)
    {
        author = bookAuthor;
        title = bookTitle;
        pages = bookPages;
    }

    // Add the methods here ...
    public String getAuthor()
    {
        return author;
    } 
    
    public String getTitle()
    {
        return title;
    } 
    
    public int getPages()
    {
        return pages;
    } 
}
