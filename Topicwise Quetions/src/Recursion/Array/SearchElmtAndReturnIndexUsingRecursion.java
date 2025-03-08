package Recursion.Array;

public class SearchElmtAndReturnIndexUsingRecursion {
    //find first occurrence of element
  /*  public static int searchElmtIndex(int[] arr, int idx,int target){
        if(idx==arr.length){
            return -1;
        }
        if(arr[idx]==target){

            return idx;

        }
        return searchElmtIndex(arr,idx+1,target);

    }*/
    //find all occurrence of element
    public static void searchElmtIndexs(int[] arr, int idx, int target){
        if(idx==arr.length){
            return;
        }
        if(arr[idx]==target){
            System.out.print(idx+" ");

        }
        searchElmtIndexs(arr,idx+1,target);

    }

    public static void main(String[] args) {
        int[] arr={3,2,2,2,2,5,2};
        int idx =0 ;
        int target=2;
       // System.out.println(searchElmtIndex(arr,idx,target));
        searchElmtIndexs(arr,idx,target);
    }
}
