/*3.	Write a program to count the frequency of each word in a given text using a HashMap.
*/
package DEC27;

import java.util.HashMap;
import java.util.Scanner;

public class FindFrequencyOfWordInText {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter your text: ");
        String txt = sc.nextLine();
        String[] st =txt.split(" ");
        HashMap<String,Integer> hm = new HashMap<>();
        for (int i = 0; i < st.length; i++) {
            if(hm.containsKey(st[i])){
                hm.put(st[i],hm.get(st[i])+1);
            }
            else{
                hm.put(st[i],1);
            }
        }
        System.out.println("Word\tFrequency");
        for (var el:hm.keySet()) {
            System.out.println(el+"\t\t"+hm.get(el));
        }
    }
}
