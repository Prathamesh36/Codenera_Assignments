package JAN30.StringQues;

import java.util.HashMap;

public class LeastFrequentCharacterInString {
    public static void main(String[] args) {
        String s1 = "GeeksforGeeks";
        String s = "GeeksfGeeks";
        System.out.println("String: "+s1);
        HashMap<Character,Integer> hm = new HashMap<>();
        for (Character el : s.toCharArray()){
            hm.put(el,hm.getOrDefault(el,0)+1);
        }
        int min=Integer.MAX_VALUE;
        char ans = ' ';
        for (Character ch: hm.keySet()){
            if(hm.get(ch)<min){
                min=hm.get(ch);
                ans=ch;
            }
        }
        System.out.println("Least frequent Character: "+ans);
    }
}
