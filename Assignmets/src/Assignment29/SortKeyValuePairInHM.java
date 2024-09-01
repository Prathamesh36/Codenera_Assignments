/*Write a function to sort the key-value pairs in a hashmap.*/
package Assignment29;
import java.util.HashMap;

import java.util.TreeMap;

public class SortKeyValuePairInHM {
    public static void main(String[] args) {
        HashMap<Integer,String> ob = new HashMap<>();
        ob.put(202,"Aakash");
        ob.put(253,"Mohan");
        ob.put(217,"Satish");
        ob.put(247,"Siddhant");
        ob.put(291,"Lokesh");
        ob.put(287,"Vivek");
        System.out.println("HashMap: "+ob);
        TreeMap<Integer,String> ob1 = new TreeMap<>(ob);
        System.out.println("Ascending Sort: "+ob1);
    }
}
/************************OUTOUT***************************
 HashMap: {291=Lokesh, 247=Siddhant, 217=Satish, 202=Aakash, 253=Mohan, 287=Vivek}
 Ascending Sort: {202=Aakash, 217=Satish, 247=Siddhant, 253=Mohan, 287=Vivek, 291=Lokesh}
 **********************************************************/