package OCT25.AmanSir;

import java.util.Scanner;

class Parent1{
    int a[];
    Parent1(int a[]){
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
public class MaxMin extends Parent1 {

    MaxMin(int a[]){
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
        MaxMin ob = new MaxMin(a);
        ob.table();
    }
}
