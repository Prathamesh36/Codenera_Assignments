package Test8;
import java.util.Scanner;

public class SumOfPrimeNumbers {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int sum =0;
        System.out.print("Enter your number: ");
        int n = sc.nextInt();
        int c = 0;
        int k=5;
        System.out.print("Prime Series: ");
        for (int j = 2; j < n; j++) {
            c=0;
            for (int i = 2; i < j; i++) {
                if (j % i == 0 ) {
                    c++;
                }
            }
            if(c==0 ){
                System.out.print(j+" ");
                if(k>=1) {
                    sum += j;
                    k--;
                }
            }
        }
        System.out.print("\nSum of first 5 prime number is: "+sum);
    }
}
/***********************OUTPUT*************************
 Enter your number: 20
 Prime Series: 2 3 5 7 11 13 17 19
 Sum of first 5 prime number is: 28
 *****************************************************/
