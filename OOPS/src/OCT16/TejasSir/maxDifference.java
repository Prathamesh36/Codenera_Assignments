/*Write a Java program to find maximum difference between two elements in a given array of
integers such that smaller element appears before larger element.

Example:
Input :
nums = { 2, 3, 1, 7, 9, 5, 11, 3, 5 }
Output:
The maximum difference between two elements of the said array elements
10*/
package OCT16.TejasSir;
public class maxDifference {

    public void maxdiff(){
        int a[]= { 2, 3, 1, 7, 9, 5, 11, 3, 5 };
        int max =0;
        int min =999;
        for(int i=0;i<a.length;i++){
            if(a[i]>max){
                max = a[i];
            }
            if(a[i]<min){
                min=a[i];
            }
        }
        System.out.print("Maximum Difference is: "+(max-min));
    }

    public static void main(String[] args) {
        maxDifference ob = new maxDifference();
        ob.maxdiff();
    }

}
