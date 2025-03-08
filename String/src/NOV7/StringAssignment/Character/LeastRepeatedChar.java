package NOV7.StringAssignment.Character;

import java.util.Scanner;

public class LeastRepeatedChar {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter your String: ");
        String s = sc.next();
        char []ch = s.toCharArray();
        int c=1;
        int min=999;
        char minChar=0;
        for (int i = 0; i < ch.length; i++) {
            c=1;
            for (int j = i+1; j < ch.length ; j++) {
                if(ch[i]==ch[j]){
                    c++;
                    ch[j]=' ';
                }
            }
            if(c<min && ch[i]!=' '){
                min=c;
                minChar=ch[i];
            }
        }
       System.out.print("Min Repeated Character is: "+minChar+" (repeated "+min+" times)");

    }
}
