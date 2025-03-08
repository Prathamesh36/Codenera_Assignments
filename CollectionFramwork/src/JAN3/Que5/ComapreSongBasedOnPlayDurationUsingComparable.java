package JAN3.Que5;

import java.util.ArrayList;
import java.util.Collections;

public class ComapreSongBasedOnPlayDurationUsingComparable {
    public static void main(String[] args) {
        ArrayList<Songs> ob = new ArrayList<>();
        ob.add(new Songs("abcdefghi",8));
        ob.add(new Songs("sdakafkn",4));
        ob.add(new Songs("gjdasjdsf",5));
        ob.add(new Songs("jnlkgjslf",3));
        Collections.sort(ob);
        System.out.println(ob);


    }
}
