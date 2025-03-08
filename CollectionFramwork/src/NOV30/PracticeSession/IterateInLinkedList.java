package NOV30.PracticeSession;

import java.util.LinkedList;
import java.util.Iterator;
public class IterateInLinkedList {
    public static void main(String[] args) {
        LinkedList<String> ob = new LinkedList<String>();
        ob.add("java");
        ob.add("is");
        ob.add("object");
        ob.add("oriented");
        ob.add("programming");
        ob.add("language");
        System.out.println(ob);
        Iterator<String> ob1 = ob.listIterator(2);
        while(ob1.hasNext()){
            System.out.println(ob1.next());
        }
    }
}
