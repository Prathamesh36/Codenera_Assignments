package DEC29;

import java.util.LinkedList;

public class AddElmtAtBeginning {
    public static void main(String[] args) {
        LinkedList<Integer> LL = new LinkedList<>();
        LL.add(3);
        LL.add(5);
        LL.add(6);
        LL.add(7);
        LL.add(2);
        System.out.println("Original LL: "+LL);
        LL.add(0,55);
        System.out.println("Updated LL: "+LL);
    }
}
