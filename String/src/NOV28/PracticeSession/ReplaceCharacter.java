package NOV28.PracticeSession;

import java.util.Scanner;

public class ReplaceCharacter {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter your String: ");
        String s = sc.next();
        char ch[]= s.toCharArray();
        System.out.print("Enter new Character: ");
        char a = sc.next().charAt(0);
        System.out.print("Enter Character to replaced: ");
        char b = sc.next().charAt(0);
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < ch.length; i++) {
            if(ch[i]==b){
                ch[i]=a;
            }
            sb.append(ch[i]);
        }
        System.out.print("New String: "+sb);
    }
}
