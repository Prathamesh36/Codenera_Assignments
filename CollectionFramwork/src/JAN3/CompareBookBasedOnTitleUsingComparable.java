/*
Create a class Book that implements Comparable and compares books based on their titles.
*/
package JAN3;

import java.util.ArrayList;
import java.util.Collections;

public class CompareBookBasedOnTitleUsingComparable implements Comparable<CompareBookBasedOnTitleUsingComparable> {
    private String title;
    private String author;
    private int yearPublished;

    public CompareBookBasedOnTitleUsingComparable(String title, String author, int yearPublished) {
        this.title = title;
        this.author = author;
        this.yearPublished = yearPublished;
    }
    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public int getYearPublished() {
        return yearPublished;
    }

    public void setYearPublished(int yearPublished) {
        this.yearPublished = yearPublished;
    }

    @Override
    public String toString() {
        return "\n{" +
                "title='" + title + '\'' +
                ", author='" + author + '\'' +
                ", yearPublished=" + yearPublished +
                '}';
    }

    @Override
    public int compareTo(CompareBookBasedOnTitleUsingComparable otherBook) {
        return this.title.compareTo(otherBook.title);
    }

    public static void main(String[] args) {
        ArrayList<CompareBookBasedOnTitleUsingComparable> ob = new ArrayList<>();
        ob.add(new CompareBookBasedOnTitleUsingComparable("The India Story","Bimal Jalal",50));
        ob.add(new CompareBookBasedOnTitleUsingComparable("Listen to Your Heart","Ruskin Bond",20));
        ob.add(new CompareBookBasedOnTitleUsingComparable("A Place Called Home","Preeti Shenoy",30));
        ob.add(new CompareBookBasedOnTitleUsingComparable("Spare","J. R. Moehringer",13));

        Collections.sort(ob);
        System.out.println(ob);
    }
}
