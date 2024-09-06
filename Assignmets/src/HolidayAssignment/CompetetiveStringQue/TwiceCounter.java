/*Q11. Twice Counter
Input:
N = 3
list = {Geeks, For, Geeks}
Output: 1
Explanation: 'Geeks' is the only word that
appears twice.*/
package HolidayAssignment.CompetetiveStringQue;

import java.util.Scanner;

class Counterr{
    public int StringCounter(String a){
        String[] s =a.split(" ");
        int c=1;
        for (int i = 0; i < s.length; i++) {
            c=1;
            for (int j = i+1; j <s.length ; j++) {
                if(s[i].equals(s[j])){
                    c++;
                    s[j]=" ";
                }
            }
            if(c==2 && !s[i].equals(" ")){
                return c;
            }
        }
        return 0;

    }
}

public class TwiceCounter {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter Your String: ");
        String str = sc.nextLine();
        Counterr ob = new Counterr();
        System.out.print("OUTPUT: ");
        System.out.print(ob.StringCounter(str));
    }
}
/***********************OUTPUT************************
 Enter Your String: Geeks for Geeks
 OUTPUT: 2
 ****************************************************/