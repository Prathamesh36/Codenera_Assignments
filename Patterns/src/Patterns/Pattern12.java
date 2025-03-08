package Patterns;

public class Pattern12 {
    public static void main(String[] args){
        int n =5;
        int i=1;
        int f=1;
        do{
            int j=1;
            do {
                if(i==1|| j==1 || i==n || j==n || (i%2!=0 && j%2!=0)){
                    System.out.print("*");
                }
                else{
                    System.out.print(f);
                    f++;
                }
                j++;
            }while (j<=n);
            System.out.println();
            i++;
        }while (i<=n);

    }
}
