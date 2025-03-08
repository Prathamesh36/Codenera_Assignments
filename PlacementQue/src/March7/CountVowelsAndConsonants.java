package March7;

public class CountVowelsAndConsonants {
    public static void main(String[] args) {
        String s1 = "statement";
        System.out.println("String: "+s1);
        int vowel=0;
        int conso=0;
        for (char ch : s1.toCharArray()){
            if(ch=='a' || ch=='e' || ch=='i' || ch=='o' ||  ch=='u' ||
            ch=='A' || ch=='E' || ch=='I' || ch=='O' ||  ch=='U'){
                vowel++;
            }
            else{
                conso++;
            }
        }
        System.out.println("Number of Vowels: "+vowel);
        System.out.println("Number of Consonants: "+conso);
    }
}
