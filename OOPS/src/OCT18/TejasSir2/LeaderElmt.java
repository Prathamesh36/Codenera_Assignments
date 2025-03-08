package OCT18.TejasSir2;

import java.util.Scanner;

public class LeaderElmt {

    public int[] leader(){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter your array size: ");
        int s = sc.nextInt();
        int a[] = new int[s];
        System.out.print("Enter your array element: ");
        for (int i=0;i<s;i++){
            a[i]=sc.nextInt();
        }
        int x=0;
        int b[] = new int[5];
        int c=0;

        for(int i=0;i<a.length;i++){
            c=0;
            for(int j=i+1;j<a.length;j++){
                if(a[i]<a[j]){
                    c++;
                }
            }
            if(c==0){
                b[x]=a[i];
                x++;
            }
        }
        return b;
    }

    public static void main(String[] args) {
        LeaderElmt ob = new LeaderElmt();
        int g[] =ob.leader();
        System.out.print("Leader Element is: ");
        for (int el:g) {
            if(el!=0) {
                System.out.print(el + " ");
            }
        }
    }
}
