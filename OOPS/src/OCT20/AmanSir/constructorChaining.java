package OCT20.AmanSir;

public class constructorChaining {

    constructorChaining(int a){
        this();
        System.out.println(a);
    }
    constructorChaining(String s){
        this(4);
        System.out.println(s);
    }
    constructorChaining(int a,int b){
        this("Amit");
        System.out.println("Addistion is: "+(a+b));
    }
    constructorChaining(){

        System.out.println("Hello");
    }




    public static void main(String[] args) {
        int a=14;
        int b=6;
        constructorChaining ob = new constructorChaining(a,b);

    }
}
