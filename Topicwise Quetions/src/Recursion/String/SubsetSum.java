package Recursion.String;

public class SubsetSum {

    static void subsetSum(int[] a,int n,int idx,int sum){
        if(idx>=n){
            System.out.println(sum);
            return;
        }
        subsetSum(a,n,idx+1,sum+a[idx]);
        subsetSum(a,n,idx+1,sum);
    }

    public static void main(String[] args) {
        int[] a={2,4,5};
        subsetSum(a,a.length,0,0);
    }
}
