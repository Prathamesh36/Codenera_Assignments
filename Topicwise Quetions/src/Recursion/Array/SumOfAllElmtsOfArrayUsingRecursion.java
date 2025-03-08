package Recursion.Array;

public class SumOfAllElmtsOfArrayUsingRecursion {

    public static int sumOfElmts(int[] arr, int idx){
        // or if(idx==arr.length) return 0;
        if(idx==arr.length-1) return arr[idx];
        return (arr[idx]+ sumOfElmts(arr,idx+1));
    }

    public static void main(String[] args) {
        int[] arr={3,2,5};
        int idx =0 ;
        System.out.println(sumOfElmts(arr,idx));
    }
}
