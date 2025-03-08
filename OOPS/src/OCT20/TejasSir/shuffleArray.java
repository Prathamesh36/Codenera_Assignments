package OCT20.TejasSir;

import java.util.Scanner;
import java.util.Random;
public class shuffleArray {

    public int[] shuffle(int a[]){
        Random rn = new Random();
        int j;
        for(int i=0;i<a.length;i++){
            j= rn .nextInt(i+1);
            int temp= a[i];
            a[i]=a[j];
            a[j]=temp;

        }
        return a;
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
        shuffleArray ob = new shuffleArray();
        int g[] = ob.shuffle(a);
        System.out.print("Shuffled Array is: ");
        for (int el : g) {
            System.out.print(el+" ");
        }
    }
}
