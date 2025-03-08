package NOV20;

import java.util.Scanner;

public class CountVowels {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter your String: ");
        String s = sc.nextLine();
        int c=0;
        for (int i = 0; i < s.length(); i++) {
            char ch=s.charAt(i);
            if(ch=='a' || ch=='e'|| ch=='i'|| ch=='o' || ch=='u'||ch=='A' || ch=='E'|| ch=='I'|| ch=='O' || ch=='U'){
                c++;
            }
        }
        System.out.print("Vowel count: "+c);
    }
}
