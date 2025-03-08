package OCT18.TejasSir2;

import java.util.Scanner;

public class EquilibriumPoint {

    public int eqi(){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter your array size: ");
        int s = sc.nextInt();
        int a[] = new int[s];
        System.out.print("Enter your array element: ");
        for (int i=0;i<s;i++){
            a[i]=sc.nextInt();
        }
        int k=0;
        int leftSum=0;
        int rightSum=0;
        for(int i=0;i<a.length;i++){
            leftSum=0;
            for (int j=0;j<i;j++){
                leftSum+=a[j];
            }
            rightSum=0;
            for (int j=i+1;j<a.length;j++){
                rightSum+=a[j];
            }
            if(leftSum==rightSum){
                k=i+1;
            }

        }
        return k;
    }

    public static void main(String[] args) {
        EquilibriumPoint ob = new EquilibriumPoint();
        System.out.print("Equilibrium Point is :"+ob.eqi());
    }
}
