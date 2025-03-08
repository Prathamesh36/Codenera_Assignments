package JAN3.Que7;

import java.util.ArrayList;
import java.util.Collections;

public class CompareCarBasedOnSpeed {
    public static void main(String[] args) {
        ArrayList<car> ob = new ArrayList<>();
        ob.add(new car("Nexon",220));
        ob.add(new car("Safari",250));
        ob.add(new car("Harrier",230));
        ob.add(new car("Altroz",180));
        ob.add(new car("Nano",120));
        Collections.sort(ob);
        System.out.println(ob);
    }
}
