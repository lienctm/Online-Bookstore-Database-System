import java.util.*;
import java.sql.*;

public class BookstoreDAO {
    private final String DB_URL = "jdbc:mysql://localhost:3306/BookstoreDB";
    private final String DB_USER = "root";
    private final String DB_PASSWORD = "cs157a";

    public BookstoreDAO() {
        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
        } catch (ClassNotFoundException e) {
            System.out.println("\nUnable to load the Driver class.");
            return;
        }
    }

    // Check if users exist
    public boolean isUserExists() {
        return true;
    }

    // Return all books from Book table
    public List<Book> getBooks() {
        List<Book> books = new ArrayList<>();

        try {
            Connection conn = DriverManager.getConnection(DB_URL, DB_USER, DB_PASSWORD);
            Statement stmt = conn.createStatement();
            ResultSet rs = stmt.executeQuery(
                    "SELECT * FROM Book ORDER BY bookID");
            while (rs.next()) {
                Book book = new Book(
                        rs.getInt("bookID"),
                        rs.getString("title"),
                        rs.getString("author"),
                        rs.getString("publisher"),
                        rs.getInt("year"),
                        rs.getInt("quantity"),
                        rs.getDouble("sale_price"),
                        rs.getDouble("rent_price"));
                books.add(book);
            }

        } catch (SQLException se) {
            System.out.println("SQL Exception: " + se.getMessage());
            se.printStackTrace(System.out);
        }
        return books;
    }

    // Insert a book
    public boolean insertBook() {
        return true;
    }

    // Update a book
    public boolean updateBook() {
        return true;
    }

    // Delete a book
    public boolean deleteBook() {
        return true;
    }

}
