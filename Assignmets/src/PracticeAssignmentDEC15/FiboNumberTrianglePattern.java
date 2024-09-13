package PracticeAssignmentDEC15;

public class FiboNumberTrianglePattern {
    public static void main(String[] args) {
        int n =5;
        int n1 = 0;
        int n2= 1;
        int n3;
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <=i; j++) {

                if(i==1 & j==1){
                    System.out.print(n1+" ");
                }
                else if(i==2 && j==1){
                    System.out.print(n2+" ");
                }
                else{
                    n3 = n1+n2;
                    n1=n2;
                    n2=n3;
                    System.out.print(n3+" ");
                }

            }
            System.out.println();
        }
    }
}
