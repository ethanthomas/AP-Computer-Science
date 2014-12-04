/**
 * Created by user on 12/3/14.
 */
public class BookImplementation {


    static Book[] books = { new Book("David Copperfield", "Charles Dickens"),
            new Book("The Jungle Book", "Rudyard Kipling"),
            new Book("The Call of the Wild", "Jack London"),
            new Book("Frankenstein", "Mary Shelley") };


    public static void main (String[] args) {

        String longestTitle = "";
        int longestTitleIndex = 0;

        for (int i = 0; i < books.length; i++) {

            if (books[i].getBookTitle().length() > longestTitle.length()) {

                longestTitle = books[i].getBookTitle();
                longestTitleIndex = i;

            } else {

                System.out.println("shorter");

            }

        }

        System.out.println(longestTitle + " by " + books[longestTitleIndex].getBookAuthor());
    }

}
