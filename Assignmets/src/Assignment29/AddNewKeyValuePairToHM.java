/*Write a function to add a new key-value pair to a hashmap.*/
package Assignment29;

import java.util.HashMap;

public class AddNewKeyValuePairToHM {
    public static void main(String[] args) {
        HashMap<Integer,String> ob = new HashMap<>();
        ob.put(202,"Aakash");
        ob.put(253,"Mohan");
        ob.put(217,"Satish");
        ob.put(247,"Siddhant");
        ob.put(291,"Lokesh");
        ob.put(287,"Vivek");
        System.out.println("HashMap: "+ob);
        ob.put(265,"Ravi");
        System.out.println("Updated Hashmap: "+ob);
    }
}
/************************OUTOUT***************************
 HashMap: {291=Lokesh, 247=Siddhant, 217=Satish, 202=Aakash, 253=Mohan, 287=Vivek}
 Updated Hashmap: {291=Lokesh, 247=Siddhant, 217=Satish, 265=Ravi, 202=Aakash, 253=Mohan, 287=Vivek}
 **********************************************************/