package thirdTask;
/**
 * Created by Алексей on 02.03.2017.
 */
/*
* class for encyclopedia control
* */
public class Encyclopedia extends Book {

    /*
    * Default constructor
    * uses superclass constructor for initialisation
    * */
    public Encyclopedia(String name, String author, int year){
        super(name, author, year, BooksType.Encyclopedia);
    }

    /*
    * Adding new book to the collection
    * */
    @Override
    public void addBook(){
        books.add(this);
    }

    /*
    * Creates new book with the same parameters
    * */
    @Override
    public void addBook(String name, String author, int year){
        books.add(new Encyclopedia(name, author, year));
    }

    /*
    * deletes this book
    * */
    @Override
    public void deleteBook(){
        books.remove(this);
    }

    /*
    * deletes all the books from the year given
    * */
    /*@Override
    public  void deleteAllBooks(int year){
        Iterator<Book> iter = books.iterator();

        while (iter.hasNext()) {
            if(iter.next().bookType == bookType && iter.next().year == year)
                books.remove(iter.next());
        }
    }*/

    /*
    * return's name and author in formatted string
    * */
    @Override
    public String getBook()
    {
        return this.name + " - " + this.author;
    }
}
