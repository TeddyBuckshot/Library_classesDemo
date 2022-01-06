import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class BorrowerTest {

    Library library1;
    Library library2;
    Book book1;
    Book book2;
    Book book3;
    Book book4;
    Book book5;
    Borrower borrower;

    @Before
    public void setUp(){
        library1 = new Library(30);
        book1 = new Book("Lord of the Rings", "J. R. R. Tolkien", "High Fantasy");
        book2 = new Book("Discworld - The colour of magic","Terry Pratchett","Fantasy Comedy");
        book3 = new Book("Do Androids Dream of Electric Sheep?","Philip K. Dick","Sci-fi");
        book4 = new Book("A Book of Nonsense","Edward Lear","Poetry");
        borrower = new Borrower();

        library1.addBookToLibrary(book1);
        library1.addBookToLibrary(book2);
        library1.addBookToLibrary(book3);
        library1.addBookToLibrary(book4);
    }

    @Test
    public void canBorrowBook(){
        library1.removeFromLibrary(borrower.addBookToBorrower(book1));
        assertEquals(1, borrower.getBorrowedBooks());
    }

}
