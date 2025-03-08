package DEC7;

import java.util.ArrayList;
import java.util.List;

public class PrintNonRepeatingElmt {
    public static void main(String[] args) {
        ArrayList<Integer> ob = new ArrayList<>();
        ob.add(5);
        ob.add(8);
        ob.add(7);
        ob.add(9);
        ob.add(8);
        ob.add(7);
        ob.add(8);
        System.out.println("List: "+ob);
        List<Integer> rd = ob.stream().distinct().toList();
        System.out.println("After Removing Duplicates: "+rd);
    }
}
