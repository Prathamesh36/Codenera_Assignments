package NOV18;

import java.util.Scanner;

public class EasyString {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter Your String: ");
        String a = sc.nextLine();
        String str =a.toLowerCase();
        StringBuilder sb = new StringBuilder("");
        char[] ch = str.toCharArray();
        int c=1;
        for(int i=0;i<ch.length;i++){
            c=1;
            for (int j = i+1; j <ch.length; j++) {
                if(ch[i]==ch[j]) {
                    c++;
                    ch[j] = ' ';
                }
            }
            if(ch[i]!=' '){
                sb.append(c);
                sb.append(ch[i]);
            }

        }
        System.out.print("OUTPUT: "+sb);
    }
}
