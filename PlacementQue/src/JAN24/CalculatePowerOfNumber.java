package JAN24;

import java.util.Scanner;

public class CalculatePowerOfNumber {

    public static int power(int s,int p){
        if(p==1) return s;
        return s*power(s,p-1);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter number: ");
        int s = sc.nextInt();
        System.out.print("Enter Power: ");
        int p = sc.nextInt();
        System.out.println(s+"^"+p+": "+power(s,p));
    }
}
