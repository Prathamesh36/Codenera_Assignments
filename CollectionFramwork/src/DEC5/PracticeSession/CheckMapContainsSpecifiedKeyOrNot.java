package DEC5.PracticeSession;

import java.util.HashMap;

public class CheckMapContainsSpecifiedKeyOrNot {
    public static void main(String[] args) {
        HashMap<Integer,String> ob = new HashMap<Integer,String>();
        ob.put(1,"Mumbai");
        ob.put(2,"Pune");
        ob.put(3,"Nashik");
        ob.put(4,"Nagpur");
        ob.put(5,"Surat");
        System.out.println("map: "+ob);
        System.out.println(ob.containsKey(5));
    }
}
