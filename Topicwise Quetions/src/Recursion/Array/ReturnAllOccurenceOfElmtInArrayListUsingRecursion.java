package Recursion.Array;

import java.util.ArrayList;

public class ReturnAllOccurenceOfElmtInArrayListUsingRecursion {

    static ArrayList<Integer> allIndices(int[] a, int target,int idx){
        ArrayList<Integer> al = new ArrayList<>();
        if(idx==a.length){
            return al;
        }

        if(a[idx]==target){
            al.add(idx);
        }
        ArrayList<Integer> ans= allIndices(a,target,idx+1);
        al.addAll(ans);
        return al;

    }

    public static void main(String[] args) {
        int[] arr={1,2,4,4,5,4};
        int target=4;
        int idx=0;
        ArrayList<Integer> al = allIndices(arr,target,idx);
        System.out.println(al);
    }
}
