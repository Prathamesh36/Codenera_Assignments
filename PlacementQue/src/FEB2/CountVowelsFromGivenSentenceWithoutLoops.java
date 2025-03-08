package FEB2;

import java.util.Scanner;

public class CountVowelsFromGivenSentenceWithoutLoops {

    public static int Vcount(String s,int count){
        if(s.length()==0) return count;
        String vowel ="aeiouAEIOU";
        if(vowel.contains(String.valueOf(s.charAt(0)))) count++;
        return Vcount(s.substring(1),count);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter String: ");
        String s = sc.nextLine();
        int count =0;
        System.out.println("Vowel Count: "+Vcount(s,count));
    }
}
