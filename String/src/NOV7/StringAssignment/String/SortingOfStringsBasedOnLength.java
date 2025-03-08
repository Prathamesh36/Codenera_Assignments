package NOV7.StringAssignment.String;

import java.util.Scanner;

public class SortingOfStringsBasedOnLength {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter your String: ");
        String s = sc.nextLine();
       // String s = "My name is a Mohan Raosaheb Master";
        String[] str = s.split(" ");
        for (int i = 0; i < str.length; i++) {
            for (int j = i+1; j <str.length ; j++) {
                if(str[i].length()>str[j].length()){
                    String temp = str[i];
                    str[i]=str[j];
                    str[j]=temp;
                }
            }
        }
        for (int i = 0; i < str.length; i++) {
            System.out.print(str[i]+" ");
        }
    }
}
/**************************OUTPUT****************************
 a is My name Mohan Master Raosaheb
 ***********************************************************/