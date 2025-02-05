package ellyrat.cs.duth.v1;
// Askhsh20% Eleftherios Lyratzis
import java.util.List;

public class ListAllBooks {
    public static void listAllBooks(List<Book> inventory) {
        System.out.println("\n=== LIST ALL BOOKS ===");
        if (inventory.isEmpty()) {
            System.out.println("No books in the inventory.");
        } else {
            for (int i = 0; i < inventory.size(); i++) {
                Book b = inventory.get(i);
                System.out.println("Book " + (i + 1) + ":");
                System.out.println(b);
            }
        }
    }
}
