package OCT17.AmanSir;

import java.util.Scanner;

public class palindromeCheck {

    public boolean check(int n){
        int res=0;
        int rem;
        for(int i=n;i!=0;i=i/10){
            rem = i%10;
            res = (res*10)+rem;
        }
        if(res==n){
            return true;
        }
        return false;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter your number: ");
        int n = sc.nextInt();
        palindromeCheck ob = new palindromeCheck();

        System.out.print( ob.check(n));
    }
}
