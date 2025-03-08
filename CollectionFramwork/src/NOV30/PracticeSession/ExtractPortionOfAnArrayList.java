package NOV30.PracticeSession;

import java.util.ArrayList;

public class ExtractPortionOfAnArrayList {
    public static void main(String[] args) {
        ArrayList<String> ob = new ArrayList<String>();
        ob.add("java");
        ob.add("is");
        ob.add("object");
        ob.add("oriented");
        ob.add("programming");
        ob.add("language");
        System.out.println("Original LL: "+ob);

        System.out.print("Extracted Portion: "+ ob.subList(1,4));
    }
}
