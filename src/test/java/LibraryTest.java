import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class LibraryTest {

    Library library1;
    Library library2;
    Book book1;
    Book book2;
    Book book3;
    Book book4;
    Book book5;

    @Before
    public void setUp(){
        library1 = new Library(30);
        library2 = new Library(4);
        book1 = new Book("Lord of the Rings", "J. R. R. Tolkien", "High Fantasy");
        book2 = new Book("Discworld - The colour of magic","Terry Pratchett","Fantasy Comedy");
        book3 = new Book("Do Androids Dream of Electric Sheep?","Philip K. Dick","Sci-fi");
        book4 = new Book("A Book of Nonsense","Edward Lear","Poetry");
        book5 = new Book("The Just So Stories","Rudyard Kipling","Children's");

        library1.addBookToLibrary(book1);
        library1.addBookToLibrary(book2);
        library1.addBookToLibrary(book3);
        library1.addBookToLibrary(book4);

        library2.addBookToLibrary(book1);
        library2.addBookToLibrary(book2);
        library2.addBookToLibrary(book3);
    }

    @Test
    public void canCountBooksInLibrary(){
        assertEquals(4, library1.getNumOfBooks());
        assertEquals(3, library2.getNumOfBooks());
    }

    @Test
    public void canAddBookToLibrary(){
        library1.addBookToLibrary(book5);
        assertEquals(5, library1.getNumOfBooks());
    }

    @Test
    public void canNotAddBook(){
        library2.addBookToLibrary(book4);
        library2.addBookToLibrary(book5);
        assertEquals(4, library2.getNumOfBooks());
    }

}
