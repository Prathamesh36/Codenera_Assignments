package JAN8;

import java.util.HashMap;

public class FistNonRepeatingCharacter {
    public static char FirstNon(String a){
        HashMap<Character,Integer> hm = new HashMap<>();
        for(int i=0;i<a.length();i++){
            Character ch = a.charAt(i);
            if(hm.containsKey(ch)){
                hm.put(ch, hm.get(ch)+1);
            }
            else{
                hm.put(ch, 1);
            }
        }
        char flag=0;
        for (Character x : hm.keySet()) {
            if(hm.get(x)==1){
                flag=x;
                break;
            }
        }
        return flag;
    }

    public static void main(String[] args) {
        String a = "aaabbcccdeefg";
        System.out.println("String: "+a);
        System.out.print("First Non-Repeating Character: "+FirstNon(a));
    }
}
