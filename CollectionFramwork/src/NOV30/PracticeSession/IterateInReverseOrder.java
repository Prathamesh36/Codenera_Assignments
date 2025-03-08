package NOV30.PracticeSession;

import java.util.Iterator;
import java.util.LinkedList;

public class IterateInReverseOrder {
    public static void main(String[] args) {
        LinkedList<String> ob = new LinkedList<String>();
        ob.add("java");
        ob.add("is");
        ob.add("object");
        ob.add("oriented");
        ob.add("programming");
        ob.add("language");
        System.out.println(ob);
        Iterator<String> ob1 = ob.descendingIterator();
        String I = ob1.next();
        System.out.print("Reverse Iteration: ");
        while(ob1.hasNext()){
            System.out.print(ob1.next()+" ");
        }
    }
}
