package NOV29.PracticeSession.String;

import java.util.Scanner;

public class FindWordInSentence {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter your String: ");
        String s = sc.nextLine();
        if(s.contains("and")){
            System.out.print("and found at index: "+s.indexOf("and"));
        }
    }
}
