/*WAP to find the sum of first 3 numbers in fabannoci sequence?
input: 8
       fabnnoci of 8 is: 0,1,1,2,3,5,8,13
Output:Sum= 0+1+1=2

*/
package OCT27;



import java.util.Scanner;

class fibo{
    int n;
    fibo(int n){
        this.n=n;
    }
    public int sum(){
        int n1=0;
        int n2 =1;
        int t=0;
        int sum=0;
        for(int i=2;i<=n;i++) {
            if (t < 3) {
                sum += n1;
                int n3 = n1 + n2;
               // System.out.print(n3);
                n1 = n2;
                n2 = n3;
                t++;

            }
        }

        return sum;
    }

}

public class FiboSeries {



    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter your number: ");
        int num = sc.nextInt();
        fibo ob = new fibo(num);
        System.out.print("Sum of First three numbers is: ");
        System.out.println(ob.sum());
    }
}
