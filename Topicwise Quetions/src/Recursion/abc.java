package Recursion;

public class abc {

    public static  void loginNof(int number,String userId,String password){
        int c=0;
        if(userId.charAt(userId.length()-1)==password.charAt(password.length()-1)){
            c++;

        }
        if(c!=0){
            System.out.println("UserId or password is not valid, pls try again.");
        }
        else {
            if (number == 1) {
                System.out.println("Welcome "+userId+" and the generated token is: token-1.");
            } else if (number == 2) {
                System.out.println("Welcome "+userId+" and the generated token is: token-11.");
            } else if (number == 3) {
                System.out.println("Welcome "+userId+" and the generated token is: token-101.");
            }
        }

    }

    public static void main(String[] args) {
        loginNof(3,"user1","pass1");
    }
}
