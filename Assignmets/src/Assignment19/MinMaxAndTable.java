/*Q10. Wap create two class take input of array in  and find max and min no in parents class now, in child class print table of both no.*/
package Assignment19;

import java.util.Scanner;

class MinnMaxx{
    int a[];
    MinnMaxx(int[] a){
        this.a=a;
    }
    public int max(){
        int max =0;

        for(int i=0;i<a.length;i++){
            if(a[i]>max){
                max= a[i];
            }

        }
        System.out.println("Max element is: "+max);
        return max;
    }
    public int min(){
        int min=9999;
        for(int i=0;i<a.length;i++){

            if(a[i]<min){
                min=a[i];
            }
        }System.out.println("Min element is: "+min);
        return min;
    }
}

public class MinMaxAndTable extends MinnMaxx {
    MinMaxAndTable(int a[]){
        super(a);
    }
    public void table(){
        int max=super.max();
        int min=super.min();
        System.out.println("Table of Max and Min element");
        for(int i=1;i<=10;i++){
            System.out.println("\t\t"+max*i+"\t\t"+min*i);
        }
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
        MinMaxAndTable ob= new MinMaxAndTable(a);
        ob.table();
    }
}
/*********************OUTPUT************************
 Enter Array size: 6
 Enter Array Element: 2 4 9 7 3 5
 Max element is: 9
 Min element is: 2
 Table of Max and Min element
 9		2
 18		4
 27		6
 36		8
 45		10
 54		12
 63		14
 72		16
 81		18
 90		20
 ****************************************************/