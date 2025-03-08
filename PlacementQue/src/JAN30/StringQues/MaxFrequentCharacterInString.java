package JAN30.StringQues;

import java.util.HashMap;

public class MaxFrequentCharacterInString {
    public static void main(String[] args) {
        String s = "GeeksforGeeks";
        System.out.println("String: "+s);
        HashMap<Character,Integer> hm = new HashMap<>();
        for (Character el : s.toCharArray()){
            hm.put(el,hm.getOrDefault(el,0)+1);
        }
        int max=Integer.MIN_VALUE;
        char ans = ' ';
        for (Character ch: hm.keySet()){
            if(hm.get(ch)>max){
                max=hm.get(ch);
                ans=ch;
            }
        }
        System.out.println("Max frequent Character: "+ans);
    }
}
