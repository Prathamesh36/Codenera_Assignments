package JAN11;

import java.util.ArrayList;
import java.util.Collections;

public class ReverseArrayList {
    public static void main(String[] args) {
        ArrayList<Integer> ob = new ArrayList<>();
        ob.add(4);
        ob.add(5);
        ob.add(6);
        ob.add(3);
        ob.add(1);
        ob.add(2);

        System.out.println("ArrayList: "+ob);
     //   Collections.sort(ob);
        Collections.reverse(ob);
        System.out.println("Descending arrayList: "+ob);
    }
}
