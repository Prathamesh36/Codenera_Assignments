/*6) Encrypt the string

Input: S = “aaaaaaaaaaa”
Output: ba

First convert the given string to “a11” i.e. write, character along with its frequency.
Then, change “a11” to “ab” because 11 is b in hexadecimal.
Then, finally reverse the string i.e “ba”.*/

package DEC6.AmanSir;


public class EncryptTheString1 {

    public static void main(String[] args) {
        String x = "aaaaaaaaaaa";
        System.out.println("Given String: "+x);
        char[] ch = x.toCharArray();

        int c=1;
        int count=0;
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < ch.length; i++) {
            c=1;
            for (int j = i+1; j <ch.length; j++) {
                if(ch[i]==ch[j]){
                    c++;
                    ch[j]=' ';
                }
            }
            if(ch[i]!=' ') {
                count=c;
            }
        }
        String z =Integer.toHexString(count);
        sb.append(ch[0]);
        sb.append(z);
        System.out.println("OUTPUT: "+sb.reverse());




    }

}
