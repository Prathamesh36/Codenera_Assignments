/*Q12. Rearrange a string
Example 1:
Input: S = "AC2BEW3"
Output: "ABCEW5"
Explanation: 2 + 3 = 5 and we print all
alphabets in the lexicographical order.*/
package DEC21;

public class ReaarangeString {
    public static void main(String[] args) {
        String s = "AC2BEW3";
        char[] a= s.toCharArray();
        String b ="";
        int sum=0;
        for (int i = 0; i < a.length; i++) {
            for (int j = i+1; j <a.length ; j++) {
                if(a[i]>a[j]){
                    char temp =a[i];
                    a[i]=a[j];
                    a[j]=temp;
                }
            }
        }
        for (int i = 0; i < a.length; i++) {
            if((int)a[i]>=65 && (int)a[i]<=128){
                b=b+a[i];
            }
            else {
                sum += ((int)a[i]-48);

            }
        }
        b+=sum;
        System.out.print("OUTPUT: "+b);

    }
}
