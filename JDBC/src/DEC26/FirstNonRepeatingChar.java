/*Q3.First Non-Repeating Character:
Create a Java function that finds the first non-repeating character in a given string. Use a HashMap to
store character frequencies.*/
package DEC26;

import java.util.HashMap;

public class FirstNonRepeatingChar {
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
