/*1) WAP to reverse the number without using loop.
*/
package JAN29;

public class Q1_ReverseNumberUsingLoop {
    public static void main(String[] args) {
        int n =12345;
        int res=0;
        for(int i=n;i!=0;i=i/10){
            int rem=i%10;
            res=res*10+rem;
        }
        System.out.println("Number: "+n);
        System.out.println("Reverse: "+res);
    }
}
