package NOV29.PracticeSession.ArrayList;

import java.util.ArrayList;

public class IterateThroughAllElmentsInArray {
    public static void main(String[] args) {
        ArrayList<String> ob = new ArrayList<String>();
        ob.add("java");
        ob.add("is");
        ob.add("object");
        ob.add("oriented");
        ob.add("programming");
        ob.add("language");

        for (String a:ob) {
            System.out.println(a);
        }

    }
}
