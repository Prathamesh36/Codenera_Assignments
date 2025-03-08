package PlacementQue.StringQues;

import java.util.HashMap;
import java.util.Scanner;

public class Q10_CompressString {

    public static String compress(String n){
        HashMap<Character,Integer> hm = new HashMap<>();
        for(Character ch : n.toCharArray()){
            hm.put(ch,hm.getOrDefault(ch,0)+1);
        }
        StringBuilder sb = new StringBuilder();
        for (Character el : hm.keySet()){
            sb.append(el);
            sb.append(hm.get(el));
        }
        return sb.toString();
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter your String: ");
        String s = sc.nextLine();
        System.out.println("Compress String: "+compress(s));
    }
}
/*******************************OUTPUT********************************
 Enter your String: aaabbcddaaa
 Compress String: a6b2c1d2
 **********************************************************************/