package NOV20;

import java.util.Scanner;

public class OccurrenceOfFirstWord {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter your String: ");
        String s = sc.nextLine();
        String[] str = s.split(" ");

        int c=0;
        System.out.print("Occurrence of first word "+str[0]+" is: ");
        for (int i = 0; i < str.length; i++) {
            c=1;
            for (int j = i+1; j < str.length; j++) {
                if(str[i].equals(str[j])){
                    c++;
                    str[j]=" ";
                }
            }
            if(!str[i].equals(" ")){
                System.out.println(c);
                break;
            }
        }
    }
}
