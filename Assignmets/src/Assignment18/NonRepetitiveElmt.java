package Assignment18;

import java.util.Scanner;

public class NonRepetitiveElmt {

    int a[];
    NonRepetitiveElmt(int b[]){
        a=b;
    }

    public void Non(){
        for(int i=0;i<a.length;i++){
            int c=1;
            for(int j=i+1;j<a.length;j++){
                if(a[i]==a[j]){
                    c++;
                    a[j]=-1;
                }
            }
            if(a[i]!=-1){
                System.out.println("Non-Repetitive Element is: "+a[i]);
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
        NonRepetitiveElmt ob = new NonRepetitiveElmt(a);
        ob.Non();
    }
}
/******************************OUTPUT********************************
 Enter Array size: 7
 Enter Array element: 2 3 5 4 5 3 4
 Non-Repetitive Element is: 2
 *******************************************************************/
