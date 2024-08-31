/*Given a hashmap and an array, find all the values in the hashmap that are present in the array.*/
package Assignment29;

import java.util.Arrays;
import java.util.HashMap;

public class FindValuesThatArePresentInArray {
    public static void main(String[] args) {
        HashMap<Integer,String> ob = new HashMap<>();
        ob.put(108,"java");
        ob.put(188,"sql");
        ob.put(150,"python");
        ob.put(123,"c++");
        ob.put(148,"html");
        ob.put(101,"css");
        System.out.println("HashMap 1: "+ob);
        HashMap<Integer,String> ob2 = new HashMap<>();
        String a[]= {"python","css","javascript","C#"};
        System.out.println("Array: "+ Arrays.toString(a));
        System.out.print("Values Present in both And Array is: ");
        for (String el : a) {
            if(ob.containsValue(el)){
                System.out.print(el+" ");
            }

        }

    }
}
/************************OUTPUT*****************************
 HashMap 1: {148=html, 101=css, 150=python, 123=c++, 108=java, 188=sql}
 Array: [python, css, javascript, C#]
 Values Present in both And Array is: python css
 **********************************************************/