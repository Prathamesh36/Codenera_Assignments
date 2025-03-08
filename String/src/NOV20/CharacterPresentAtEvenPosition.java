package NOV20;

import java.util.Scanner;

public class CharacterPresentAtEvenPosition {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter your String: ");
        String s = sc.next();
        char[] ch = s.toCharArray();
        System.out.print("Character Present at Even position: ");
        for (int i = 0; i < ch.length; i++) {
            if(i%2==0){
                System.out.print(ch[i]);
            }
        }
        System.out.println();
        System.out.print("Character Present at Odd position: ");
        for (int i = 0; i < ch.length; i++) {
            if(i%2==1){
                System.out.print(ch[i]);
            }
        }
    }
}
