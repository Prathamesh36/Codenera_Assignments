/*2.Create a class hierarchy for a library system that includes books, magazines, and newspapers.*/
package Assignment32;

public abstract class LibraryItem {
    private String title;
    private String publisher;

    public LibraryItem(String title, String publisher) {
        this.title = title;
        this.publisher = publisher;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getPublisher() {
        return publisher;
    }

    public void setPublisher(String publisher) {
        this.publisher = publisher;
    }
}
class Book extends LibraryItem{
    private String author;

    public Book(String title, String publisher, String author) {
        super(title, publisher);
        this.author = author;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }
}
class Magazine extends LibraryItem {
    private String issue;

    public Magazine(String title, String publisher, String issue) {
        super(title, publisher);
        this.issue = issue;
    }

    // getters and setters
    public String getIssue() {
        return issue;
    }

    public void setIssue(String issue) {
        this.issue = issue;
    }
}
