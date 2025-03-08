/*2) wap to print check whether the element is plaindrom or not, if the element is palindrom find the sum of the element , if not then find the average of the element.

int[] arr={121, 133, 131}
output:
      121-> Palindrom->sum: 3
      133-> Not plaindrom-> Avg: 2
      131-> Palindrom-> sum: 5*/
package JAN31.Advance;

import java.util.Arrays;

public class CheckNumberIsPalindromeOrNotAndPerformOp {

    public static boolean isPali(int a){
        int res=0;
        for (int i = a; i != 0 ; i=i/10) {
            int rem = i%10;
            res=(res*10)+rem;
        }
        if(a==res){
            return true;
        }
        return false;
    }

    public static int sum(int a){
        int sum=0;
        for (int i=a; i!=0 ; i=i/10) {
            int rem = i%10;
            sum+=rem;
        }
        return sum;
    }

    public static int avg(int a){
        int sum=0;
        int count=0;
        for (int i=a; i!=0 ; i=i/10) {
            int rem = i%10;
            sum+=rem;
            count++;
        }
        return (sum/count);
    }

    public static void main(String[] args) {
        int[] arr = {121, 133, 131};
        System.out.println("arr[] ="+ Arrays.toString(arr));
        System.out.println("Output: ");
        for (int i = 0; i < arr.length; i++) {
            if(isPali(arr[i])){
                System.out.println(arr[i]+"-> Palindrome -> Sum: "+sum(arr[i]));
            }
            else{
                System.out.println(arr[i]+"-> Not palindrome-> Avg: "+avg(arr[i]));
            }
        }
    }
}
