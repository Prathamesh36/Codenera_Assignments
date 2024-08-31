/*Write a function to find the minimum value in a hashmap.*/
package Assignment29;

import java.util.HashMap;
import java.util.Map;

public class FindMinValueOfHashMap {
    public static void main(String[] args) {
        HashMap<Integer,String> ob = new HashMap<>();
        ob.put(202,"Aakash");
        ob.put(253,"Mohan");
        ob.put(217,"Satish");
        ob.put(247,"Siddhant");
        ob.put(291,"Lokesh");
        ob.put(287,"Vivek");
        System.out.println("HashMap: "+ob);
        int min =Integer.MAX_VALUE;

        for (Map.Entry<Integer,String> ob1:ob.entrySet()){
            if(ob1.getKey()<min)
                min =ob1.getKey();
        }
        System.out.println("Min Key: "+min);
    }
}
/************************OUTOUT***************************
 HashMap: {291=Lokesh, 247=Siddhant, 217=Satish, 202=Aakash, 253=Mohan, 287=Vivek}
 Min Key: 202
 **********************************************************/