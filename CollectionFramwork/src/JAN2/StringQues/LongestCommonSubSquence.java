/*2. Write a Java program that accepts two strings as input and finds the longest common subsequence using
 the StringBuffer class. The longest common subsequence is the longest sequence of characters that appears
 in the same order in both strings. For example, if the input strings are "ABCDGH" and "AEDFHR", the output
 should be "ADH".
*/
package JAN2.StringQues;

public class LongestCommonSubSquence {
    public static void main(String[] args) {
        String a ="ABCDGH";
        String b ="AEDFHR";
        StringBuffer sb = new StringBuffer();
        for (int i = 0; i < a.length(); i++) {
            if(b.contains(String.valueOf(a.charAt(i))) && !sb.toString().contains(a)){
                sb.append(a.charAt(i));
            }
        }
        System.out.println("OUTPUT: "+sb);

    }
}
