package JAN2.HashMapQues;

import java.util.HashMap;

public class FrequencyOfEachWord {
    public static void main(String[] args) {
        String b = "java python c++ java java react c++ python";
        HashMap<String,Integer> mp = new HashMap<>();
        /*for (int i = 0; i < a.length; i++)
            if(mp.containsKey(a[i])) mp.put(a[i],mp.get(a[i])+1);
            else mp.put(a[i],1);
        }
        System.out.println("Frequency: ");
        for (String s:mp.keySet()) {
            System.out.println(s+" : "+mp.get(s));
        }*/
        String[] a= b.split(" ");
        for (int i = 0; i < a.length; i++) {

            if(mp.containsKey(a[i])) mp.put(a[i],mp.getOrDefault(a[i],mp.get(a[i]))+1);
            else mp.put(a[i],1);
        }
        System.out.println("word\tFrequency ");
        for (String s:mp.keySet()) {
            System.out.println(s+" : "+mp.get(s));
        }
    }
}
