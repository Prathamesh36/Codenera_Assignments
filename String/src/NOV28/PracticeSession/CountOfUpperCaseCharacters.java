package NOV28.PracticeSession;

import java.util.Scanner;

public class CountOfUpperCaseCharacters {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter your String: ");
        String s = sc.nextLine();
        int count=0;
        for (int i = 0; i < s.length(); i++) {
            if(s.charAt(i)>=65 && s.charAt(i)<=90){
                count++;
            }
        }
        System.out.print("Count of UpperCase characters: "+ count);

    }
}
