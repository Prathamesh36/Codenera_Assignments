package NOV28.AmanSir.BookInfo;

public class BookInfo {
    private String book_title;
    private String author_name;
    private int total_stock;

    public BookInfo(String book_title, String author_name, int total_stock) {
        this.book_title = book_title;
        this.author_name = author_name;
        this.total_stock = total_stock;
    }

    public String getBook_title() {
        return book_title;
    }

    @Override
    public String toString() {
        return "\n{" +
                "book_title='" + book_title + '\'' +
                ", author_name='" + author_name + '\'' +
                ", total_stock=" + total_stock +
                '}';
    }

    public String getAuthor_name() {
        return author_name;
    }

    public int getTotal_stock() {
        return total_stock;
    }
}
