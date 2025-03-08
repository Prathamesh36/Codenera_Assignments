/*7.	Create a list of strings and use lambda expressions to filter and
print only the strings starting with the letter 'A'.*/
package Test14;

import java.util.ArrayList;

interface Demo
{
    ArrayList<String> disp();

}

public class FilterStringUsingLambda {
    public static void main(String[] args) {
        ArrayList<String> ob = new ArrayList<String>();
        ob.add("Aman");
        ob.add("Siddhant");
        ob.add("Amir");
        ArrayList<String> ob1 = new ArrayList<String>();
        Demo ob2=()->{
            for (int i = ob.size()-1; i >=0 ; i--) {
                String a =ob.get(i);
                if(a.charAt(0)=='A'||a.charAt(0)=='a'){
                    ob1.add(a);
                }
            }
            return ob1;
        };
        System.out.println("String Starting with A is : "+ob2.disp());
    }
}
/***********************OUTPUT*************************
 String Starting with A is : [Amir, Aman]
 *******************************************************/