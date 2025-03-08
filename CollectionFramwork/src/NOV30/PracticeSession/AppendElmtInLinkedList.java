package NOV30.PracticeSession;

import java.util.LinkedList;

public class AppendElmtInLinkedList {
    public static void main(String[] args) {
        LinkedList<Integer> ob = new LinkedList<Integer>();
        ob.add(5);
        ob.add(6);
        ob.add(7);
        ob.add(8);
        System.out.print("Original LL: ");
        System.out.println(ob);
        ob.add(9);
        System.out.print("Updated LL: ");
        System.out.println(ob);
    }
}
