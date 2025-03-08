package OCT27;

import java.util.Scanner;

class pali{
    int n;
    pali(int n){
        this.n=n;
    }
    public int sum(){
        int res=0;
        int sum=0;
        for(int i=n;i!=0;i=i/10){
            int rem=i%10;
            res=(res*10)+rem;
        }
        if(res==n){
            System.out.println("Number is palindrome");
            System.out.println("Sum of Digit is: ");
            for(int i=n;i!=0;i=i/10){
                int rem=i%10;
                sum=sum+rem;
            }
        }
        else{
            System.out.print("Number is not palindrome");
        }

        return sum;
    }

}


public class PalinfromeAndSum {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter your number: ");
        int num = sc.nextInt();
        pali ob = new pali(num);
        System.out.println(ob.sum());
    }
}
