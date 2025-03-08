package OCT23.TejasSir;

import java.util.Scanner;

public class PlatformsForTrains {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter your array size: ");
        int s = sc.nextInt();
        int a[] = new int[s];

        System.out.print("Enter your array element: ");
        for (int i=0;i<s;i++){
            a[i]=sc.nextInt();
        }
        System.out.print("Enter your array size: ");
        int s1 = sc.nextInt();
        int b[] = new int[s1];

        System.out.print("Enter your array element: ");
        for (int i=0;i<s1;i++){
            b[i]=sc.nextInt();
        }
        int r=1;

        for(int i=0;i<a.length;i++){
            int c=1;
            for(int j=0;j<a.length;j++){
                if(i!=j){
                    if(a[i]>a[j] && b[j]>=a[i]){
                        c++;
                    }
                }
            }
            if(c>r){
                r=c;
            }
        }
        System.out.print("Platform Needed is: "+r);
    }
}
/*Enter your array size: 6
Enter your array element: 900 940 950 100 1500 1800
Enter your array size: 6
Enter your array element: 910 1200 1120 1130 1900 2000*/