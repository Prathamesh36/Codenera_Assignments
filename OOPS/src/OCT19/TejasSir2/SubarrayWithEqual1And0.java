package OCT19.TejasSir2;

import java.util.Scanner;

public class SubarrayWithEqual1And0 {

    public void subArray(int a[], int num ){
            for(int i=0;i<a.length;i++){
                for(int j=i+1;j<a.length;j++){
                    if(a[i]+a[j]==1 || a[i]+a[j]==0){
                        System.out.print("("+a[i]+","+a[j]+") ");
                    }
                    else if(a[i]*a[j]==1 || a[i]*a[j]==0){
                        System.out.print("("+a[i]+","+a[j]+") ");
                    }
                    else if(a[i]/a[j]==1 || a[i]/a[j]==0){
                        System.out.print("("+a[i]+","+a[j]+") ");
                    }
                    else if(a[i]==1 && a[j]==0 || a[i]==0 && a[j]==1){
                        System.out.print("("+a[i]+","+a[j]+") ");
                    }
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
        System.out.print("Enter your Number: ");
        int num= sc.nextInt();
        SubarrayWithEqual1And0 ob = new SubarrayWithEqual1And0();
        ob.subArray(a,num);
    }
}
