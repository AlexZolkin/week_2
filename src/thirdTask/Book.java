package thirdTask;

/**
 * Created by Алексей on 02.03.2017.
 */
public abstract class Book implements Edition{
    /*
    * Properties:
    * name - Name of the current book
    * author = Author of the current book
    * year - year current book published
    * book_Type - enum type, for Catalog, Encyclopedia and Undefined
    * */
    protected String name, author;
    protected  int year;
    protected Books_Type book_Type;
    /*
    * Constructor for creating every single book
    * All the are equivalent with Properties up here
    * Ternary operators used for checking parameters, are they suitable or not
    * */
    public Book(String name, String author, int year, Books_Type book_Type){
        this.name = name.isEmpty() ? "No Name" : name;
        this.author = author.isEmpty() ? "No Author" : author;
        this.year = year <= 0 ? 0 : year;
        this.book_Type = book_Type == null ? Books_Type.Undefined : book_Type;
    }
}
