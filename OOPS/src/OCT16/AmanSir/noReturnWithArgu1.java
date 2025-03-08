//frequency
//most repeted
// max min
//ascending descending
//missing number
package OCT16.AmanSir;
import java.util.Scanner;
public class noReturnWithArgu1 {

    private void freq(int a[]){
        int b[] = new int[a.length];

        for(int i=0;i<a.length;i++){
            b[i]=a[i];
        }
        int c=1;
        for(int i=0;i<b.length;i++){
            c=1;
            for(int j=i+1;j<b.length;j++){
                if(b[i]==b[j]){
                    c++;
                    b[j]=-1;
                }
            }
            if(b[i]!=-1 ){
                System.out.println("number is: "+b[i]+" and count is: "+c);
            }
        }
    }

    private void mostrepeted(int a[]){
        int r[] = new int[a.length];

        for(int i=0;i<a.length;i++){
            r[i]=a[i];
        }
        int c=1;
        int max=0;
        int k=0;
        for(int i=0;i<r.length;i++){
            c=1;
            for(int j=i+1;j<r.length;j++){
                if(r[i]==r[j]){
                    c++;
                    r[j]=-1;
                }
            }
            if(c>max && r[i]!=-1){
                max = c;
                k = r[i];
            }
        }
        System.out.println("Most repeated element is: "+ k);
    }

    private void asc(int d[]){

        for(int i=0;i<d.length;i++){
            for(int j=i+1;j<d.length;j++){
                if(d[i]>d[j]){
                    int temp = d[i];
                    d[i]= d[j];
                    d[j] = temp;
                }
            }
        }
        for (int i=0;i<d.length;i++){
            System.out.print(d[i]+" ");
        }
        System.out.println();

    }

    private void desc(int c[]){

        for(int i=0;i<c.length;i++){
            for(int j=i+1;j<c.length;j++){
                if(c[i]<c[j]){
                    int temp = c[i];
                    c[i]= c[j];
                    c[j] = temp;
                }
            }
        }
        for (int i=0;i<c.length;i++){
            System.out.print(c[i]+" ");

        }
        System.out.println();
    }


    private void minmax(int f[]){
        int c=1;
        int max=0;
        int min=999;
        for(int i=0;i<f.length;i++){
            if(f[i]>max){
                max=f[i];
            }
            if(f[i]<min){
                min=f[i];
            }
        }
        System.out.println("Max element is: "+ max);
        System.out.println("Min element is: "+ min);
    }

    private void missingNumber(int g[]){
        int sum=0;
        for(int i=1;i<=g.length;i++){
            sum+=sum+i;
        }
        int arrSum=0;
        for(int i=0;i<g.length;i++){
            arrSum+=g[i];
        }
        System.out.print("Missing Number is: "+(sum-arrSum));
    }



    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter Array size: ");
        int s = sc.nextInt();;
        int a[] = new int[s];
        System.out.print("Enter your Array element: ");
        for(int i=0;i<s;i++){
            a[i]=sc.nextInt();
        }
        int choice =7;
        System.out.println("*********************");
        System.out.println("1.Frequency");
        System.out.println("2.Most Repeated");
        System.out.println("3.Min & Max");
        System.out.println("4.Ascending");
        System.out.println("5.Descending");
        System.out.println("6.Missing Number");
        System.out.println("Enter 0 to exit");
        System.out.println("*********************");
        noReturnWithArgu1 ob = new noReturnWithArgu1();
        while(choice != 0){
            System.out.println();
            System.out.print("Enter your choice: ");
            choice = sc.nextInt();
            switch (choice) {
                case 1:
                    ob.freq(a);
                    break;

                case 2:
                    ob.mostrepeted(a);
                    break;

                case 3:
                    ob.minmax(a);
                    break;

                case 4:
                    ob.asc(a);
                    break;

                case 5:
                    ob.desc(a);
                    break;

                case 6:
                    ob.missingNumber(a);
                    break;

                default:
                    System.out.println("Enter Valid input");

            }
        }
        System.out.print("Thank You !!");
    }
}
