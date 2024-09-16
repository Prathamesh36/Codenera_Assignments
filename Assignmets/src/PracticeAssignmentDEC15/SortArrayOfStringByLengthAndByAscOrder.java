/*4)From given array of string first sort the elemnts by length and then by ascending order.
input->  ROME,PARIS,NAIROBI,NEW DEKHI,Alexandria,ABUJA,IBADAN,DURBAN*/
package PracticeAssignmentDEC15;

import java.util.Arrays;
import java.util.Comparator;


public class SortArrayOfStringByLengthAndByAscOrder {
    public static void main(String[] args) {
        String[] a = {"ROME","PARIS","NAIROBI","NEW DEKHI","Alexandria","ABUJA","IBADAN","DURBAN"};
        for (int i = 0; i < a.length; i++) {
            for (int j = i+1; j <a.length ; j++) {
                if(a[i].length()>a[j].length()){
                    String temp = a[i];
                    a[i]=a[j];
                    a[j]=temp;
                }
            }
        }
        System.out.println("Sorted array by length: "+ Arrays.asList(a));
        Arrays.sort(a);
        System.out.println("Ascending Array sort: "+Arrays.asList(a));



    }
}