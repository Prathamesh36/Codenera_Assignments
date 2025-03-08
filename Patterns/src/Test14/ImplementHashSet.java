/*
1.	Implement a custom HashSet in Java without using the existing HashSet class. Include methods for adding, removing,
 and checking the presence of elements.*/
package Test14;
class HashSet3{
    int a[] = new int[10];
    int temp=-1;
    public void add(int b){
        a[++temp]=b;
    }
    public void remove(){
        temp--;
    }
    public void Check(int b){
        for (int i = 0; i <a.length ; i++) {
            if(a[i]==b){
                System.out.print("True");
                break;
            }
            else{
                System.out.println("False");
                break;
            }
        }
    }
    public void display(){
        System.out.print("HashSet: ");
        for (int i = 0; i <=temp ; i++) {
            System.out.print(a[i]+" ");
        }
    }

}
public class ImplementHashSet {
    public static void main(String[] args) {
        HashSet3 ob = new HashSet3();
        ob.add(2);
        ob.add(3);
        ob.add(4);
        ob.add(5);
        ob.display();
        ob.remove();
        System.out.println();
        System.out.println("*****After Remove method******");
        ob.display();
        System.out.println();
        System.out.println("*****After Check method******");
        ob.Check(2);

    }
}
/***********************OUTPUT*************************
 HashSet: 2 3 4 5
 *****After Remove method******
 HashSet: 2 3 4
 *****After Check method******
 True
*******************************************************/
