/*Q1.Wap to input an array and find
  no of 0s.
  no of positive no.
  no of negative no.
using inheritence.*/
package Assignment19;

import java.util.Scanner;

class number{
    int a[];
    number(int a[]){
        this.a=a;
    }
    public void No(){
        int c=0,c1=0,c2=0;
        for(int i=0;i<a.length;i++){
            if(a[i]==0){
                c++;
            }
            else if(a[i]>0){
                c1++;
            }
            else {
                c2++;
            }
        }
        System.out.println("Number of 0's: "+c);
        System.out.println("Number of +'s: "+c1);
        System.out.println("Number of -'s: "+c2);
    }

}

public class Find0PosiAndNega{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter Array size: ");
        int s = sc.nextInt();
        System.out.print("Enter array elemets: ");
        int a[]= new int[s];
        for (int i = 0; i < s; i++) {
            a[i]=sc.nextInt();
        }
        number ob = new number(a);
        ob.No();
    }
}
/*********************OUTPUT************************
 Enter Array size: 9
 Enter array elemets: 2 4 -3 0 -8 1 -9 9 0 -1
 Number of 0's: 2
 Number of +'s: 4
 Number of -'s: 3
 ****************************************************/