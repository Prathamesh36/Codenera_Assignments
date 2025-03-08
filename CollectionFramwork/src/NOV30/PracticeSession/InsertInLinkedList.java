package NOV30.PracticeSession;

import java.util.LinkedList;

public class InsertInLinkedList {
    public static void main(String[] args) {
        LinkedList<Integer> ob = new LinkedList<Integer>();
        ob.add(1);
        ob.add(2);
        ob.add(3);
        ob.add(4);
        ob.add(5);
        ob.add(6);
        System.out.println("Original LL: "+ob);
        ob.add(3,99);
        System.out.print("Updated LL: "+ob);
    }
}
