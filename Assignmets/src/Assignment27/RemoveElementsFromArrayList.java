/*7.Write a program to remove an element from an ArrayList by its index.*/
package Assignment27;

import java.util.ArrayList;
import java.util.Scanner;

public class RemoveElementsFromArrayList {
    public static void main(String[] args) {
        ArrayList<String> ob = new ArrayList<String>();
        Scanner sc = new Scanner(System.in);
        ob.add("java");
        ob.add("python");
        ob.add("html");
        ob.add("css");
        ob.add("sql");
        ob.add("c");
        ob.add("javascript");
        ob.add("ruby");
        System.out.println(ob);
        System.out.print("Enter Index to remove element: ");
        int a = sc.nextInt();
        ob.remove(a);
        System.out.println("After Removing: "+ob);
    }
}
/**************************OUTPUT*****************************
 [java, python, html, css, sql, c, javascript, ruby]
 Enter Index to remove element: 1
 After Removing: [java, html, css, sql, c, javascript, ruby]
 ************************************************************/