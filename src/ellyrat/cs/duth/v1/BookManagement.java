package ellyrat.cs.duth.v1;
// Askhsh20% Eleftherios Lyratzis
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class BookManagement {

    // A single Scanner for user input
    private static final Scanner scanner = new Scanner(System.in);

    // Shared inventory across all operations
    private static final List<Book> inventory = new ArrayList<>();

    public static void main(String[] args) {
        // Pre-load 5 printed books and 3 electronic books (Modern Greek Literature)
        PreloadBooks.preloadBooks(inventory);

        boolean exit = false;
        while (!exit) {
            printMainMenu();
            String choice = scanner.nextLine().trim();

            switch (choice) {
                case "1":
                    AddBook.addBook(scanner, inventory);
                    break;
                case "2":
                    DeleteBook.deleteBook(scanner, inventory);
                    break;
                case "3":
                    ListAllBooks.listAllBooks(inventory);
                    break;
                case "4":
                    SearchForBook.SearchForBook(scanner, inventory);
                    break;
                case "5":
                    System.out.println("Exiting the application...");
                    exit = true;
                    break;
                default:
                    System.out.println("Invalid choice. Please try again.");
            }
        }
    }

    // Print the main menu
    private static void printMainMenu() {
        System.out.println("\n===== LIBRARY INVENTORY MENU =====");
        System.out.println("1. Add a Book");
        System.out.println("2. Delete a Book");
        System.out.println("3. List All Books");
        System.out.println("4. Search for a Book by Title");
        System.out.println("5. Exit");
        System.out.print("Enter choice: ");
    }
}
