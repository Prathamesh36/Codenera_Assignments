package HashMap;

import java.util.HashMap;
import java.util.Scanner;

public class FindFreqOfArrayUsingHashMap {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter Array Size: ");
        int n= sc.nextInt();
        int[] a = new int[n];
        System.out.print("Enter Array Elements: " );
        for (int i = 0; i < a.length; i++) {
            a[i]=sc.nextInt();
        }
        HashMap<Integer,Integer> hm = new HashMap<>();
        for (int i = 0; i < a.length; i++) {
            if(!hm.containsKey(a[i])){
                hm.put(a[i],1);
            }
            else{
                hm.put(a[i],hm.get(a[i])+1);
            }
        }
        System.out.print("Frequency:");
        System.out.println(hm.entrySet());

        /********* Max Frequency ***********/
        int maxFreq=0;
        int ansKey =0;
       /* for (var e :hm.entrySet()) {
            if(e.getValue()>maxFreq){
                maxFreq = e.getValue();
                ansKey = e.getKey();
            }
        }*/

        for(var key : hm.keySet()){
            if(hm.get(key)> maxFreq){
                maxFreq = hm.get(key);
                ansKey=key;
            }
        }
        System.out.println(ansKey+" has max frequency and it occurs "+maxFreq+" times");

    }
}
