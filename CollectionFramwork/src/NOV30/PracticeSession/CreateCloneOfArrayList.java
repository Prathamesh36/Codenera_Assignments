package NOV30.PracticeSession;

import java.util.ArrayList;

public class CreateCloneOfArrayList {
    public static void main(String[] args) {
        ArrayList<Integer> ob = new ArrayList<Integer>();
        ob.add(5);
        ob.add(6);
        ob.add(8);
        ob.add(7);
        ob.add(3);
        ob.add(4);
        System.out.println("Original ArrayList "+ob);
        ArrayList<Integer> ob1 = new ArrayList<Integer>(ob);
        System.out.println("Cloned ArrayList "+ob1);

    }
}
