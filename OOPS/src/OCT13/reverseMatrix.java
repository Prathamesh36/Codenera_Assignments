package OCT13;
/*1: Implement a function to rotate a square matrix (2D array) by 90 degrees in clockwise direction.
Example:
Input:
[[1, 2, 3],
[4, 5, 6],
[7, 8, 9]]

Output:
[[7, 4, 1],
[8, 5, 2],
[9, 6, 3]]
*/
import java.util.Scanner;
public class reverseMatrix {

	public void rotateMatrix() {
		Scanner sc= new Scanner(System.in);
		System.out.print("Enter matrix row number: ");
		int x=sc.nextInt();
		System.out.print("Enter matrix column number: ");
		int y=sc.nextInt();
		int a[][]= new int[x][y];
		for(int i=0;i<x;i++) {
			for(int j=0;j<y;j++) {
				a[i][j]=sc.nextInt();
			}
		}
		int b[][]=new int[x][y];
		for(int i=0;i<x;i++) {
			for(int j=0;j<y;j++) {
				b[i][j]=a[j][i];
			}
		}
		System.out.println("Matrix after 90deg rotation: ");
		for(int i=0;i<x;i++) {
			for(int j=y-1;j>=0;j--) {
				System.out.print(b[i][j]+" ");
			}
			System.out.println();
		}
		
		
	}
	
	public static void main(String[] args) {
		reverseMatrix rm= new reverseMatrix();
		rm.rotateMatrix();
		
		

	}

}
