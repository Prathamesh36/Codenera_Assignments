/*take one n digit number in that no add 1 on odd position digit and add 2 in even position digit


input
12345

output
24466

input 2

1234

output 

2446*/
package OCT30.TejasSir;

import java.util.Scanner;

public class Add1and2ToOddEven {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter your number: ");
        int n= sc.nextInt();
        int res=0;
        for (int i=n;i!=0;i=i/10){
            int rem=i%10;
            if(rem%2==0){
                res=(res*10)+rem+2;
            }
            else{
                res=(res*10)+rem+1;
            }
        }
        int res1=0;
        for (int i=res;i!=0;i=i/10){
            int rem=i%10;
            res1=(res1*10)+rem;
        }
        System.out.print("OUTPUT: "+res1);
    }
}
