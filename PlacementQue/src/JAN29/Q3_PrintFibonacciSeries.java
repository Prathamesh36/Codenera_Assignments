/*3) WAP to print the fabannoci Sequence of n number*/
package JAN29;

public class Q3_PrintFibonacciSeries {
    public static void main(String[] args) {
        int n =13;
        System.out.println("Number: "+n);
        int n1=0;
        int n2=1;
        int n3;
        System.out.print(n1+" "+n2+" ");
        for(int i=2;i<n;i++){
            n3=n1+n2;
            System.out.print(n3+" ");
            n1=n2;
            n2=n3;
        }
    }
}
