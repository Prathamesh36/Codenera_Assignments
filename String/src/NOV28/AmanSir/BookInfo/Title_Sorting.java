package NOV28.AmanSir.BookInfo;

import java.util.Comparator;

public class Title_Sorting implements Comparator <BookInfo>{


    @Override
    public int compare(BookInfo o1, BookInfo o2) {
        return o1.getBook_title().compareTo(o2.getBook_title());
    }
}
