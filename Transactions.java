import java.util.*;

public class Transactions {

    // Check if user exists
    public boolean isUser(String username) {
        System.out.print("\nTesting username");
        // TODO
        return true; // testing
    }

    // Order a book
    public void orderBook(String username, Scanner scanner) {
        System.out.println("\n---+--+-- Ordering --+--+---");
        // TODO
    }

    // Rent a book
    public void rentalBook(String username, Scanner scanner) {
        System.out.println("\n---+--+-- Renting --+--+---");
        // TODO
    }

    // View all books in the system
    public void viewTables(String username) {
        System.out.println("\n---+--+-- List of books --+--+---\n");
        BookstoreDAO dao = new BookstoreDAO();
        List<Book> books = dao.getBooks();

        if (books.isEmpty()) {
            System.out.println("No books found.");
            return;
        }

        for (Book book : books) {
            System.out.println(book);
        }
    }

    // Insert data into the system
    public void insertData(String username, Scanner scanner) {
        System.out.println("\n---+--+-- Insert new book --+--+---");
        System.out.print("Title: ");
        String title = scanner.nextLine();

        System.out.print("Author: ");
        String author = scanner.nextLine();

        System.out.print("Publisher: ");
        String publisher = scanner.nextLine();

        System.out.print("Year: ");
        int year = scanner.nextInt();

        System.out.print("Quantity: ");
        int quantity = scanner.nextInt();

        System.out.print("Sale Price: ");
        double sale_price = scanner.nextDouble();

        System.out.print("Rent Price: ");
        double rent_price = scanner.nextDouble();
        scanner.nextLine();

        // TODO:
        // insert information into Book
        // if(inserted) {
        // System.out.println("Book added sucessfully.");
        // } else {
        // System.out.println("Failed to add book.");
        // }

    }

    // Delete data in the system
    public void deleteData(String username, Scanner scanner) {
        System.out.print("Enter bookID to delete: ");
        int bookID = scanner.nextInt();
        scanner.nextLine();
        // TODO:
        // delete book from Book
        // if(deleted) {
        // System.out.println("Book deleted sucessfully.");
        // } else {
        // System.out.println("bookID not found.");
        // }

    }

    // Update data in the system
    public void updateData(String username, Scanner scanner) {
        System.out.print("Enter Book ID to update quantity: ");
        int bookID = scanner.nextInt();
        // TODO:
        // decide which is needed to be update and update it on the system
        // if(updated) {
        // System.out.println("Updated sucessfully.");
        // } else {
        // System.out.println("bookID not found.");
        // }

    }

}
