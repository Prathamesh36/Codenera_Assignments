package OCT13;

import java.util.Scanner;

public class matrixMultiplication {

	public void multiplication() {
		Scanner sc= new Scanner(System.in);
 		System.out.print("Enter row size of matrix 1: ");
 		int r = sc.nextInt();
		System.out.print("Enter column size of matrix 1: ");
 		int c = sc.nextInt();
 		System.out.println("Enter matrix 1 element: ");
 		int a[][]=new int[r][c];
 		for(int i=0;i<r;i++){
 			for(int j=0;j<c;j++){
				a[i][j]=sc.nextInt();
			}	
 		}
 		
		System.out.print("Enter row size of matrix 2: ");
 		int r1 = sc.nextInt();
		System.out.print("Enter column size of matrix 2: ");
 		int c1 = sc.nextInt();
 		System.out.println("Enter matrix 2 element: ");
 		int b[][]=new int[r1][c1];
 		for(int i=0;i<r1;i++){
 			for(int j=0;j<c1;j++){
				b[i][j]=sc.nextInt();
			}	
 		}
		
 		int h[][] = new int[r][c];
 		for(int i=0;i<a.length;i++){
 			for(int j=0;j<a.length;j++){
				h[i][j]=0;
					for(int k=0;k<b.length;k++){
						h[i][j]+=a[i][k]*b[k][j];
					}
			}
		}
		System.out.println("Array Multiplication: ");
		for(int i=0;i<h.length;i++){
 			for(int j=0;j<h.length;j++){
				System.out.print(h[i][j]+" ");
			
			}
			System.out.println();
		}
		
	}
	
	public static void main(String[] args) {
		matrixMultiplication ml = new matrixMultiplication();
		
		ml.multiplication();
	}

}
