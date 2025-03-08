/*10. Write a Java program to find the average of a list of integers using lamda expression .*/
package Test11;

import java.util.ArrayList;

interface average{
    public double avg();
}


public class FindAvgOfListOfIntUsingLambda {
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
        System.out.println("List of Integers: "+ob);
        average ob2=()->{
            int sum=0;
            int total=ob.size();
            Object[] ob1 = ob.toArray();
            for (int i = 0; i < ob1.length; i++) {
                sum+=(int)ob1[i];
            }
            return (double) (sum/total);
        };
        System.out.println("average: "+ob2.avg());
    }
}
/****************************OUTPUT***********************************
 average: 5.0
 *********************************************************************/