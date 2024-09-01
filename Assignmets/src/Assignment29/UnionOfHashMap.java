package Assignment29;

import java.util.HashMap;

public class UnionOfHashMap {
    public static void main(String[] args) {
        HashMap<Integer,String> ob = new HashMap<>();
        ob.put(253,"Mohan");
        ob.put(217,"Satish");
        ob.put(291,"Lokesh");

        System.out.println("HashMap 1: "+ob);
        HashMap<Integer,String> ob1 = new HashMap<>();
        ob1.put(202,"Aakash");
        ob1.put(247,"Siddhant");
        ob1.put(287,"Vivek");
        ob.put(291,"Lokesh");
        System.out.println("HashMap 2: "+ob1);
        ob1.putAll(ob);
        System.out.println("Union: "+ob1);
    }
}
/************************OUTOUT***************************
 HashMap 1: {291=Lokesh, 217=Satish, 253=Mohan}
 HashMap 2: {247=Siddhant, 202=Aakash, 287=Vivek}
 Union: {291=Lokesh, 247=Siddhant, 217=Satish, 202=Aakash, 253=Mohan, 287=Vivek}
 **********************************************************/