package DEC27;

import java.util.HashMap;

public class FirstNonRepeatingCharUsingHashMap {
    public static void main(String[] args) {
        String a = "aaabbcccdeefg";
        System.out.println("String: "+a);
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
        System.out.print("First Non-Repeating Character: ");
        for (Character x : hm.keySet()) {
            if(hm.get(x)==1){
                System.out.print(x);
                break;
            }
        }
    }
}
