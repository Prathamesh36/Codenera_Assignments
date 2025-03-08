package NOV7.StringAssignment.String;

import java.util.Scanner;

public class FreqStrings {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter your String: ");
        String s = sc.nextLine();
        String[] str = s.split(" ");

        int c=0;
        for (int i = 0; i < str.length; i++) {
            c=1;
            for (int j = i+1; j < str.length; j++) {
                if(str[i].equals(str[j])){
                    c++;
                    str[j]=" ";
                }
            }
            if(c>0 && !str[i].equals(" ")){
                System.out.println(str[i]+" (count is: "+c+")");
            }
        }
    }
}
/**************************OUTPUT****************************
 My (count is: 2)
 name (count is: 1)
 is (count is: 2)
 Prathamesh (count is: 1)
 ***********************************************************/