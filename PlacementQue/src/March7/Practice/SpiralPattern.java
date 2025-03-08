package March7.Practice;


public class SpiralPattern {
    public static void main(String[] args) {
        int n=5;
        int a[][] = new int[n][n];

        int top=0;
        int bottom=a.length-1;
        int left=0;
        int right=a.length-1;
        int count=1;
        while(left<=right){
            for(int i=left;i<=right;i++){
                a[top][i]=count++;
            }
            top++;
            for(int i=top;i<=bottom;i++){
                a[i][right]=count++;
            }
            right--;
            for (int i = right; i >=left ; i--) {
                a[bottom][i]=count++;
            }
            bottom--;
            for (int i = bottom; i >=top ; i--) {
                a[i][left]=count++;
            }
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


/*public class SpiralPattern {
    public static void main(String[] args) {
        int n=5;
        int a[][] = new int[n][n];

        int start=0;
        int end=a.length-1;
        int row=0;
        int col=0;
        int count=1;

        while(start<=end){
            for(int i=start;i<end;i++) {
                a[row][col] = count++;
                col++;
            }
            for(int i=start;i<end;i++){
                a[row][col]=count++;
                row++;
            }
            for(int i=start;i<end;i++){
                a[row][col]=count++;
                col--;
            }
            for (int i=start;i<end;i++){
                a[row][col]=count++;
                row--;
            }
            if(col==a.length/2){
                a[row][col]=count++;
            }
            row++;
            col++;
            start++;
            end--;
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
*/