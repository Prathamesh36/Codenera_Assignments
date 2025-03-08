package OCT27;

import java.util.Scanner;

class prime{
    int n;
    prime(int n){
        this.n=n;
    }
    public int sum(){
        int sum=0;
        int c=0;
        for(int i=2;i<n;i++){
           if(n%2==0){
               c++;
           }
        }
        if(c==0){
            System.out.println("Number is prime");
            System.out.print("Sum of Digit is: ");
            for(int i=n;i!=0;i=i/10){
                int rem=i%10;
                sum=sum+rem;
            }
        }


        return sum;
    }

}


public class PrimeAndSumOfDigits {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter your number: ");
        int num = sc.nextInt();
        prime ob = new prime(num);
        System.out.println(ob.sum());
    }
}
