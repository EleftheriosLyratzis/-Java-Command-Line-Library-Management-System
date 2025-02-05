package ellyrat.cs.duth.v1;
// Askhsh20% Eleftherios Lyratzis
import java.util.List;
import java.util.Scanner;

public class AddBook {
    public static void addBook(Scanner scanner, List<Book> inventory) {
        System.out.println("\n=== ADD A BOOK ===");

        // Title
        System.out.print("Enter book title: ");
        String title = scanner.nextLine().trim();

        // Author
        System.out.print("Enter book author: ");
        String author = scanner.nextLine().trim();

        // ISBN
        System.out.print("Enter book ISBN: ");
        String isbn = scanner.nextLine().trim();

        // Check if a book with the same ISBN already exists
        for (Book b : inventory) {
            if (b.getIsbn().equalsIgnoreCase(isbn)) {
                System.out.println("A book with this ISBN already exists. Cannot add duplicate.");
                return;
            }
        }

        // Price
        System.out.print("Enter book price: ");
        double price;
        try {
            price = Double.parseDouble(scanner.nextLine().trim());
        } catch (NumberFormatException e) {
            System.out.println("Invalid price. Book addition aborted.");
            return;
        }

        // Number of pages (if printed)
        System.out.print("Does this book have a printed format? (yes/no): ");
        String printedResponse = scanner.nextLine().trim().toLowerCase();
        Integer pages = null;
        if (printedResponse.equals("yes")) {
            System.out.print("Enter number of pages: ");
            try {
                pages = Integer.parseInt(scanner.nextLine().trim());
            } catch (NumberFormatException e) {
                System.out.println("Invalid number of pages. Book addition aborted.");
                return;
            }
        }

        // File size in MB (if electronic)
        System.out.print("Does this book have an electronic format? (yes/no): ");
        String electronicResponse = scanner.nextLine().trim().toLowerCase();
        Double fileSize = null;
        if (electronicResponse.equals("yes")) {
            System.out.print("Enter file size (MB): ");
            try {
                fileSize = Double.parseDouble(scanner.nextLine().trim());
            } catch (NumberFormatException e) {
                System.out.println("Invalid file size. Book addition aborted.");
                return;
            }
        }

        // Create and add the book to inventory
        Book newBook = new Book(title, author, isbn, price, pages, fileSize);
        inventory.add(newBook);
        System.out.println("Book added successfully!");
    }
}

