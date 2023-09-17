import java.util.List;

public class Main {
    public static void main(String[] args) {
        Library myLibrary = new Library("My Library", "123 Main St.");

        // Create some books
        Book book1 = new Book("The Great Gatsby", "F. Scott Fitzgerald", "978-3-16-148410-0");
        Book book2 = new Book("To Kill a Mockingbird", "Harper Lee", "978-0-06-112008-4");

        // Add books to the library
        myLibrary.addBook(book1);
        myLibrary.addBook(book2);

        // Now, the library has a list of books
        List<Book> libraryBooks = myLibrary.getBooks();

        // Display information about the books in the library
        System.out.println("Library Information:");
        System.out.println("Name: " + myLibrary.getName());
        System.out.println("Location: " + myLibrary.getLocation());
        System.out.println("\nBooks in the Library:");

        for (Book book : libraryBooks) {
            System.out.println("Title: " + book.getTitle());
            System.out.println("Author: " + book.getName());
            System.out.println("ISBN: " + book.getIsbn());
            System.out.println();
        }
    }
}

// asscociation in java describes how different clasess and objects are related to each other
// it is a way of representing the relation b/w objects.
// association can be one to one, many to one and many to many