/*5) WAP check the number is prime or not if the number is prime then check whether the count
 of number is 2 or 3 if the count is 2 then find the sum of both number if the count is three
 then find the cube of echa number and add them.
*/
package JAN29;
import java.util.Scanner;
public class Q5_checkNumberIsPrimeOrNot {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter your number: ");
        int n = sc.nextInt();
        int count =0;
        for (int i = 2; i < n; i++) {
            if(n%i==0) count++;
        }
        if(count==0){
            System.out.println("Number is prime ");
            int digitCount=0;
            for (int i = n; i!=0 ; i=i/10) {
                int rem = i%10;
                digitCount++;
            }
            if(digitCount==2){
                int sum =0;
                for (int i = n; i!=0 ; i=i/10) {
                    int rem = i%10;
                    sum+=rem;
                }
                System.out.println("Sum is : "+sum);
            }
            else if(digitCount==3){
                int SumOfCube=0;
                for (int i = n; i!=0 ; i=i/10) {
                    int rem = i%10;
                    SumOfCube += Math.pow(rem,3);
                }
                System.out.println("Sum of Cube of digits: "+SumOfCube);
            }
        }
        else{
            System.out.println("Number is not prime number");
        }

    }
}
