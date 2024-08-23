/*Q6. WAP to print the frequency of each word of String.*/
package Assignment23;

import java.util.Scanner;

public class FrequencyOfWords {
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
/*********************OUTPUT************************
 Enter your String: i am student not more than student i student more
 i (count is: 2)
 am (count is: 1)
 student (count is: 3)
 not (count is: 1)
 more (count is: 2)
 than (count is: 1)
 ***************************************************/
