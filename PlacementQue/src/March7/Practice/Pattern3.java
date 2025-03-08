package March7.Practice;

public class Pattern3 {
    public static void main(String[] args) {
        int n=5;
        int[][] a = new int[n][n];
        int left=0;
        int right=a.length-1;
        int top=0;
        int bottom=a.length-1;
        int count=1;
        while(left<n){
            for (int i = top; i <=bottom; i++) {
                a[i][left]=count++;
            }
            if(left==n-1) break;
            left++;

            for(int i=bottom;i>=top;i--){
                a[i][left]=count++;
            }
            if(left==n-1) break;
            left++;
            for (int i = top; i <=bottom ; i++) {
                a[i][left]=count++;
            }
            if(left==n-1) break;
            left++;
            for(int i=bottom;i>=top;i--){
                a[i][left]=count++;
            }
            if(left==n-1) break;
            left++;

        }

        System.out.println("Spiral Pattern: ");
        for (int i = 0; i < a.length; i++) {
            for (int j = 0; j < a[0].length; j++) {
                System.out.print(a[i][j]+" ");
            }
            System.out.println();
        }
    }
}
