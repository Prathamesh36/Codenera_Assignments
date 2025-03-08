package NOV1.AmanSir;

import java.util.Scanner;

public class ABC {
    int a,b;
    public void menu(){
        System.out.println("**********MENU***********");
        System.out.println("1.Addition");
        System.out.println("1.Subtraction");

    }

    public void input(){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter 1st number: ");
        a=sc.nextInt();
        System.out.println("Enter 2nd number: ");
        b=sc.nextInt();
    }

    public void add(){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter 1st number: ");
        a=sc.nextInt();
        System.out.println("Enter 2nd number: ");
        b=sc.nextInt();
    }
}
