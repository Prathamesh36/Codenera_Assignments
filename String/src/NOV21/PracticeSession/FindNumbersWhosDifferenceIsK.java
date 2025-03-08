package NOV21.PracticeSession;

import java.util.Scanner;

public class FindNumbersWhosDifferenceIsK {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter your array size: ");
        int n = sc.nextInt();
        int a[] = new int[n];
        System.out.print("Enter your array element: ");
        for(int i=0;i< a.length;i++){
            a[i]=sc.nextInt();
        }
        System.out.print("Enter your number: ");
        int k= sc.nextInt();
        int h=0;
        for(int i=0;i<a.length;i++){
            for(int j=i+1;j<a.length;j++){
                if(a[i]-a[j]==k || a[i]-a[j]==-k && h==0){
                    System.out.println(a[i]+","+a[j]);
                    h++;
                }
            }
        }
    }
}
