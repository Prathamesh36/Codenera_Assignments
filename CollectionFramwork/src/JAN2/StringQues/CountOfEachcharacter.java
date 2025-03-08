/*3. Write a Java program that accepts a string as input and counts the number of occurrences of
each character using the StringBuffer class. The output should display each character along with its
count. For example, if the input string is "Hello World", the output should be:
*/
package JAN2.StringQues;

public class CountOfEachcharacter {
    public static void main(String[] args) {
        StringBuffer sb = new StringBuffer("Hello World");
        System.out.println("String: "+sb);
        char a[]=sb.toString().toCharArray();
        System.out.println("Char"+"\t"+"Count");
        for (int i = 0; i < a.length; i++) {
            int c=1;
            for (int j = i+1; j < a.length; j++) {
                if(a[i]==a[j]){
                    c++;
                    a[j]=' ';
                }
            }
            if(a[i]!=' '){
                System.out.println(a[i]+"\t\t"+c);
            }
        }


    }
}
