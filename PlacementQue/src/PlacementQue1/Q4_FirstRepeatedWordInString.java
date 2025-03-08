/*Q4.
Find the first repeated word in a string in Java.

Input : "Ravi had been saying that he had been there"
Output : had*/
package PlacementQue1;

import java.util.HashMap;


public class Q4_FirstRepeatedWordInString {
    public static void main(String[] args) {

        String s = "Ravi had been saying that he had been there";
        System.out.println("String: "+s);
        HashMap<String,Integer> hm = new HashMap<>();
        String ans="";
        for(String a:s.split(" ")){
            hm.put(a,hm.getOrDefault(a,0)+1);
            if(hm.get(a)==2){
                ans+=a;
                break;
            }
        }
        System.out.println("OUTPUT: "+ans);

    }
}
