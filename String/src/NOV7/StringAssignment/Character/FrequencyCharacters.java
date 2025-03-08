package NOV7.StringAssignment.Character;

import java.util.Scanner;

public class FrequencyCharacters {
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
            if(c>0 && ch[i]!=' '){
                System.out.println(ch[i]+" count is: "+c);
            }
        }
    }
}
/**************************OUTPUT****************************
 Enter your String: ABCDEFG
 Enter no. of rotation you want: 3
 String after anti-clockwise rotations: DEFGABC
 ***********************************************************/
