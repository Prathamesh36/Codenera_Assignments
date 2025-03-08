/*wap to resevers the string but condition is that if charecter is in upper case then convert into lowercase ot if charecter is in lower case then convert in the uppercase
input
My NaME is tEjaS;
output
sAJeT SI emAn Ym*/
package NOV9.TejasSir;

public class ReverseString {
    public static void main(String[] args) {
        String s ="My NaME is tEjaS";
        String rev="";
        for (int i = s.length()-1; i >=0 ; i--) {
            char ch =s.charAt(i);
            if(Character.isUpperCase(ch)){
                ch=Character.toLowerCase(ch);
            }
            else{
                ch=Character.toUpperCase(ch);
            }
            rev=rev+ch;
        }
        System.out.println(rev);




    }
}
