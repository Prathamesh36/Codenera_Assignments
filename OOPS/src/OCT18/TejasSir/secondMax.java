package OCT18.TejasSir;

import java.util.Scanner;

public class secondMax {

    public int max(){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter your array size: ");
        int s = sc.nextInt();
        int a[] = new int[s];
        System.out.print("Enter your array element: ");
        for (int i=0;i<s;i++){
            a[i]=sc.nextInt();
        }
        int max =0;
        int smax=-1;
        for(int i=0;i<a.length;i++){
            if(a[i]>max){
                smax=max;
                max=a[i];
            }
            else if(a[i]>smax && a[i]<max){
                smax=a[i];
            }

        }
        return smax;
    }

    public static void main(String[] args) {
        secondMax ob = new secondMax();

        System.out.print("Second max element is: "+ob.max());
    }
}
