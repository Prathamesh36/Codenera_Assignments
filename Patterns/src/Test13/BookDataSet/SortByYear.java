package Test13.BookDataSet;

import java.util.Comparator;

public class SortByYear implements Comparator<BookInfo> {

    @Override
    public int compare(BookInfo o1, BookInfo o2) {
        return o1.getYear()-o2.getYear();
    }
}
