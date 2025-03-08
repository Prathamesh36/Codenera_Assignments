package DEC5.PracticeSession;

import java.util.HashMap;

public class copyToAnotherMap {
    public static void main(String[] args) {
        HashMap<Integer,String> ob = new HashMap<Integer,String>();
        ob.put(1,"Mumbai");
        ob.put(2,"Pune");
        ob.put(3,"Nashik");
        ob.put(4,"Nagpur");
        ob.put(5,"Surat");
        System.out.println("First map: "+ob);
        HashMap<Integer,String> ob1 = new HashMap<Integer,String>();
       /* ob1.put(6,"Chennai");
        ob1.put(7,"Thane");
        ob1.put(8,"Latur");*/
        ob1.putAll(ob);
        System.out.println("Second map: "+ob1);
    }
}
