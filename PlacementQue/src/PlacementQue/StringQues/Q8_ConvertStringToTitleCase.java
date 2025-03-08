/*Write a function to convert a string to title case (capitalize the first letter of each word).*/
package PlacementQue.StringQues;

import java.util.Scanner;

public class Q8_ConvertStringToTitleCase {

    public static String titleCase(String s){
        String[] words = s.split(" ");
        StringBuilder result = new StringBuilder();

        for (String word : words) {
            if (word.length() > 0) {
                result.append(Character.toUpperCase(word.charAt(0)));
                result.append(word.substring(1).toLowerCase());
                result.append(" ");
            }
        }

        return result.toString().trim();
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter your String: ");
        String s = sc.nextLine();
        System.out.println("Title Case: "+titleCase(s));
    }
}
/*******************************OUTPUT********************************
 Enter your String: java is object oriented programming language
 After removing white spaces: javaisobjectorientedprogramminglanguage
 **********************************************************************/