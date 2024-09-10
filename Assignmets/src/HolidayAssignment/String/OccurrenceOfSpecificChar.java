package HolidayAssignment.String;

import java.util.Scanner;

public class OccurrenceOfSpecificChar {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter your String: ");
        String s = sc.nextLine();
        System.out.print("Enter character to find occurrence: ");
        char b = sc.next().charAt(0);
        char[] ch = s.toCharArray();
        for (int i = 0; i < ch.length; i++) {
            int c=1;
            for (int j = i+1; j < ch.length; j++) {
                if(ch[i]==ch[j]){
                    c++;
                    ch[j]=' ';
                }
            }
            if(ch[i]!=' ' && ch[i]==b){
                System.out.print(b+ " occur "+c+" times");
            }


        }
    }
}
/************************OUTPUT****************************
 Enter your String: Statement
 Enter character to find occurrence: t
 t occur 3 times
 *********************************************************/