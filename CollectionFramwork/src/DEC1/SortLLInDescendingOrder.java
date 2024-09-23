package DEC1;

import java.util.Collections;
import java.util.LinkedList;

public class SortLLInDescendingOrder {
    public static void main(String[] args) {
        LinkedList<Integer> LL = new LinkedList<Integer>();
        LinkedList<Integer> LL1 = new LinkedList<Integer>();
        LL.add(6);
        LL.add(2);
        LL.add(3);
        LL.add(4);
        LL.add(9);
        LL.add(12);
        LL.add(1);
        System.out.println(LL);
        Collections.sort(LL);
        for (int i = LL.size()-1; i >= 0; i--) {
            LL1.add(LL.get(i));
        }
        System.out.println(LL1);
    }
}
