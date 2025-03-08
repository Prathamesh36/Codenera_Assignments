package JAN30.StringQues;

import java.util.HashSet;

public class RemoveAllDuplicatesFromString {
    public static void main(String[] args) {
        String s = "geeksforgeeks";
        System.out.println("String: "+s);
        HashSet<Character> hs = new HashSet<>();
        for (Character ch : s.toCharArray()){
            hs.add(ch);
        }
        StringBuilder ans= new StringBuilder();
        for (Character ch : hs){
            ans.append(ch);
        }
        System.out.println("After removing duplicates: "+ans.toString());
    }
}
