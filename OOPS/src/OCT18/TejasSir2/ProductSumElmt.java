package OCT18.TejasSir2;

import java.util.Scanner;

public class ProductSumElmt {

    public int productSum(){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter your array 1 size: ");
        int s = sc.nextInt();
        int a[] = new int[s];
        System.out.print("Enter your array 1 element: ");
        for (int i=0;i<s;i++){
            a[i]=sc.nextInt();
        }
        System.out.print("Enter your array 2 size: ");
        int s1 = sc.nextInt();
        int b[] = new int[s1];
        System.out.print("Enter your array 2 element: ");
        for (int i=0;i<s1;i++){
            b[i]=sc.nextInt();
        }
        for(int i=0;i<a.length;i++){
            for (int j=i+1;j<a.length;j++){
                if(a[i]>a[j]){
                    int temp = a[i];
                    a[i]=a[j];
                    a[j]= temp;
                }
            }
        }
        int sum=0;
        for(int i=0;i<a.length;i++){
            sum+=a[i]*b[i];
        }
        return sum;
    }

    public static void main(String[] args) {
        ProductSumElmt ob = new ProductSumElmt();
        System.out.print("Output : "+ob.productSum());
    }
}
