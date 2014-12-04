/**
 * Created by user on 12/3/14.
 */
public class Book {

    private String bookAuthor, bookTitle;

    public Book(String title, String author){

        bookAuthor = author;
        bookTitle = title;

    }

    public String getBookAuthor() {
        return bookAuthor;
    }

    public String getBookTitle() {
        return bookTitle;
    }
}
