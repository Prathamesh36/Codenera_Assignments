package PlacementQue.StringQues;

import java.util.Scanner;

public class Q9_RemoveAllWhiteSpaces {

    public static String removeWhiteSpaces(String s){
        return s.replaceAll("\\s", "");
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter your String: ");
        String s = sc.nextLine();
        System.out.println("After removing white spaces: "+removeWhiteSpaces(s));
    }
}
