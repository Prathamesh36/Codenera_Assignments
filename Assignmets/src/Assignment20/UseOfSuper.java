package Assignment20;

import java.util.Scanner;

class Multi{
    int k;
    int k1;
    Multi(int k,int k1){
        this.k=k;
        this.k1=k1;
    }
    public void Multiplication(){
        System.out.print("Multiplication is: "+(k*k1));
    }
}

public class UseOfSuper extends Multi{
    UseOfSuper(int k,int k1){
        super(k,k1);
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter your number: ");
        int k= sc.nextInt();
        System.out.print("Enter your number: ");
        int k1= sc.nextInt();
        UseOfSuper ob = new UseOfSuper(k,k1);
        ob.Multiplication();
    }
}
/***********************OUTPUT**************************
 Enter your number: 5
 Enter your number: 3
 Multiplication is: 15
 *******************************************************/
