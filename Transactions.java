import java.util.*;

public class Transactions {

    public boolean isUser(String username) {
        System.out.print("\nTesting username");
        // TODO
        return true; // testing
    }

    public void orderBook(String username, Scanner scanner) {
        System.out.println("\n---+--+-- Ordering --+--+---");
        // TODO
    }

    public void rentalBook(String username, Scanner scanner) {
        System.out.println("\n---+--+-- Renting --+--+---");
        // TODO
    }

    public void viewTables(String username) {
        System.out.println("\n---+--+-- List of books --+--+---");
        // TODO
    }

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
