package DEC5.PracticeSession;

import java.util.HashMap;
import java.util.Map;

public class AssociateSpecifiedValueWithSpeciKeyHashMap {
    public static void main(String[] args) {
        HashMap<Integer,String> ob = new HashMap<Integer,String>();
        ob.put(1,"java");
        ob.put(2,"python");
        ob.put(3,"html");
        ob.put(4,"c");
        ob.put(5,"react");
      /*  for (Map.Entry<Integer,String> el:ob.entrySet()){
            System.out.println(el);
        }*/
        System.out.println(ob);
    }
}
