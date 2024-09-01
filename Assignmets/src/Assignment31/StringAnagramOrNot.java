package Assignment31;

import java.util.Scanner;

public class StringAnagramOrNot {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter your String: ");
        String a = sc.nextLine();
        System.out.print("Enter your String: ");
        String b = sc.nextLine();
        if(a.equals(b)){
            System.out.print("String is Anagram");
        }
        else{
            System.out.print("String is not Anagram");
        }
    }
}
