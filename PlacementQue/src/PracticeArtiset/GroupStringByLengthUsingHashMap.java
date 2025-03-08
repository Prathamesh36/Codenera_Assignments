/*5.HashMap:
   - Write a Java program to group a list of strings by their lengths using a HashMap. The keys should be the lengths of the strings, and the values should be lists of strings with that length.

*/
package PracticeArtiset;

import java.util.*;

public class GroupStringByLengthUsingHashMap {
    public static void main(String[] args) {
        ArrayList<String> al = new ArrayList<>(Arrays.asList("Java", "Python", "Mumbai", "Codenera", "Check", "Programs", "Cars"));
        HashMap<Integer, List<String>> hm = new HashMap<>();
        for (String el : al){
            if(!hm.containsKey(el.length())){
                hm.put(el.length(),new ArrayList<>());
                hm.get(el.length()).add(el);
            }
            else{
                hm.get(el.length()).add(el);
            }
        }
        for (Map.Entry<Integer, List<String>> entry : hm.entrySet()){
            System.out.println("Length "+entry.getKey()+" : "+entry.getValue());
        }

    }
}
