package ThinkBridge;

import java.util.Scanner;

public class BagProblem {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Bag A: ");
        int a = sc.nextInt();
        System.out.print("Bag B: ");
        int b = sc.nextInt();
        System.out.print("Bag C: ");
        int c = sc.nextInt();

        int d =15;
        int e =6;
        System.out.print("OUTPUT: ");
        if(a+b<d && c<e){
            System.out.print("Yes");
        }
        else System.out.print("No");

    }
}
