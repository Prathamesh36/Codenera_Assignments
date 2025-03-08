/*1.Find a peak element which is not smaller than its neighbors*/
package OCT19.TejasSir1;

import java.util.Scanner;

public class findPeakElmt {

    int s;
    int[] a;
    findPeakElmt(){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter Array size: ");
        s= sc.nextInt();
        a = new int[s];
        System.out.print("Enter Array element: ");
        for(int i=0;i<s;i++){
            a[i]=sc.nextInt();
        }
    }
    public void peak(){
        System.out.print("Peak Elements: ");
        for(int i=1;i<a.length-1;i++){
            if(a[i]>a[i-1]&&a[i]>a[i+1]){
                System.out.print(a[i]+" ");
            }
        }
    }

    public static void main(String[] args) {
        findPeakElmt ob = new findPeakElmt();
        ob.peak();
    }
}
