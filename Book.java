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
    private String refNumber;

    /**
     * Set the author and title fields when this object
     * is constructed.
     */
    public Book(String bookAuthor, String bookTitle, int bookPages
    )
    {
        author = bookAuthor;
        title = bookTitle;
        pages = bookPages;   
        refNumber = "";
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
    public void printAuthor()
    {
        System.out.println ("Author: " + author);
    
    }
    public void printTitle()
    {
        System.out.println ("Title: " + title);
    
    }
    
    public void printDetails()
    {
       printAuthor();
       printTitle();
       System.out.println("pages: " + pages);
       if (refNumber.length()>0)
           System.out.println("Print Ref#");
       else
       System.out.println("zzz");
    }
    
    public String getrefNumber()
    {
        return refNumber;
    } 
    
    public void setRefNumber(String Ref)
    {
        if(ref.length()>=3){
        refNumber = Ref;
    }
    {
        else{
            System.out.println("Error! Must be 3 characters.");
        }
    }
}
