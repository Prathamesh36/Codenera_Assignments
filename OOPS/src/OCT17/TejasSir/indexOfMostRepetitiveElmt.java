/*Q6.
WAP to find the starting index of most repeated number.

int[] s={0,0,0,0,1,1,1,1,1,1,0,1}
output: 4
*/
package OCT17.TejasSir;
import java.util.Scanner;
public class indexOfMostRepetitiveElmt {

    public void mostRepetitive(int[] a){
        int c =1;
        int max =0 ;
        int k=0;
        for(int i=0;i<a.length;i++){
            c =1;
            for(int j=i+1;j<a.length;j++){
                if(a[i]==a[j]){
                    c++;
                    a[j]=-1;
                }
            }
            if(c>max){
                max= c;
                k= i;
            }
        }
        System.out.print("First index of most repetitive element is: "+k);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter your array size: ");
        int n = sc.nextInt();
        int[] a= new int[n];
        System.out.print("Enter your array element: ");
        for(int i=0;i<n;i++){
            a[i]=sc.nextInt();
        }
        indexOfMostRepetitiveElmt ob = new indexOfMostRepetitiveElmt();
        ob.mostRepetitive(a);


    }
}
