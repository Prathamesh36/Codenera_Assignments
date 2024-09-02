/*4. Count distinct prime triplets up to N such that sum of two primes is equal to the third prime

Input: N = 6
Output: 1
Explanation: Among numbers in the range [1, 6], the only prime triplet is (2, 3, 5) (Since 2 + 3 = 5).

Input: N = 10
Output: 2
Explanation: The distinct prime triplets satisfying the condition are (2, 3, 5), (2, 5, 7).*/
package Assignment33;

import java.util.ArrayList;
import java.util.Scanner;

public class SumOfTwoPrimeIsThirdPrime {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter your number: ");
        int n = sc.nextInt();

        ArrayList<Integer> ob =new ArrayList<>();

        for(int i=2;i<n;i++){
            int count=0;
            for(int j=2;j<i;j++){
                if(i%j==0){
                    count++;
                }
            }
            if(count==0){
                ob.add(i);
            }
        }
        int c=0;
        for (int i = 0; i < ob.size(); i++) {
            for (int j = i+1; j < ob.size(); j++) {
                if(ob.contains(ob.get(i)+ob.get(j))){
                    c++;
                }
            }
        }
        System.out.print("OUTPUT: "+c);

    }
}
/**********************OUTPUT************************
 Enter your number: 6
 OUTPUT: 1
 *****************************************************/
