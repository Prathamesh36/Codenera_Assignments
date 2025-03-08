package Recursion.Array;

public class PrintMaxFromArrayUsingRecursion {

    static int max=0;
    public static int findMax(int[] arr,int idx){
        /*
        if(idx==arr.length){
            return max;
        }
        if(arr[idx]>max){
            max=arr[idx];
        }
        return max;*/
        if(idx==arr.length-1){
            return arr[idx];
        }
      //  int smallAns = findMax(arr,idx+1);
        return Math.max(arr[idx],  findMax(arr,idx+1));


    }

    public static void main(String[] args) {
        int[] arr={40,3,10,3,2,5,20,12};
        int idx =0 ;

        System.out.println(findMax(arr,idx));
    }
}
