package OCT18.AmanSir;

import java.util.Scanner;

public class power {

    public int power1(int a){
        int pow = a * a;
        return pow;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter number: ");
        int a =sc.nextInt();
        power ob = new power();
        System.out.print("Power of given number is: "+ob.power1(a));
    }
}
