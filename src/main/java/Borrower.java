import java.util.ArrayList;

public class Borrower {

    private ArrayList<Book> borrowedBooks;

    public Borrower(){
        this.borrowedBooks = new ArrayList<>();
    }

    public int getBorrowedBooks(){
        return this.borrowedBooks.size();
    }

    public Book addBookToBorrower(Book book){
        this.borrowedBooks.add(book);
        return book;
    }


}
