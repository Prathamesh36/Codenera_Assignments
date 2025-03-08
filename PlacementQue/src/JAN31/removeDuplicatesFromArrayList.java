package JAN31;

import java.util.ArrayList;

public class removeDuplicatesFromArrayList {
    public static void main(String[] args) {
        ArrayList<Integer> ob = new ArrayList<>();
        ob.add(4);
        ob.add(5);
        ob.add(6);
        ob.add(4);
        ob.add(5);
        ob.add(5);
        System.out.println("ArrayList: "+ob);

        ArrayList<Integer> ob1 = new ArrayList<Integer>();
        for (Integer a: ob) {
            if(!ob1.contains(a)){
                ob1.add(a);
            }
        }
        System.out.println("After Removing Duplicate Elements: "+ob1);

    }
}
