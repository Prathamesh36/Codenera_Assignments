/*WAP to sort the String
  Input string : "geeksforgeeks"
  Output string :"eeeefggkkorss"*/
package NOV9.TejasSir;

import java.util.Scanner;

public class AscendingOrder {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter your String: ");
        String str = sc.next();
        char a []=str.toCharArray();
        for (int i = 0; i < a.length; i++) {
            for (int j = i+1; j < a.length; j++) {
                if(a[i]>a[j]){
                    char temp =a[i];
                    a[i]=a[j];
                    a[j]=temp;
                }
            }
        }
        System.out.print("OUTPUT: ");
        for (int i = 0; i < a.length; i++) {
            System.out.print(a[i]);
        }
    }
}
