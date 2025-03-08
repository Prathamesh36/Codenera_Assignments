package ThinkitiveTechPractive;

import java.util.Scanner;

public class sentencePalindrome {

    public static boolean isPali(String s) {
        int j=0;
        int k=s.length()-1;
        while(j<k){
            if (s.charAt(j) != s.charAt(k)) {
                return false;
            }
            j++;
            k--;
        }
        return true;
    }

    public static boolean checkPali(String s){
        String a ="";
        for (String b: s.split(" ")) {
            a+=b;
        }
        return isPali(a.toLowerCase());
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter your String: ");
        String s = sc.nextLine();
        if(checkPali(s)){
            System.out.print("Sentence is palindrome.");
        }
        else{
            System.out.print("Sentence is not palindrome.\n");
        }
    }
}
