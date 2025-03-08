/*WAP to check the prime number in array if it is prime number store
into second array and print the reverse of the number.*/
package OCT17.TejasSir;

import java.util.Scanner;

public class checkPrimeAndPrintReverse {

    public void checkPrime(int []a){
        int k=0;
        int c=0;
        int b[] = new int[10];
        for(int i=0 ;i<a.length;i++){
            c=0;
            for(int j=2;j<a[i];j++){
                if(a[i]%j==0){
                    c++;
                }
            }
            if(c==0){
                b[k]=a[i];
                k++;
            }
        }
        int res =0;
        int rem;
        for(int i=0 ;i<b.length;i++){
            res=0;
            for(int j=b[i];j!=0;j=j/10){
                rem = j%10;
                res = (res * 10 )+rem;
            }
            b[i]=res;
        }
        System.out.print("Reverse prime numbers: ");
        for(int i=0;i<b.length;i++){
            if(b[i]!=0) {
                System.out.print(b[i]+ " ");
            }
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter your array size: ");
        int n = sc.nextInt();
        int[] a= new int[n];
        System.out.print("Enter your array element: ");
        for(int i=0;i<n;i++){
            a[i]=sc.nextInt();
        }
        checkPrimeAndPrintReverse ob = new checkPrimeAndPrintReverse();
        ob.checkPrime(a);
    }
}
