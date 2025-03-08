package NOV28.AmanSir.BookInfo;

import java.util.ArrayList;
import java.util.Collections;

public class BookData {
    public static void main(String[] args) {
        ArrayList<BookInfo> ob = new ArrayList<BookInfo>();

        ob.add(new BookInfo("The India Story","Bimal Jalal",50));
        ob.add(new BookInfo("Listen to Your Heart","Ruskin Bond",20));
        ob.add(new BookInfo("A Place Called Home","Preeti Shenoy",30));
        ob.add(new BookInfo("Spare","J. R. Moehringer",13));

        System.out.println("***********Book Info*********");
        System.out.println(ob);
        Collections.sort(ob,new Title_Sorting());
        System.out.println("***********Title Sorting*********");
        System.out.println(ob);


    }
}
