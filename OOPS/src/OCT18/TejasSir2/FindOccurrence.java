package OCT18.TejasSir2;

import java.util.Scanner;

public class FindOccurrence {

    public int occurrence(){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter your array size: ");
        int s = sc.nextInt();
        int a[] = new int[s];
        int u=0;
        System.out.print("Enter your array element: ");
        for (int i=0;i<s;i++){
            a[i]=sc.nextInt();
        }
        System.out.print("Enter number : ");
        int r = sc.nextInt();
        int c=1;
        for(int i=0;i<a.length;i++){
            c=1;
            for(int j=i+1;j<a.length;j++){
                if(a[i]==a[j]){
                    c++;
                    a[j]=-1;
                }
            }
            if(c==r && a[i]!=-1){
                u=a[i];
                break;
            }
        }
        return u;
    }

    public static void main(String[] args) {
        FindOccurrence ob = new FindOccurrence();
        System.out.print("OUTPUT: "+ob.occurrence());
    }
}
