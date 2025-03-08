package NOV29.PracticeSession.String;

import java.util.Scanner;

public class CapitalizedEachWordOfString {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter your String: ");
        String s = sc.nextLine();
        char[] ch = s.toCharArray();
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < ch.length; i++) {
            ch[0]= (char) (ch[0]-32);
            if(ch[i]==' '){
                ch[i+1]=(char)(ch[i+1]-32);
            }
            sb.append(ch[i]);
        }
        System.out.print("OUTPUT: "+sb);
    }
}
