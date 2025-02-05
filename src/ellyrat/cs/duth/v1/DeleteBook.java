package ellyrat.cs.duth.v1;
// Askhsh20% Eleftherios Lyratzis
import java.util.List;
import java.util.Scanner;

public class DeleteBook {
    public static void deleteBook(Scanner scanner, List<Book> inventory) {
        System.out.println("\n=== DELETE A BOOK ===");
        System.out.print("Enter the ISBN of the book to delete: ");
        String isbnToDelete = scanner.nextLine().trim();

        Book bookToDelete = null;
        for (Book b : inventory) {
            if (b.getIsbn().equalsIgnoreCase(isbnToDelete)) {
                bookToDelete = b;
                break;
            }
        }

        if (bookToDelete == null) {
            System.out.println("Book with ISBN " + isbnToDelete + " not found.");
        } else {
            // Display book details and ask for confirmation
            System.out.println("Book found:");
            System.out.println(bookToDelete);
            System.out.print("Are you sure you want to delete this book? (yes/no): ");
            String confirm = scanner.nextLine().trim().toLowerCase();
            if (confirm.equals("yes")) {
                inventory.remove(bookToDelete);
                System.out.println("Book deleted successfully.");
            } else {
                System.out.println("Deletion canceled.");
            }
        }
    }
}

