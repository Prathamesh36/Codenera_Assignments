/*Write a function to check if a given key exists in a hashmap.*/
package Assignment29;

import java.util.HashMap;
import java.util.Scanner;

public class CheckKeyExistOrNot {
    public static void main(String[] args) {
        HashMap<Integer,String> ob = new HashMap<>();
        ob.put(202,"Aakash");
        ob.put(253,"Mohan");
        ob.put(217,"Satish");
        ob.put(247,"Siddhant");
        ob.put(291,"Lokesh");
        ob.put(287,"Vivek");
        System.out.println("HashMap: "+ob);
        System.out.print("Enter Key: ");
        Scanner sc= new Scanner(System.in);
        int k = sc.nextInt();
        if(ob.containsKey(k)) System.out.println("Given key Exist in Hashmap");
        else System.out.println("Given key not exist in Hashmap");

    }
}
/************************OUTOUT***************************
 HashMap: {291=Lokesh, 247=Siddhant, 217=Satish, 202=Aakash, 253=Mohan, 287=Vivek}
 Enter Key: 247
 Given key Exist in Hashmap
**********************************************************/