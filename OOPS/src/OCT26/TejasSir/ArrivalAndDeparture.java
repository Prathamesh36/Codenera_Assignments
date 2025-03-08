/*9.Given the arrival and departure times of all trains that reach a railway station, the task is to find the minimum number
  of platforms required for the railway station so that no train waits. We are given two arrays that represent the arrival and departure times of trains that stop.
  Examples:
 Input: arr[] = {9:00, 9:40, 9:50, 11:00, 15:00, 18:00}, dep[] = {9:10, 12:00, 11:20, 11:30, 19:00, 20:00}
 Output: 3
*/
package OCT26.TejasSir;

import java.util.Scanner;

class Arrival{
    int a[];
    int b[];
    Arrival(int a[],int b[]){
        this.a=a;
        this.b=b;
    }

    public void platforms(){
        int r=1;

        for(int i=0;i<a.length;i++){
            int c=1;
            for(int j=0;j<b.length;j++){
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

public class ArrivalAndDeparture {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter Array size: ");
        int s = sc.nextInt();
        int a[] =  new int[s];
        System.out.print("Enter Arrival time: ");
        for (int i = 0; i < s; i++) {
            a[i]=sc.nextInt();
        }
        System.out.print("Enter Array size: ");
        int s1 = sc.nextInt();
        int b[] =  new int[s];
        System.out.print("Enter Departure time: ");
        for (int i = 0; i < s1; i++) {
            b[i]=sc.nextInt();
        }

        Arrival ob = new Arrival(a,b);
        ob.platforms();
    }
}
