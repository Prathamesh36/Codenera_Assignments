package OCT19.TejasSir2;

import java.util.Scanner;

public class FirstNonRepetitiveElmt {

    public void nonrepetative(int[] a){
        for(int i=0;i<a.length;i++){
            int c=1;
            for(int j=i+1;j<a.length;j++){
                if(a[i]==a[j]){
                    c++;
                    a[j]=-1;
                }
            }
            if(a[i]!=-1 && c==1){
                System.out.println("First Non-Repetitive Element is: "+a[i]);
                break;
            }
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter Array size: ");
        int s= sc.nextInt();
        int []a = new int[s];
        System.out.print("Enter Array element: ");
        for(int i=0;i<s;i++){
            a[i]=sc.nextInt();
        }
        FirstNonRepetitiveElmt ob = new FirstNonRepetitiveElmt();
        ob.nonrepetative(a);
    }
}
