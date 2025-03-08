package NOV30.PracticeSession;

import java.util.Collections;
import java.util.LinkedList;

public class ShuffleElmtInLL {
    public static void main(String[] args) {
        LinkedList<Integer> ob = new LinkedList<Integer>();
        ob.add(1);
        ob.add(2);
        ob.add(3);
        ob.add(4);
        ob.add(5);
        ob.add(6);
        System.out.println("Original LL: "+ob);
        Collections.shuffle(ob);
        System.out.println("Shuffled LL: "+ob);
    }
}
