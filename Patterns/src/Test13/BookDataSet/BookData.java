/*Q6.1. Multiple Sorting Criteria:
Define a class representing a Book with attributes like title, author, and publication year. Implement both
Comparable and a custom Comparator to sort a list of Books first by author and then by publication year.*/
package Test13.BookDataSet;

import java.util.ArrayList;
import java.util.Collections;

public class BookData {
    public static void main(String[] args) {
        ArrayList<BookInfo> ob = new ArrayList<BookInfo>();

        ob.add(new BookInfo("The India Story","Bimal Jalal",2012));
        ob.add(new BookInfo("Listen to Your Heart","Ruskin Bond",2018));
        ob.add(new BookInfo("A Place Called Home","Preeti Shenoy",2011));
        ob.add(new BookInfo("Spare","J. R. Moehringer",2015));

        System.out.println("***********Book Info*********");
        System.out.println(ob);
        System.out.println("***********Sorting by author name*********");
        Collections.sort(ob);
        System.out.println(ob);
        System.out.println("***********Sorting by Publication year *********");
        Collections.sort(ob,new SortByYear());
        System.out.println(ob);

    }
}
/************************OUTPUT*************************
 ***********Book Info*********
 [
 {book_title='The India Story', author_name='Bimal Jalal', total_stock=2012},
 {book_title='Listen to Your Heart', author_name='Ruskin Bond', total_stock=2018},
 {book_title='A Place Called Home', author_name='Preeti Shenoy', total_stock=2011},
 {book_title='Spare', author_name='J. R. Moehringer', total_stock=2015}]
 ***********Sorting by author name*********
 [
 {book_title='The India Story', author_name='Bimal Jalal', total_stock=2012},
 {book_title='Spare', author_name='J. R. Moehringer', total_stock=2015},
 {book_title='A Place Called Home', author_name='Preeti Shenoy', total_stock=2011},
 {book_title='Listen to Your Heart', author_name='Ruskin Bond', total_stock=2018}]
 ***********Sorting by Publication year *********
 [
 {book_title='A Place Called Home', author_name='Preeti Shenoy', total_stock=2011},
 {book_title='The India Story', author_name='Bimal Jalal', total_stock=2012},
 {book_title='Spare', author_name='J. R. Moehringer', total_stock=2015},
 {book_title='Listen to Your Heart', author_name='Ruskin Bond', total_stock=2018}]
 ********************************************************/
