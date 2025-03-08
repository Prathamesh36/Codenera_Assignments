package NOV7.StringAssignment.Character;

import java.util.Scanner;

public class MostRepeatedChar {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter your String: ");
        String s = sc.next();
        char []ch = s.toCharArray();
        int c=1;
        int max=0;
        char maxChar=0;
        for (int i = 0; i < ch.length; i++) {
            c=1;
            for (int j = i+1; j < ch.length ; j++) {
                if(ch[i]==ch[j]){
                    c++;
                  //  ch[j]=' ';
                }
            }
            if(c>max /*&& ch[i]!=' '*/){
                max=c;
                maxChar=ch[i];
            }
        }
        System.out.print("Max Repeated Character is: "+maxChar+" (repeated "+max+" times)");

    }
}
