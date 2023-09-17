// Imagine we're building a library system.
// In this system, we have two main classes: Library and Book.
public class Book {
    private String title;
    private String name;
    private String isbn;

    public Book(String title , String name , String isbn){
        this.title = title;
        this.name = name;
        this.isbn = isbn;
    }

    public String getName(){
        return name;
    }
    public String getTitle(){
        return title;
    }

    public String getIsbn(){
        return isbn;
    }
}
