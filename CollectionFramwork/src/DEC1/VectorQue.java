package DEC1;

import java.util.Vector;

public class VectorQue {
    public static void main(String[] args) {
        Vector<String> ob = new Vector<String>();
        ob.add("All's Well That Ends Well" +
                ", " +
                "As You Like It" +
                ", " +
                "Comedy of Errors" +
                ", " +
                "Love's Labour's Lost" +
                ", " +
                "Measure for Measure" +
                ", " +
                "Merchant of Venice" +
                ", " +
                "Merry Wives of Windsor" +
                ", " +
                "Midsummer Night's Dream" +
                ", " +
                "Much Ado about Nothing" +
                ", " +
                "Taming of the Shrew" +
                ", " +
                "Tempest" +
                ", " +
                "Twelfth Night" +
                ", " +
                "Two Gentlemen of Verona" +
                ", " +
                "Winter's Tale");
        System.out.println(ob);

        System.out.println("Insert Macbeth at front: ");
        ob.insertElementAt("Macbeth",0);
        System.out.println(ob);

        System.out.println("Remove Tempest: ");
        ob.remove("Tempest");
        System.out.println(ob);

        System.out.println("swap last two elements: ");
        String temp = ob.lastElement();
        ob.remove(ob.lastElement());
        String temp1 = ob.lastElement();
        ob.remove(ob.lastElement());
        ob.add(temp1);
        ob.add(temp);
        System.out.println(ob);

        System.out.println("Create a new copy of the list by cloning: ");
        Object ob1=ob.clone();
        System.out.println(ob1);

        System.out.println("Remove and return the first element: ");
        ob.remove(ob.firstElement());
        System.out.println(ob);




    }
}
