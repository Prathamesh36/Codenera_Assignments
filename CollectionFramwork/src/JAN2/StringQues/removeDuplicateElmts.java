/*1.Write a Java program that accepts a string as input and removes all duplicate characters
using the StringBuffer class. For example, if the input string is "aabbccdd", the output should
be "abcd".
*/
package JAN2.StringQues;

public class removeDuplicateElmts {
    public static void main(String[] args) {
        String s ="aabbccdd";
        StringBuilder a = new StringBuilder();
        System.out.println("String: "+s);
        for (int i = 0; i < s.length(); i++) {
            if(!a.toString().contains(String.valueOf(s.charAt(i)))){
                a.append(s.charAt(i));
            }
        }
        System.out.print("OUTPUT: "+a);

    }
}
