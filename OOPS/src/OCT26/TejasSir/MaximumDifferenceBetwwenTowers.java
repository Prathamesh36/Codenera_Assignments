/*10.Given the heights of N towers and a value of K, Either increase or decrease the height of every tower by K (only once) where K > 0.
   After modifications, the task is to minimize the difference between the heights of the longest and the shortest tower and output its
   difference.
   Examples:
   Input: arr[] = {1, 15, 10}, k = 6
   Output:  Maximum difference is 5.
   Explanation: Change 1 to 7, 15 to 9 and 10 to 4. Maximum difference is 5 (between 4 and 9). We can’t get a lower difference.
*/
package OCT26.TejasSir;

import java.util.Scanner;

class Tower{
    int a[];
    int k;
    Tower(int a[],int k){
        this.a=a;
        this.k=k;
    }

    public void Difference(){
        for(int i=0;i<a.length;i++){
            for(int j=i+1;j<a.length;j++){
                if(a[i]>a[j]){
                    int temp = a[i];
                    a[i]=a[j];
                    a[j]=temp;
                }
            }
        }

        for (int i = 0; i < a.length; i++) {
            if(a[i]>k){
                a[i]-=k;
            }
            else if(a[i]<=k){
                a[i]+=k;
            }
        }
        int min=9999;
        int max=a[0];
        for (int i = 0; i < a.length; i++) {
            if(a[i]>max){
                max=a[i];
            }
            if(a[i]<min){
                min=a[i];
            }
        }
        System.out.print("Maximum Difference is: "+(max-min));

    }
}

public class MaximumDifferenceBetwwenTowers {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter Array size: ");
        int s = sc.nextInt();
        int a[] =  new int[s];
        System.out.print("Enter Tower height: ");
        for (int i = 0; i < s; i++) {
            a[i]=sc.nextInt();
        }
        System.out.print("Enter Value of k: ");
        int k=sc.nextInt();
        Tower ob= new Tower(a,k);
        ob.Difference();
    }
}
