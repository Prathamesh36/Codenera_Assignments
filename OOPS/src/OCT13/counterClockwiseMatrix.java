package OCT13;
/*
4.  Given a matrix of integers, write a function to rotate it counter-clockwise by 90 degrees.
Example:
Input:
[[1, 2, 3],
[4, 5, 6],
[7, 8, 9]]

Output:

[[3, 6, 9],
[2, 5, 8],
[1, 4, 7]]
*/
import java.util.Scanner;

public class counterClockwiseMatrix {

	
	public void counterClockwise() {
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
		for(int i=x-1;i>=0;i--) {
			for(int j=0;j<y;j++) {
				System.out.print(b[i][j]+" ");
			}
			System.out.println();
		}
		
		
	}
		
	public static void main(String[] args) {
		
		counterClockwiseMatrix cl = new counterClockwiseMatrix();
		
		cl.counterClockwise();

	}

}
