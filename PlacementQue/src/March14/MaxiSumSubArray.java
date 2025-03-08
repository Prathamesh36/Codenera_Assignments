package March14;

public class MaxiSumSubArray {

    static int maxSum(int[] a){
       int n=a.length;
       int sum=0;
       int max=Integer.MIN_VALUE;
        for (int i = 0; i < n; i++) {
            sum+=a[i];
            max=Math.max(sum,max);
            if(sum<0) sum=0;
        }
        return max;

    }

    public static void main(String[] args) {
        int[] a= {-2,1,-3,4,-1,2,1,-5,4};
        System.out.println("Maximum Sum: "+maxSum(a));

    }
}
