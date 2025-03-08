package NOV7.StringAssignment.String;

import java.util.Scanner;

public class LeastRepeatedString {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter your String: ");
        String s = sc.nextLine();
        String[] str = s.split(" ");

        int c=0;
        int min=9999;
        String minString="";
        for (int i = 0; i < str.length; i++) {
            c=1;
            for (int j = i+1; j < str.length; j++) {
                if(str[i].equals(str[j])){
                    c++;
                    str[j]=" ";
                }
            }
            if(c<min && !str[i].equals(" ")) {
                min = c;
                minString = str[i];
            }
        }
        System.out.print("Max Repeated String is: "+minString+" (repeated "+min+" times)");
    }
}
