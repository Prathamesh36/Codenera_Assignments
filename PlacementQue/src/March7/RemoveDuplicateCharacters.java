package March7;

public class RemoveDuplicateCharacters {
    public static void main(String[] args) {
        String s1 = "statement";
        System.out.println("String: "+s1);
        StringBuilder ans = new StringBuilder();
        for (char ch : s1.toCharArray()){
            if(!ans.toString().contains(String.valueOf(ch))){
                ans.append(ch);
            }
        }
        System.out.println("After removing duplicate characters: "+ans);
    }
}
