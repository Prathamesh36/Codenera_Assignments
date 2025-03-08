package Test9;


import java.util.Scanner;

class Book{
    private String title;
    private String author;
    private boolean available;

    public Book(String title, String author) {
        this.title = title;
        this.author = author;
        this.available = true;
    }

    public String getTitle(){
        return title;
    }
    public String getAuthor(){
        return author;
    }
    public boolean getAvailable(){
        return available;
    }

    public void borrow(){
        if(available){
            available=false;
        }
        else{
            System.out.println("The book is already borrowed");
        }
    }
    public void returnBook(){
        if(!available){
            available=true;
        }
        else{
            System.out.println("The book is already in the library");
        }
    }
}

class LibraryMember{
    private String name;
    private int memberId;

    public LibraryMember(String name, int memberId) {
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
class Library{
    private Book[] books;
    private LibraryMember[] members;
    private int bookCount;
    private int memberCount;

    public Library(int maxBooks, int maxMembers) {
       books = new Book[maxBooks];
       members = new LibraryMember[maxMembers];
        this.bookCount = 0;
        this.memberCount = 0;
    }

    public void addBook(Book book){
        if(bookCount < books.length){
            books[bookCount] = book;
            bookCount++;
        }
        else{
            System.out.println("The library is at full book capacity");
        }
    }

    public  void addMember(LibraryMember member){
        if(memberCount < members.length){
            members[memberCount]=member;
        }
        else{
            System.out.println("The library has reached its maximum member capacity");
        }
    }

    public void borrowBook(int memberId, String bookTitle){
        for(int i=0;i<memberCount;i++){
            if(members[i].getMemberId() == memberId){
                for (int j = 0; j < bookCount; j++) {
                  /*  if (books[j].getTitle().equals(bookTitle) && books[j].isAvailable()){
                        books[j].borrow();
                        System.out.println(members[i].getName() + " has borrowed the book: "+ bookTitle);
                        return;
                    }*/
                }
                System.out.println("Book not available or book not found");
                return;
            }
        }
        System.out.println("Invalid member ID.");
    }

    public void returnBook(int memberId,String bookTitle){
        for (int i = 0; i < memberCount; i++) {
            if(members[i].getMemberId() == memberId){
                for (int j = 0; j <bookCount; j++) {
                  /*  if(books[j].getTitle().equals(bookTitle) && !books[j].isAvailable()){
                        books[j].returnBook();
                        System.out.println(members[i].getName()+" has returned the book: "+ bookTitle);
                        return;
                    }*/
                }
                System.out.println("Book cannot be returned by this member or book bot found");
                return;
            }
        }
        System.out.println("Invalid member ID. ");
    }
}

public class LibraryManagement {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Library li = new Library(10,5);

        Book b1 = new Book("The Grete Gatsby", "F. Scott Fitzgerald");
        Book b2 = new Book("To Kill a Mockingbird", "Harper Lee");

        LibraryMember member1 = new LibraryMember("John", 101);
        LibraryMember member2 = new LibraryMember("Alice", 102);

        li.addBook(b1);
        li.addBook(b2);
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
