/*8. Write a program that finds the most repeated elements in arraylist using lamda expression.*/
package Test11;

import java.util.ArrayList;

interface mostRepeated{
    public int most();
}

public class MostRepeatedElmtInArrayListUsingLambda {
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
        mostRepeated ob2=()->{
            int max=0;
            int repe=0;
            Object[] ob1 = ob.toArray();
            for (int i = 0; i < ob1.length; i++) {
                int c=1;
                for (int j = i+1; j < ob1.length ; j++) {
                    if (ob1[i]==ob1[j]) {
                        c++;
                        ob1[j]=-1;
                    }
                }
                if((int)ob1[i]!=-1 && c>max){
                    max=c;
                    repe=(int)ob1[i];
                }
            }
            return repe;
        };
        System.out.println("Most Repeated Element: "+ob2.most());
    }
}
/****************************OUTPUT***********************************
 Most Repeated Element: 5
 *********************************************************************/
