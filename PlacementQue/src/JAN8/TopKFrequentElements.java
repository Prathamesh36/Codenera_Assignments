package JAN8;

import java.util.HashMap;
import java.util.TreeMap;

public class TopKFrequentElements {
    public static void main(String[] args) {
        int[] a={1,1,2,1,4,2,1,2};
        HashMap<Integer,Integer> hm = new HashMap<>();
        for (int n:a){
            hm.put(n,hm.getOrDefault(n,0)+1);
        }

      //  TreeMap<Integer,>
    }
}
