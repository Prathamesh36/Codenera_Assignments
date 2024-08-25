/*9.Write a program to check if an ArrayList contains a specific element.*/
package Assignment27;

import java.util.ArrayList;
import java.util.Scanner;

public class CheckArrayListContainsSpecificElmt {
    public static void main(String[] args) {
        ArrayList<String> ob = new ArrayList<String>();
        Scanner sc = new Scanner(System.in);
        ob.add("java");
        ob.add("is");
        ob.add("object");
        ob.add("oriented");
        ob.add("programming");
        ob.add("language");
        System.out.println(ob);
        System.out.print("Enter element to search: ");
        String a = sc.next();
        if(ob.contains(a)){
            System.out.print("Element found, at index: ");
            System.out.print(ob.indexOf(a));
        }
    }
}
/**************************OUTPUT*****************************
 [java, is, object, oriented, programming, language]
 Enter element to search: object
 Element found, at index: 2
 ************************************************************/