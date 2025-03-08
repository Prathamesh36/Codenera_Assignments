/*6.Find the occurrence of an integer in the array*/
package OCT19.TejasSir1;

import java.util.Scanner;

public class FindOccurrence {

    int s;
    int[] a;
    FindOccurrence(){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter Array size: ");
        s= sc.nextInt();
        a = new int[s];
        System.out.print("Enter Array element: ");
        for(int i=0;i<s;i++){
            a[i]=sc.nextInt();
        }
    }

    public void occurrence(){
        int c=1;
        for(int i=0;i<a.length;i++){
            c=1;
            for(int j=i+1;j<a.length;j++){
                if(a[i]==a[j]){
                    c++;
                    a[j]=-1;
                }
            }
            if(a[i]!=-1){
                System.out.println(a[i]+" occurs "+c+" times");
            }
        }
    }

    public static void main(String[] args) {
        FindOccurrence ob = new FindOccurrence();
        ob.occurrence();
    }
}
