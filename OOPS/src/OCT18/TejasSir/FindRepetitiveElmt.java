package OCT18.TejasSir;

import java.util.Scanner;

public class FindRepetitiveElmt {

    public int repetitive(){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter your array size: ");
        int s = sc.nextInt();
        int a[] = new int[s];
        System.out.print("Enter your array element: ");
        for (int i=0;i<s;i++){
            a[i]=sc.nextInt();
        }
        int u=0;
        for (int i=0;i<a.length;i++){
            for(int j=i+1;j<a.length;j++){
                if(a[i]==a[j]){
                    u=a[i];
                }
            }
        }
        return u;
    }

    public static void main(String[] args) {
        FindRepetitiveElmt ob = new FindRepetitiveElmt();
        System.out.print("Repetitive Element is: "+ob.repetitive());
    }
}
