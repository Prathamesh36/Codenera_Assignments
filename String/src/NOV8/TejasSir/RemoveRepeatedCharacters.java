package NOV8.TejasSir;

import java.util.Scanner;

public class RemoveRepeatedCharacters {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter your String: ");
        String s = sc.next();
        char []ch = s.toCharArray();
        int c=1;
        for (int i = 0; i < ch.length; i++) {
            c=1;
            for (int j = i+1; j < ch.length ; j++) {
                if(ch[i]==ch[j]){
                    c++;
                    ch[j]=' ';
                }
            }
            if(ch[i]!=' '){
                System.out.print(ch[i]);
            }
        }

    }
}
