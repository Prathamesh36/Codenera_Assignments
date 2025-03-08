/*Write a function to find the shortest distance between two words in a string.*/
package PlacementQue.StringQues;

import java.util.Arrays;
import java.util.Scanner;

public class Q16_ShortestDistanceBtwnTwoWords {

    public static int sortestDistance(String x, String y,String[] a){
        int flag1=0;
        int flag2=0;
        for (int i = 0; i < a.length; i++) {
            if(a[i].equals(x)){
                flag1=i;
            }
            if(a[i].equals(y)){
                flag2=i;
            }
        }
        return(flag2-flag1);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String[] a ={"the", "quick", "brown", "fox", "quick"};
        System.out.println( Arrays.asList(a));
        System.out.print("Enter first word: ");
        String x = sc.nextLine();
        System.out.print("Enter second word: ");
        String y = sc.nextLine();
        System.out.println("Shortest distance between words: "+sortestDistance(x,y,a));

    }
}
/*******************************OUTPUT********************************
 [the, quick, brown, fox, quick]
 Enter first word: the
 Enter second word: fox
 Shortest distance between words: 3
 **********************************************************************/