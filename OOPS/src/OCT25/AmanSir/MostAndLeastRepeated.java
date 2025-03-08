package OCT25.AmanSir;

import java.util.Scanner;

class Parent2{
    int a[];
    Parent2(int a[]){
        this.a=a;
    }

}
public class MostAndLeastRepeated extends Parent2 {
    int[] b;
    int[] c;
    MostAndLeastRepeated(int a[]){
        super(a);
        this.b=a;
        this.c=a;
    }
    public void maxrepeated(){
        int k=0;
        int max=0;
        int h=0;
        for(int i=0;i<a.length;i++){
            for(int j=i+1;j<a.length;j++){
                if(a[i]==a[j]){
                    k++;
                    a[j]=-1;
                }
            }
            if(a[i]!=-1 && k>max){
                max=k;
                h=a[i];
            }
        }
        System.out.print("Max Repeated Element is: "+h);

    }
    public void leastrepeated(){
        int k=0;
        int least=0;
        int h=0;
        for(int i=0;i<a.length;i++){
            for(int j=i+1;j<a.length;j++){
                if(a[i]==a[j]){
                    k++;
                    a[j]=-1;
                }
            }
            if(a[i]!=-1 && k==1){
                least=a[i];
                break;
            }
        }
        System.out.print("\nLeast Repeated Element is: "+least);
    }
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        System.out.print("Enter Array size: ");
        int s = sc.nextInt();
        int a[] = new int[s];
        System.out.print("Enter Array Element: ");
        for (int i = 0; i < s; i++) {
            a[i]=sc.nextInt();
        }
        MostAndLeastRepeated ob = new MostAndLeastRepeated(a);
        ob.maxrepeated();
        ob.leastrepeated();
    }
}
