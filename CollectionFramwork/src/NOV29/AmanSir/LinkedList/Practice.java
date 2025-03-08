package NOV29.AmanSir.LinkedList;

import java.util.LinkedList;

public class Practice {
    public static void main(String[] args) {
        LinkedList<Integer> LL = new LinkedList<Integer>();

        LL.add(45);
        LL.add(56);
        LL.add(66);
        LL.add(23);
        LL.add(29);

        System.out.println(LL);

        LL.removeFirst();
        System.out.print("After Removing first element: "+LL);
        LL.removeLast();
        System.out.print("After Removing last element: "+LL);
        LinkedList<Integer> LL1 = new LinkedList<Integer>();

    }
}
