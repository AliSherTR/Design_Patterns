import java.util.ArrayList;
import java.util.List;

public class Library {
    private String name;
    private String location;

    private List<Book> books;

    public Library(String name , String location) {
        this.name = name;
        this.location = location;
        this.books = new ArrayList<>();
    }

    public void addBook(Book book) {
        books.add(book);
    }

    public List<Book> getBooks() {
        return books;
    }

    public String getName() {
        return name;
    }

    public String getLocation() {
        return location;
    }
}
