/*Write a program to find the frequency of elements in an ArrayList.*/
package PlacementQue.CollectionQues;

import java.util.ArrayList;

public class Q1_FrequencyOfElmtsInArraylist {
    public static void main(String[] args) {
        ArrayList<Integer> ob = new ArrayList<Integer>();
        ob.add(5);
        ob.add(6);
        ob.add(5);
        ob.add(7);
        ob.add(3);
        ob.add(5);
        ob.add(6);
        ob.add(7);
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
/****************************OUTPUT***********************************
 ArrayList: [5, 6, 5, 7, 3, 5, 6, 7]
 Number: 5 and Frequency: 3
 Number: 6 and Frequency: 2
 Number: 7 and Frequency: 2
 Number: 3 and Frequency: 1
 *********************************************************************/