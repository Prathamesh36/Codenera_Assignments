package NOV7.StringAssignment.Character;

import java.util.Scanner;

public class AscendingChar {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter your String: ");
        String s = sc.next();
        char []a=s.toCharArray();
        for (int i = 0; i < a.length; i++) {
            for (int j = i+1; j < a.length; j++) {
                if(a[i]>a[j]){
                    char temp =a[i];
                    a[i]=a[j];
                    a[j]=temp;
                }
            }
        }
        System.out.print("Ascending String: ");
        for (int i = 0; i < a.length; i++) {
            System.out.print(a[i]);
        }
    }
}
