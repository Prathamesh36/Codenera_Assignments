/*
Q2.Given two arrays X[] and Y[] of positive integers, find the number of
pairs such that x^y > y^x where x is an element from X[] and y is an
element from Y[].
Examples:
Input: X[] = {2, 1, 6}, Y = {1, 5}
Output: 3
Explanation:
The 3 possible pairs are:
(2, 1) => 21 > 12
(2, 5) => 25 (= 32) > 52 (= 25)
(6, 1) => 61 > 16
Input: X[] = {10, 19, 18}, Y[] = {11, 15, 9}
Output: 2
*/
package March14;

public class ThinkitiveCodingQueArray {

    static int checkOp(int[] a, int[] b){
        int c=0;
        for (int i = 0; i < a.length; i++) {
            for (int j = 0; j < b.length; j++) {
                if(Math.pow(a[i],b[j])>Math.pow(b[j],a[i])){
                    c++;
                }
            }
        }
        return c;

    }

    public static void main(String[] args) {
        int[]a ={10, 19, 18};
        int[]b ={11, 15, 9};
        System.out.println("Output: "+checkOp(a,b));

    }
}
