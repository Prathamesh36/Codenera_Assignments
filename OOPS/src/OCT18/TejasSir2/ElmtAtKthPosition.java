package OCT18.TejasSir2;

import java.util.Scanner;

public class ElmtAtKthPosition {

    public int position(){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter your array 1 size: ");
        int s = sc.nextInt();
        int a[] = new int[s];
        System.out.print("Enter your array 1 element: ");
        for (int i=0;i<s;i++){
            a[i]=sc.nextInt();
        }
        System.out.print("Enter your array 2 size: ");
        int s1 = sc.nextInt();
        int b[] = new int[s1];
        System.out.print("Enter your array 2 element: ");
        for (int i=0;i<s1;i++){
            b[i]=sc.nextInt();
        }
        System.out.print("Enter position number: ");
        int u=sc.nextInt();
        int c[] = new int[a.length+b.length];
        for(int i=0;i<a.length;i++){
            c[i]=a[i];
        }
        for(int i=0;i<b.length;i++){
            c[i+a.length]=b[i];
        }
        for(int i=0;i<c.length;i++){
            for (int j=i+1;j<c.length;j++){
                if(c[i]>c[j]){
                    int temp = c[i];
                    c[i]=c[j];
                    c[j]= temp;
                }
            }
        }
        int y =0;
        for(int i=0;i<c.length;i++){
            if(i==u){
                y=c[i-1];
            }
        }
        return y;
    }

    public static void main(String[] args) {
        ElmtAtKthPosition ob = new ElmtAtKthPosition();
        System.out.print("Element Found at given position is: "+ob.position());
    }
}
