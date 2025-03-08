/*arr1[]={1,2,3,4,5}
arr2[]={10,11,12,13,14}

output: {1,14,2,13,3,12,4,11,5,10}*/
package Test0;

public class Que1 {
    public static void main(String[] args) {
        int a[] ={1,2,3,4,5};
        int b[] ={10,11,12,13,14};

        int c[] = new int[a.length+b.length];
        int x=0;
        int k=0;
        for(int i=0;i<a.length;i++){
            c[x]=a[i];
            x++;
            k++;
            c[x]=b[b.length-k];
            x++;

        }
        for(int i=0;i<c.length;i++){
            System.out.print(c[i]+" ");
        }
    }
}
