package Recursion.Array;

public class ArrayRecursion {

    public static void iterate(int[] arr,int idx){
        if(idx==arr.length){
            return ;
        }
        System.out.print(arr[idx]+" ");
        iterate(arr,idx+1);
    }

    public static void main(String[] args) {

        int[] arr ={5,6,7,8,9};
        int idx=0;
        iterate(arr,0);
    }
}
