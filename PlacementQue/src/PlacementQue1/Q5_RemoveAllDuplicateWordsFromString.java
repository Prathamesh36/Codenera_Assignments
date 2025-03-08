package PlacementQue1;


public class Q5_RemoveAllDuplicateWordsFromString {
    public static void main(String[] args) {
        String s = "Geeks for Geeks";
        System.out.println("String: "+s);
        StringBuilder sb = new StringBuilder();
        for (String a:s.split(" ")){
            if(!sb.toString().contains(a)){
                sb.append(a);
                sb.append(" ");
            }
        }
        System.out.println("OUTPUT: "+sb.toString().trim());


    }
}
