package March7;

public class StringIsSubSequenceOfAnotherString {
    public static void main(String[] args) {
        String s1 ="IAmFromPune";
        System.out.println("String 1: "+s1);
        String s2 ="From";
        System.out.println("String 2: "+s2);
        int k=0;
        int ans=0;
        int flag=0;
        for (int i=0;i<s1.length();i++){
            if(s1.charAt(i)==s2.charAt(k)){
                flag++;
                if(flag==s2.length()-1){
                    ans++;
                    break;
                }
                k++;
            }
            else{
                k=0;
                flag=0;
            }
        }
        if(ans>0){
            System.out.println(s2+": is subsequence of: "+s1);
        }
        else {
            System.out.println(s2+": is not subsequence of: "+s1);
        }
    }
}
