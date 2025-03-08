package NOV28.AmanSir.StudentInfo;

import java.util.ArrayList;

public class ArrayListQue {
    public static void main(String[] args) {
        ArrayList<Integer> ob = new ArrayList<Integer>();
        ob.add(2);
        ob.add(4);
        ob.add(7);
        ob.add(3);
        ob.add(2);
        ob.add(9);
        ob.add(4);
        ob.add(2);
        ob.add(7);
        ob.add(2);
        System.out.println("Array List: "+ob);

        Object a[] = ob.toArray();
        Object b[] = ob.toArray();
        Object z[] = ob.toArray();
        Object max = a[0];
        for (int i = 0; i < a.length; i++) {
            if((Integer)a[i]>(Integer)max){
                max=a[i];
            }
        }
        System.out.println("Max number: "+max);
        Object min = a[0];
        for (int i = 0; i < a.length; i++) {
            if((Integer)a[i]<(Integer)min){
                min=a[i];
            }
        }
        System.out.println("Min number: "+min);

        int c=1;
        int max1=0;
        int g=0;
        int g1=0;
        int min1 =Integer.MAX_VALUE;
        for (int i = 0; i < a.length; i++) {
            c=1;
            for (int j = i+1; j < a.length; j++) {
                if(a[i]==a[j]){
                    c++;
                    a[j]=-1;
                }
            }
            if(c>max1 && (Integer)a[i]!=-1){
                max1=c;
                g = (Integer)a[i];
            }
            if(c<min1 && (Integer)a[i]!=-1){
                min1=c;
                g1 = (Integer)a[i];
            }

            if((Integer)a[i]!=-1){
                System.out.println("Number: "+a[i]+" Frequency is: "+ c);
            }
        }
        System.out.println("Most Repeated number is: "+g);
        System.out.println("Least Repeated number is: "+g1);


        for (int i = 0; i < b.length; i++) {
            for (int j = i + 1; j < b.length; j++) {
                if ((Integer)b[i]>(Integer)b[j]) {
                    Integer temp = (Integer)b[i];
                    b[i]=b[j];
                    b[j]=temp;
                }
            }
        }
        System.out.print("Ascending sort: ");
        for (int i = 0; i < b.length; i++) {
            System.out.print(b[i]+" ");
        }
        System.out.println();
        System.out.print("Descending sort: ");
        for (int i = b.length-1; i>=0; i--) {
            System.out.print(b[i]+" ");
        }

      /*  System.out.println();
        for (int i = 0; i < z.length; i++) {
            for (int j = i + 1; j < z.length; j++) {
                if ((Integer)z[i]<(Integer)z[j]) {
                    Integer temp = (Integer)z[i];
                    z[i]=z[j];
                    z[j]=temp;
                }
            }
        }
        System.out.print("Descending sort: ");
        for (int i = 0; i < z.length; i++) {
            System.out.print(z[i]=" ");
        }*/


    }
}
