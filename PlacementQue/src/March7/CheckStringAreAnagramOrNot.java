package March7;

import java.util.HashMap;

public class CheckStringAreAnagramOrNot {
    public static void main(String[] args) {
        String s1="car";
        String s2="rac";
        System.out.println("String 1: "+s1);
        System.out.println("String 2: "+s2);

        HashMap<Character, Integer> hm =new HashMap<>();
        for (char ch : s1.toCharArray()){
            hm.put(ch,hm.getOrDefault(ch,0)+1);
        }
        for (char ch : s2.toCharArray()){
            hm.put(ch,hm.getOrDefault(ch,0)-1);
        }
        int flag=0;
        for (char ch : hm.keySet()){
            if(hm.get(ch)>0){
                flag++;
            }
        }
        if(flag==0){
            System.out.println("String are Anagram");
        }
        else{
            System.out.println("String are not Anagram");
        }
    }
}
