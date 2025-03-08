package Test13.BookDataSet;

public class BookInfo implements Comparable<BookInfo>{
    private String book_title;
    private String author_name;
    private int year;

    public BookInfo(String book_title, String author_name, int year) {
        this.book_title = book_title;
        this.author_name = author_name;
        this.year = year;
    }


    public String getBook_title() {
        return book_title;
    }

    @Override
    public String toString() {
        return "\n{" +
                "book_title='" + book_title + '\'' +
                ", author_name='" + author_name + '\'' +
                ", total_stock=" + year +
                '}';
    }

    public String getAuthor_name() {
        return author_name;
    }

    public int getYear() {
        return year;
    }

    @Override
    public int compareTo(BookInfo o) {
        return this.author_name.compareTo(o.author_name);
    }
}

