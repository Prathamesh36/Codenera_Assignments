package OCT18.AmanSir;

import java.util.Scanner;

public class findDuplicates {

    int s;
    int[] a;
    findDuplicates(){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter Array size: ");
        s= sc.nextInt();
        a = new int[s];
        System.out.print("Enter Array element: ");
        for(int i=0;i<s;i++){
            a[i]=sc.nextInt();
        }
    }

    public int duplicate(){
        int c=1;
        int max=0;
        int k=0;
        for (int i =0 ;i<a.length;i++){
            c=1;
            for(int j=i+1;j<a.length;j++) {
                if(a[i]==a[j]){
                    c++;
                    a[j]=-1;
                }
            }
            if(a[i]!=-1 && c>1){

                k = a[i];
            }
        }
        return k;
    }

    public static void main(String[] args) {
        findDuplicates ob =new findDuplicates();
        System.out.print("Duplicate element is: "+ob.duplicate());
    }
}
