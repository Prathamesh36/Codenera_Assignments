package NOV21.PracticeSession;

import java.util.Arrays;
import java.util.Scanner;

public class FindUncommonCharacters {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter Your String: ");
        String a = sc.nextLine();
        System.out.print("Enter Your String: ");
        String b = sc.nextLine();

       // char[] ch= str3.toCharArray();
        System.out.print("Uncommon Characters: ");
        String s= "";
        for (int i = 0; i < a.length(); i++) {
            if(b.indexOf(a.charAt(i))==-1 && s.indexOf(a.charAt(i))==-1 ){
                s+=a.charAt(i);
            }
        }
        for (int i = 0; i < b.length(); i++) {
            if(a.indexOf(b.charAt(i))==-1 && s.indexOf(b.charAt(i))==-1 ){
                s+=b.charAt(i);
            }
        }
        char ch[] = s.toCharArray();
        Arrays.sort(ch);
        System.out.print(new String(ch));

    }
}
