package March7;

import java.util.HashMap;

public class CountTheWordsInString {
    public static void main(String[] args) {
        String s1 = "java python java react java python";
        System.out.println("String: "+s1);
        HashMap<String, Integer> hm = new HashMap<>();
        for (String str : s1.split(" ")){
            hm.put(str,hm.getOrDefault(str,0)+1);
        }
        for (String str: hm.keySet()){
            System.out.println(str+" :count is: "+hm.get(str));
        }
    }
}
