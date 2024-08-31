/*Given two hashmaps, find the intersection of the two hashmaps.*/
package Assignment29;

import java.util.HashMap;
import java.util.Map;

public class IntersectionOfHashMap {
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
        ob1.put(291,"Lokesh");
        System.out.println("HashMap 2: "+ob1);
        HashMap<Integer,String> ob3 = new HashMap<>();
        for (Map.Entry<Integer,String> ob2:ob.entrySet()){
            if(ob1.containsKey(ob2.getKey()) && ob1.get(ob2.getKey()).equals(ob2.getValue())){
                ob3.put(ob2.getKey(),ob2.getValue());
            }
        }
        System.out.println("Intersection: "+ob3);
    }
}
/************************OUTPUT*****************************
 HashMap 1: {291=Lokesh, 217=Satish, 253=Mohan}
 HashMap 2: {291=Lokesh, 247=Siddhant, 202=Aakash, 287=Vivek}
 Intersection: {291=Lokesh}
 **********************************************************/