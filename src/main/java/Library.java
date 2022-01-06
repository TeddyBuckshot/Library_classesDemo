import java.util.ArrayList;

public class Library {

    private ArrayList<Book> books;
    private int capacity;

    public Library(int capacity){
        this.books = new ArrayList<>();
        this.capacity = capacity;
    }

    public void addBookToLibrary(Book book){
        if (this.books.size() < capacity){
            this.books.add(book);
        }else if (this.books.size() == capacity){
            System.out.println("sorry, the library stock-room is currently at capacity!");
        }
    }

    public int getNumOfBooks(){
        return this.books.size();
    }

    public Book removeFromLibrary(Book book) {
        this.books.remove(book);
        return book;
    }



}
