/*Write a Java program to replace each element of the array with product of every other element in a given array of integers.

Example:
Input :
nums1 = { 1, 2, 3, 4, 5, 6, 7}

Output:
Array with product of every other element:
[5040, 2520, 1680, 1260,1008,840,720*/
package OCT16.TejasSir;

public class replaceArrayWithProduct {

    public void replace(){
        int a[] = { 1, 2, 3, 4, 5, 6, 7};
        int b[] = new int[a.length];
        int product=1;
        for(int i=0;i<a.length;i++){
            product= product*a[i];
        }
        int pro =1;
        for(int i=0;i<a.length;i++){
            pro= product/a[i];
            b[i]=pro;
        }
        for (int g:b) {
            System.out.print(g+ " ");
        }
    }

    public static void main(String[] args) {
        replaceArrayWithProduct ob = new replaceArrayWithProduct();
        ob.replace();
    }
}
