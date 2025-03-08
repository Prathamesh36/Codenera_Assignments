/*Q11.Find the Missing Number

Input: arr[] = {1, 2, 4, 6, 3, 7, 8}, N = 8
Output: 5
Explanation: The missing number between 1 to 8 is 5*/
package Test0;
public class findMissingNumber {

    public int missingNo(int a[]){
        int max=0;
        for(int i=0;i<a.length;i++)
        {
            if(a[i]>max){
                max= a[i];
            }
        }

        int total_sum =0;
        for(int i=1;i<=max;i++)
        {
            total_sum+=i;
        }

        int elm_sum=0;
        for(int i=0;i<a.length;i++)
        {
            elm_sum+=a[i];
        }
        int miss = total_sum-elm_sum;
        return miss;
    }

    public static void main(String[] args) {
        findMissingNumber ob = new findMissingNumber();

        int a[] ={1, 2, 4, 6, 3, 7, 8};

        System.out.print("Missing Number is: "+ob.missingNo(a));
    }
}
/**************************OUTPUT****************************
 Missing Number is: 5
 **********************************************************/