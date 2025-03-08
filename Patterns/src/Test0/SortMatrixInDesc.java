package Test0;

public class SortMatrixInDesc {
    public static void main(String[] args) {
        int a[][]={{1,2,3},{4,5,6},{7,8,9}};
        int b[] = new int [a.length*a.length];
        int x=0;
        for(int i=0;i<a.length;i++){
            for(int j=0;j<a[i].length;j++){
                b[x]=a[i][j];
                x++;
            }
        }
       for(int i=0;i<b.length;i++){
           for(int j=i+1;j<b.length;j++){
               if(b[i]<b[j]){
                   int temp = b[i];
                   b[i]=b[j];
                   b[j]=temp;
               }
           }
       }
       int y=0;
        for(int i=0;i<a.length;i++){
            for(int j=0;j<a[i].length;j++){
                a[i][j]=b[y];
                y++;
            }
        }
        for(int i=0;i<a.length;i++){
            for(int j=0;j<a[i].length;j++){
                System.out.print(a[i][j]+" ");
            }
            System.out.println();
        }

    }
}
