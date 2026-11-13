import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Transactions myTransactions = new Transactions();
        Scanner scanner = new Scanner(System.in);
        int select = 0;
        String user = null;

        while (select != 8) {
            System.out.println("\n-----<<< Welcome to Bookstore Online >>>-----");
            System.out.println("    1. Login / Sign in");
            System.out.println("    2. Order Books");
            System.out.println("    3. Rental Books");
            System.out.println("    4. View Data");
            System.out.println("    5. Insert Data");
            System.out.println("    6. Update Data");
            System.out.println("    7. Delete Data");
            System.out.println("    8. Exit");
            System.out.println("Enter your choice: ");

            select = scanner.nextInt();
            scanner.nextLine();

            switch (select) {
                case 1:
                    System.out.print("\nEnter your username: ");
                    user = scanner.nextLine().trim();
                    if (myTransactions.isUser(user)) {
                        System.out.println("Welcome " + user);
                    } else {
                        System.out.println("User not found.");
                        user = null;
                    }
                    break;

                case 2:
                    myTransactions.orderBook(user, scanner);
                    break;

                case 3:
                    myTransactions.rentalBook(user, scanner);
                    break;

                case 4:
                    myTransactions.viewTables(user);
                    break;

                case 5:
                    myTransactions.insertData(user, scanner);
                    break;

                case 6:
                    myTransactions.updateData(user, scanner);
                    break;

                case 7:
                    myTransactions.deleteData(user, scanner);
                    break;

                case 8:
                    System.out.println("\nExiting apllication.");
                    break;

                default:
                    System.out.println("\nInvalid. Try again.");
                    break;
            }
        }
        scanner.close();

    }
}
