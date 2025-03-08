package NOV8.TejasSir;

import java.util.Scanner;

public class PrintVowelString {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter your String: ");
        String s = sc.nextLine();
        String[] a = s.split(" ");
        System.out.println("Words starting from vowels: ");
        for (int i = 0; i < a.length; i++) {
            String s1= a[i];
            char ch=s1.charAt(0);
            if(ch=='a' || ch=='e' || ch=='o'||ch=='u'||ch=='i'){
                System.out.println(s1);
            }
        }
    }
}
