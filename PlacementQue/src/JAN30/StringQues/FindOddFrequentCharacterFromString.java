package JAN30.StringQues;

import java.util.ArrayList;
import java.util.HashMap;

public class FindOddFrequentCharacterFromString {
    public static void main(String[] args) {
        String s = "GeekforGeeks";


        System.out.println("String: "+s);
        HashMap<Character,Integer> hm = new HashMap<>();
        for (Character el : s.toCharArray()){
            hm.put(el,hm.getOrDefault(el,0)+1);
        }
        ArrayList<Character> al = new ArrayList<>();
        for (Character ch: hm.keySet()){
            if(hm.get(ch)%2==1){
                al.add(ch);
            }
        }
        System.out.println("Odd frequent Characters: "+al);
    }
}
