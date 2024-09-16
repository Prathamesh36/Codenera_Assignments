/*3)print the series
0,2,6,12,20,30*/
package PracticeAssignmentDEC15;

public class PrintSeries {
    public static void main(String[] args) {
        int a =0;
        int b=2;
        for (int i = 0; i < 6; i++,b=b+2) {
            System.out.print(a+" ");
            a=a+b;
        }
    }
}
