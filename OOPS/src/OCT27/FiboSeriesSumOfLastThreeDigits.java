/*WAP to find the sum of last 3 numbers in fabannoci sequence?
input: 8
       fabnnoci of 8 is: 0,1,1,2,3,5,8,13
Output:Sum= 13+8+5=26
*/
package OCT27;

import java.util.Scanner;

class fibo1{
    int n;
    fibo1(int n){
        this.n=n;
    }
    public int sum(){
        int n1=0;
        int n2 =1;
        int t=0;
        int sum=0;
       // System.out.print(n1+" "+n2+" ");

        for(int i=3;i<=n;i++) {
            int n3 = n1 + n2;
            n1 = n2;
            n2 = n3;

                if(i>n-3) {

                   // System.out.print(n3 + " ");
                    sum+=n3;

                }

        }

        return sum;
    }

}
public class FiboSeriesSumOfLastThreeDigits {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter your number: ");
        int num = sc.nextInt();
        fibo1 ob = new fibo1(num);
        System.out.print("Sum of Last three numbers is: ");
        System.out.println(ob.sum());
    }
}
