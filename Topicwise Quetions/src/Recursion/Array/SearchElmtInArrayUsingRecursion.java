package Recursion.Array;

public class SearchElmtInArrayUsingRecursion {

    public static boolean searchElmt(int[] arr, int idx,int target){
        if(arr[idx]== target){
            return true;
        }
        else if(idx==arr.length-1){
            return false;
        }
        return searchElmt(arr, idx + 1, target);

    }

    public static void main(String[] args) {
        int[] arr={3,2,5};
        int idx =0 ;
        int target=3;
        System.out.println(searchElmt(arr,idx,target));
    }
}
