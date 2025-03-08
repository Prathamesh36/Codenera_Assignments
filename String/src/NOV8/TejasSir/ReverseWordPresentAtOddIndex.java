package NOV8.TejasSir;

import java.util.Scanner;

public class ReverseWordPresentAtOddIndex {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter your String: ");
        String s = sc.nextLine();
        String[] str = s.split(" ");
        System.out.print("Reverse String: ");
        for (int i = 0; i < str.length ; i++) { //my name is prathamesh patil
            if(i%2==1) {
                String a = str[i];          //name
                str[i]="";
                char[] b = a.toCharArray(); // n a m e
                for (int j = b.length - 1; j >= 0; j--) {
                    str[i]+=b[j];
                }
            }
        }
        for (int i = 0; i < str.length; i++) {
            System.out.print(str[i]+" ");
        }
    }
}
