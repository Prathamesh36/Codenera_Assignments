package OCT20.TejasSir2;

import java.util.Scanner;

public class findMax1inRowOfMatrix {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter number of rows: ");
        int r= sc.nextInt();
        System.out.print("Enter number of columns: ");
        int c= sc.nextInt();

        int a[][]=new int[r][c];
        System.out.println("Enter your array 1 element: ");
        for (int i=0;i<r;i++){
            for(int j=0;j< a.length;j++){
                a[i][j]= sc.nextInt();
            }
        }
        int max=0;
        int index=0;

        for(int i=0;i<a.length;i++){
            int k=0;
            for(int j=0;j<a[i].length;j++){
                if(a[i][j]==1){

                    k++;
                }
            }
            if(k>max){
                max=k;
                index=i;
            }
        }
        System.out.print("Max 1 present in: "+ index);

    }
}
