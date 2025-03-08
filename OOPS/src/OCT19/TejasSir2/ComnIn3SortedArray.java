package OCT19.TejasSir2;

import java.util.Scanner;

public class ComnIn3SortedArray {

    public void findCommon(int a[],int b[],int c[]){
        System.out.print("Repetitive Elements are: ");
        int k=0;
        for(int i=0;i<a.length;i++){
            k=0;
            for(int j=0;j<b.length;j++){
                for(int z=0;z<c.length;z++){
                    if(a[i]==b[j] && a[i]==c[z]){
                        k++;
                    }
                }
            }
            if(k>0){
                System.out.print(a[i]+" " );
            }

        }

    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter Array 1 size: ");
        int s= sc.nextInt();
        int []a = new int[s];
        System.out.print("Enter Array 1 element: ");
        for(int i=0;i<s;i++){
            a[i]=sc.nextInt();
        }
        System.out.print("Enter Array 2 size: ");
        int s1= sc.nextInt();
        int []b = new int[s];
        System.out.print("Enter Array 2 element: ");
        for(int i=0;i<s1;i++){
            b[i]=sc.nextInt();
        }
        System.out.print("Enter Array 3 size: ");
        int s2= sc.nextInt();
        int []c = new int[s2];
        System.out.print("Enter Array 3 element: ");
        for(int i=0;i<s2;i++){
            c[i]=sc.nextInt();
        }
        ComnIn3SortedArray ob = new ComnIn3SortedArray();
        ob.findCommon(a,b,c);
    }
}
