package ellyrat.cs.duth.v1;
// Askhsh20% Eleftherios Lyratzis
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class SearchForBook {
    public static void SearchForBook(Scanner scanner, List<Book> inventory) {
        System.out.println("\n=== SEARCH FOR A BOOK ===");
        System.out.print("Enter the title to search for: ");
        String titleToSearch = scanner.nextLine().trim().toLowerCase();

        List<Book> foundBooks = new ArrayList<>();
        for (Book b : inventory) {
            if (b.getTitle().toLowerCase().contains(titleToSearch)) {
                foundBooks.add(b);
            }
        }

        if (foundBooks.isEmpty()) {
            System.out.println("No books found matching the title \"" + titleToSearch + "\".");
        } else {
            System.out.println(foundBooks.size() + " book(s) found:");
            for (Book book : foundBooks) {
                System.out.println(book);
            }
        }
    }
}
