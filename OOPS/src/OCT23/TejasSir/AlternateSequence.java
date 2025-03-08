package OCT23.TejasSir;

import java.util.Scanner;

public class AlternateSequence {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter your array size: ");
        int s = sc.nextInt();
        int a[] = new int[s];
        int c=1;
        int x=1;
        int  y=1;
        System.out.print("Enter your array element: ");
        for (int i=0;i<s;i++){
            a[i]=sc.nextInt();
        }
        for (int i=1;i<a.length;i++){
            if(a[i]>a[i-1]){
                x = y+1;
            }
            else if(a[i]<a[i-1]){
                y=x+1;
            }
        }
        System.out.print("OUTPUT: ");
        if(x>y){
            System.out.print(x);
        }
        else{
            System.out.print(y);
        }



    }
}
