package Jun25;

import java.util.Scanner;

public class MultiplicationTable {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter your number: ");
        int num = sc.nextInt();
        System.out.print("Enter your range: ");
        int range =sc.nextInt();
        for(int i =1 ; i<=range ; i++){
            System.out.println(num+" * "+i+" = "+num*i);
        }
    }
}
