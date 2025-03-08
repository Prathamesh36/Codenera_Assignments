package OCT17.AmanSir;

import java.util.Scanner;

public class transposeMatrix {

    public int[][] transpose(int a[][]){
        int b[][] = new int[a.length][a.length];
        for(int i=0;i<a.length;i++){
            for(int j=0;j<a[i].length;j++){
                b[i][j]=a[j][i];
            }
        }
        return b;

    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter matrix row length: ");
        int r = sc.nextInt();
        System.out.print("Enter matrix column length: ");
        int c = sc.nextInt();
        int[][] a= new int[r][c];
        System.out.println("Enter your matrix element: ");
        for(int i=0;i<r;i++){
            for(int j=0;j<c;j++){
                a[i][j]=sc.nextInt();
            }
        }
        transposeMatrix ob = new transposeMatrix();
        int g[][]= ob.transpose(a);
        System.out.println("Transpose matrix: ");
        for(int i=0;i<r;i++){
            for(int j=0;j<c;j++){
                System.out.print(g[i][j]+" ");
            }
            System.out.println();
        }
    }
}
