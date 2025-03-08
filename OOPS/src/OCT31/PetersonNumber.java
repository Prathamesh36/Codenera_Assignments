package OCT31;

import java.util.Scanner;

public class PetersonNumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter your number: ");
        int k= sc.nextInt();
        int res=0;
        int sum=0;
        for (int i = k; i!=0; i=i/10) {
            int rem=i%10;

            int fact=1;

            for(int j=rem;j>=1;j--){
                fact=fact*j;
            }
            sum=sum+fact;

        }
       // System.out.println(sum);
        if(sum==k) {
            System.out.print("Given number is peterson number ");
        }
        else {
            System.out.print("Given number is not peterson number ");
        }
    }
}
