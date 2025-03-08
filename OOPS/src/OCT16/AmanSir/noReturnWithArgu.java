package OCT16.AmanSir;

import java.util.Scanner;

public class noReturnWithArgu {

    public void sum(int a, int b){
        System.out.println("Addition is: "+(a+b));
    }
    public void sub(int a, int b){
        System.out.println("Subtraction is: "+(a-b));
    }
    public void mul(int a, int b){
        System.out.println("Multiplication is: "+(a*b));
    }
    public void div(double a, double b){
        System.out.println("Division is: "+(a/b));
    }

    public static void main(String[] args) {
        noReturnWithArgu ob= new noReturnWithArgu();
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter your 1st number: ");
        int a = sc.nextInt();
        System.out.print("Enter your 2nd number: ");
        int b= sc.nextInt();
        ob.sum(a,b);
        ob.sub(a,b);
        ob.mul(a,b);
        ob.div((double)a,(double)b);
    }
}
