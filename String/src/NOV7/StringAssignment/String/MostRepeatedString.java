package NOV7.StringAssignment.String;

import java.util.Scanner;

public class MostRepeatedString {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter your String: ");
        String s = sc.nextLine();
        String[] str = s.split(" ");

        int c=0;
        int max=0;
        String maxString="";
        for (int i = 0; i < str.length; i++) {
            c=1;
            for (int j = i+1; j < str.length; j++) {
                if(str[i].equals(str[j])){
                    c++;
                    str[j]=" ";
                }
            }
            if(c>max && !str[i].equals(" ")) {
                max = c;
                maxString = str[i];
            }
        }
        System.out.print("Max Repeated String is: "+maxString+" (repeated "+max+" times)");
    }
}
