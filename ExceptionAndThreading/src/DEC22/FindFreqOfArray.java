package DEC22;

import java.util.Scanner;

class input extends Thread{

    public void run(){

        Scanner sc= new Scanner(System.in);
        System.out.print("Enter Array size: ");
        int n = sc.nextInt();
        FindFreqOfArray.a=new int[n];
        System.out.print("Enter Array Elements: ");
        for (int i = 0; i < n; i++) {
            FindFreqOfArray.a[i]= sc.nextInt();
        }
    }
}
class freq extends Thread{

    public void run(){
        int c=1;
        int x =0;

        for (int i = 0; i <FindFreqOfArray.a.length ; i++) {
            c=1;
            for (int j = i+1; j < FindFreqOfArray.a.length; j++) {
                if(FindFreqOfArray.a[i]==FindFreqOfArray.a[j]){
                    c++;
                    FindFreqOfArray.a[j]=-1;
                }
            }
            if(FindFreqOfArray.a[i]!=-1){
                FindFreqOfArray.c[x]=FindFreqOfArray.a[i];
                FindFreqOfArray.b[x]=c;
               x++;
            }
        }
        System.out.println();
    }
}
class count extends Thread{
    public void run(){
        for (int i = 0; i <FindFreqOfArray.b.length ; i++) {

            for (int j = 0; j < FindFreqOfArray.b.length; j++) {
                if(FindFreqOfArray.b[i]>FindFreqOfArray.max){
                    FindFreqOfArray.max=FindFreqOfArray.b[i];
                }
            }
        }
    }
}

public class FindFreqOfArray {
    static int a[];
    static int b[];
    static int c[];
    static int max =0;
    public static void main(String[] args) {
        input ob1= new input();
        freq ob2 = new freq();
        count ob3 = new count();

        try{
            ob1.start();
            ob1.join();
            ob2.start();
            ob2.join();
            ob3.start();
            ob3.join();
        }
        catch(Exception e){
            System.out.print(e);
        }
        input ip = new input();
        System.out.println("Number"+"\t"+"Frequency");
        for (int i = 0; i < a.length-1; i++) {
            if(b[i]!=-1) {
                System.out.println(c[i]+"\t\t"+b[i]);
            }
        }
        System.out.println();
        System.out.print("Most repeated Element: "+max);

    }
}
