/*Determine if there exists an element in the array such that the sum of elements at its left is equal to the sum of elements at its right.

input: [1, 2, 3, 4, 3, 2, 1]
Output: An element with equal sums on both sides found at index 3: 4*/
package Test8;

public class Que1 {
    public static void main(String[] args) {
        int a[]={1,2,3,4,3,2,1};
        for(int i =0;i<a.length;i++){
            int firstSum=0;
            for(int j=0;j<i;j++){
                firstSum += a[j];
            }
            int lastSum=0;
            for(int j=i+1;j<a.length;j++){
                lastSum+= a[j];
            }
            if(firstSum==lastSum){
                System.out.print(i+1);
            }
        }
    }
}
