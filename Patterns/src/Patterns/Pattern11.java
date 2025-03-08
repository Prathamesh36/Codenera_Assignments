package Patterns;

public class Pattern11 {
    public static void main(String[] args) {
        int n=5;
        int i=1;
        do{
            int j=i;
            do {
                System.out.print(" ");
                j++;
            }while (j<=n);


            int x=1;
            do {
                if(x==1) {
                    x++;
                    continue;
                }
                if(x==2) {
                    System.out.print("*");
                }
                else{
                    System.out.print(" ");
                }
                x++;
            }while (x<=i);



            int y=1;
            do {
                if(i==y) {
                    System.out.print("*");
                }
                else{
                    System.out.print(" ");
                }
                y++;
            }while (y<=i);
            System.out.println();
            i++;


        }while (i<n);

        int j=1;
        do{
            int x=1;
            do {
                System.out.print(" ");
                x++;
            }while (x<=j);



            int y=j;
            do {
                if(y==n){
                    y++;
                    continue;
                }
                if(y==j) {
                    System.out.print("*");
                }
                else{
                    System.out.print(" ");
                }
                y++;
            }while (y<=n);



            int z=j;
            do {
                if(z==n) {
                    System.out.print("*");
                }
                else{
                    System.out.print(" ");
                }
                z++;
            }while (z<=n);
            System.out.println();
            j++;


        }while (j<=n);


    }
}

/*public class Pattern11 {
    public static void main(String[] args) {
        int n=5;
        for(int i=1;i<n;i++){
            for(int j=i;j<=n;j++){
                System.out.print(" ");
            }
            for(int j=1;j<=i;j++){
                System.out.print("*");
            }

            for(int j=2;j<=i;j++){
                System.out.print("*");
            }
            System.out.println();
        }
        for(int i=1;i<=n;i++){
            for (int j = 1; j <=i ; j++) {
                System.out.print(" ");
            }
            for (int j = i; j <=n; j++) {
                System.out.print("*");
            }
            for (int j = i; j <n; j++) {
                System.out.print("*");
            }
            System.out.println();
        }

    }

}
*/