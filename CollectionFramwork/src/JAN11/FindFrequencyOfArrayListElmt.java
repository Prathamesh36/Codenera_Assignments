/*Write a program to find the frequency of elements in an ArrayList.*/
package JAN11;

import java.util.ArrayList;

public class FindFrequencyOfArrayListElmt {
    public static void main(String[] args) {
        ArrayList<Integer> ob = new ArrayList<>();
        ob.add(4);
        ob.add(5);
        ob.add(6);
        ob.add(4);
        ob.add(5);
        ob.add(5);
        System.out.println("ArrayList: "+ob);
        Object[] ob1 = ob.toArray();
        for (int i = 0; i < ob1.length; i++) {
            int c=1;
            for (int j = i+1; j < ob1.length ; j++) {
                if (ob1[i]==ob1[j]) {
                    c++;
                    ob1[j]=-1;
                }
            }
            if((int)ob1[i]!=-1){
                System.out.println("Number: "+ob1[i]+" and Frequency: "+c);
            }
        }
    }
}
