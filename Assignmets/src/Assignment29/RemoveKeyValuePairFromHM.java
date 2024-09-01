/*Write a function to remove a key-value pair from a hashmap.*/
package Assignment29;

import java.util.HashMap;

public class RemoveKeyValuePairFromHM {
    public static void main(String[] args) {
        HashMap<Integer,String> ob = new HashMap<>();
        ob.put(202,"Aakash");
        ob.put(253,"Mohan");
        ob.put(217,"Satish");
        ob.put(247,"Siddhant");
        ob.put(291,"Lokesh");
        ob.put(287,"Vivek");
        System.out.println("HashMap: "+ob);
        ob.remove(247);
        System.out.println("After Removing Key Value Pair: "+ob);
    }
}
/************************OUTOUT***************************
 HashMap: {291=Lokesh, 247=Siddhant, 217=Satish, 202=Aakash, 253=Mohan, 287=Vivek}
 After Removing Key Value Pair: {291=Lokesh, 217=Satish, 202=Aakash, 253=Mohan, 287=Vivek}
 **********************************************************/