/*WAP to find the second highest element in array using collection*/
package JAN30;

import java.util.ArrayList;

public class FindSecondHighestElmtInArrayUsingCollection {
    public static void main(String[] args) {
        int[] a = {4,5,6,8,2,1,3,9};
        ArrayList<Integer> ob = new ArrayList<>();
        for (int el: a){
            ob.add(el);
        }
        int max=0;
        int smax=0;
        for(int i=0;i<ob.size();i++){
            if(ob.get(i)>max){
                smax=max;
                max=ob.get(i);
            }
            else if(ob.get(i)>smax && ob.get(i)<max){
                smax=ob.get(i);
            }
        }
        System.out.println("Second Highest element: "+smax);
    }
}
