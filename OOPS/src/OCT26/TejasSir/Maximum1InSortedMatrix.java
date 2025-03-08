/*14.Given a boolean 2D array, where each row is sorted. Find the row with the maximum number of 1s.
   Example:
  Input matrix : 0 1 1 1
                 0 0 1 1
                 1 1 1 1  // this row has maximum 1s
                 0 0 0 0
*/
package OCT26.TejasSir;

import java.util.Scanner;

class findMaxRepeated{
    int a[][];
    findMaxRepeated(int a[][]){
        this.a=a;
    }
    public void Find(){
        int count=0;
        int max=0;
        int t=0;
        for (int i = 0; i < a.length; i++) {
            count=0;
            for (int j = 0; j < a[i].length; j++) {
                if(a[i][j]==1){
                    count++;
                }
            }
            if(count>max){
                max=count;
                t=i+1;
            }
        }
        System.out.print("Most 1 present in Row Number : "+(t));
    }
}

public class Maximum1InSortedMatrix {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter matrix row size: ");
        int r = sc.nextInt();
        System.out.print("Enter matrix column size: ");
        int c = sc.nextInt();
        int a[][] =  new int[r][c];
        System.out.println("Enter Matrix elements: ");
        for (int i = 0; i < r; i++) {
            for (int j = 0; j < c; j++) {
                a[i][j]=sc.nextInt();
            }
        }

        findMaxRepeated ob= new findMaxRepeated(a);
        ob.Find();
    }

}
