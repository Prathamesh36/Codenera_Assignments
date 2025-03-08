package NOV20;

import java.util.Scanner;

public class FindLongestWordInString {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter your String: ");
        String s = sc.nextLine();
        String[] a= s.split(" ");
        int max = 0;
        String b ="";
        for (int i = 0; i < a.length; i++) {
            if(a[i].length()>max){
                max=a[i].length();
                b=a[i];
            }
        }
        System.out.print("Longest Word is: "+b);
    }
}
