package NOV30.PracticeSession;

import java.util.LinkedList;

public class JoinTwoLL {
    public static void main(String[] args) {
        LinkedList<Integer> ob = new LinkedList<Integer>();
        ob.add(1);
        ob.add(2);
        ob.add(3);
        ob.add(4);
        ob.add(5);
        System.out.println("First LL: "+ob);
        LinkedList<Integer> ob1 = new LinkedList<Integer>();
        ob1.add(6);
        ob1.add(7);
        ob1.add(8);
        ob1.add(9);
        ob1.add(10);
        System.out.println("Second LL: "+ob);
        LinkedList<Integer> ob2 = new LinkedList<Integer>();
        ob2.addAll(ob);
        ob2.addAll(ob1);
        System.out.print("");
        System.out.println("After join: "+ob2);
    }
}
