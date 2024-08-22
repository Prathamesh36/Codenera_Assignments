package Assignment21;

class Book {
    private String title;
    private String author;
    private boolean available;

    public Book(String title, String author) {
        this.title = title;
        this.author = author;
        this.available = true;
    }

    public String getTitle() {
        return title;
    }

    public String getAuthor() {
        return author;
    }

    public boolean isAvailable() {
        return available;
    }

    public void borrow() {
        if (available) {
            available = false;
        } else {
            System.out.println("The book is already borrowed.");
        }
    }

    public void returnBook() {
        if (!available) {
            available = true;
        } else {
            System.out.println("The book is already in the li.");
        }
    }
}

class liMember {
    private String name;
    private int memberId;

    public liMember(String name, int memberId) {
        this.name = name;
        this.memberId = memberId;
    }

    public String getName() {
        return name;
    }

    public int getMemberId() {
        return memberId;
    }
}

class li {
    private Book[] books;
    private liMember[] members;
    private int bookCount;
    private int memberCount;

    public li(int maxBooks, int maxMembers) {
        books = new Book[maxBooks];
        members = new liMember[maxMembers];
        bookCount = 0;
        memberCount = 0;
    }

    public void addBook(Book book) {
        if (bookCount < books.length) {
            books[bookCount] = book;
            bookCount++;
        } else {
            System.out.println("The li is at full book capacity.");
        }
    }

    public void addMember(liMember member) {
        if (memberCount < members.length) {
            members[memberCount] = member;
            memberCount++;
        } else {
            System.out.println("The li has reached its maximum member capacity.");
        }
    }

    public void borrowBook(int memberId, String bookTitle) {
        for (int i = 0; i < memberCount; i++) {
            if (members[i].getMemberId() == memberId) {
                for (int j = 0; j < bookCount; j++) {
                    if (books[j].getTitle().equals(bookTitle) && books[j].isAvailable()) {
                        books[j].borrow();
                        System.out.println(members[i].getName() + " has borrowed the book: " + bookTitle);
                        return;
                    }
                }
                System.out.println("Book not available or book not found.");
                return;
            }
        }
        System.out.println("Invalid member ID.");
    }

    public void returnBook(int memberId, String bookTitle) {
        for (int i = 0; i < memberCount; i++) {
            if (members[i].getMemberId() == memberId) {
                for (int j = 0; j < bookCount; j++) {
                    if (books[j].getTitle().equals(bookTitle) && !books[j].isAvailable()) {
                        books[j].returnBook();
                        System.out.println(members[i].getName() + " has returned the book: " + bookTitle);
                        return;
                    }
                }
                System.out.println("Book cannot be returned by this member or book not found.");
                return;
            }
        }
        System.out.println("Invalid member ID.");
    }
}

public class LibraryManagement {
    public static void main(String[] args) {
        li li = new li(10, 5);

        Book book1 = new Book("The Great Gatsby", "F. Scott Fitzgerald");
        Book book2 = new Book("To Kill a Mockingbird", "Harper Lee");

        liMember member1 = new liMember("John", 101);
        liMember member2 = new liMember("Alice", 102);

        li.addBook(book1);
        li.addBook(book2);
        li.addMember(member1);
        li.addMember(member2);

        li.borrowBook(101, "The Great Gatsby");
        li.borrowBook(102, "To Kill a Mockingbird");
        li.borrowBook(101, "To Kill a Mockingbird");

        li.returnBook(101, "The Great Gatsby");
        li.returnBook(101, "To Kill a Mockingbird");
        li.borrowBook(101, "The Great Gatsby");
    }
}
