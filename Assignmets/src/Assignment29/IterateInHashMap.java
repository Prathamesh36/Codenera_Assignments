/*Write a function to iterate over all the key-value pairs in a hashmap.*/
package Assignment29;

import java.util.HashMap;
import java.util.Iterator;

public class IterateInHashMap {
    public static void main(String[] args) {
        HashMap<Integer,String> ob = new HashMap<>();
        ob.put(202,"Aakash");
        ob.put(253,"Mohan");
        ob.put(217,"Satish");
        ob.put(247,"Siddhant");
        ob.put(291,"Lokesh");
        ob.put(287,"Vivek");
        System.out.println("HashMap: "+ob);
        Iterator it = ob.entrySet().iterator();
        while(it.hasNext()){
            System.out.print(it.next()+" ");
        }

    }
}
/************************OUTOUT***************************
 HashMap: {291=Lokesh, 247=Siddhant, 217=Satish, 202=Aakash, 253=Mohan, 287=Vivek}
 Enter Key: 217
 Value Of Given Key is: Satish
 **********************************************************/