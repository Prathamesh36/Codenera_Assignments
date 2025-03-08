/*Given a list of names, filter out names that start with a vowel and end with a consonant, and
 return the longest name using Stream API.*/
package DEC7;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class FilterNameThatStartsWithA {
    public static void main(String[] args) {
        ArrayList<String> ob = new ArrayList<>();
        Scanner sc = new Scanner(System.in);
        ob.add("anger");
        ob.add("Sea");
        ob.add("All");
        ob.add("Water");
        System.out.println("List: "+ob);
       //List<String> rd = ob.stream();
    }
}
