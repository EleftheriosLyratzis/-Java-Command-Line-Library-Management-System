package ellyrat.cs.duth.v1;
// Askhsh20% Eleftherios Lyratzis
public class Book {
    private String title;
    private String author;
    private String isbn;
    private double price;

    // For printed format
    private Integer numberOfPages;  // null if not applicable

    // For electronic format
    private Double fileSizeMB;      // null if not applicable

    // Constructor
    public Book(String title, String author, String isbn, double price,
                Integer numberOfPages, Double fileSizeMB) {
        this.title = title;
        this.author = author;
        this.isbn = isbn;
        this.price = price;
        this.numberOfPages = numberOfPages;
        this.fileSizeMB = fileSizeMB;
    }

    // Getters
    public String getTitle()       { return title; }
    public String getAuthor()      { return author; }
    public String getIsbn()        { return isbn; }
    public double getPrice()       { return price; }
    public Integer getNumberOfPages() { return numberOfPages; }
    public Double getFileSizeMB()  { return fileSizeMB; }

    // toString method to display book details
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("Title: ").append(title).append("\n")
          .append("Author: ").append(author).append("\n")
          .append("ISBN: ").append(isbn).append("\n")
          .append("Price: ").append(price).append("\n");

        if (numberOfPages != null) {
            sb.append("Pages: ").append(numberOfPages).append("\n");
        } else {
            sb.append("Pages: N/A\n");
        }

        if (fileSizeMB != null) {
            sb.append("File Size (MB): ").append(fileSizeMB).append("\n");
        } else {
            sb.append("File Size (MB): N/A\n");
        }
        return sb.toString();
    }
}
