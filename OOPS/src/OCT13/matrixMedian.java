package OCT13;
/*2: Given a matrix of integers, write a function to find the median of the matrix. The matrix is sorted in non-decreasing order both row-wise and column-wise.
Example:
Input:

[1, 3, 5],
[2, 6, 9],
[3, 6, 9]

Output: 5
*/
import java.util.Scanner;

public class matrixMedian {
	
	public void median() {
		Scanner sc= new Scanner(System.in);
		System.out.print("Enter matrix row number: ");
		int x=sc.nextInt();
		System.out.print("Enter matrix column number: ");
		int y=sc.nextInt();
		int a[][]= new int[x][y];
		System.out.print("Enter your matrix element: ");
		for(int i=0;i<x;i++) {
			for(int j=0;j<y;j++) {
				a[i][j]=sc.nextInt();
			}
		}
		int b[]=new int[x*y];
		int k=0;
		for(int i=0;i<x;i++) {
			for(int j=0;j<y;j++) {
				b[k]=a[i][j];
				k++;
			}
		}
		for(int i=0;i<b.length;i++) {
			for(int j=i+1;j<b.length;j++) {
				if(b[i]>b[j]) {
					int temp = b[i];
					b[i]=b[j];
					b[j]=temp;
				}
			}
		}
		int median1=(b.length)/2;
		System.out.println("Median of matrix is: "+b[median1]);
	}

	public static void main(String[] args) {
		
		matrixMedian md = new matrixMedian();
		md.median();
	}

}
