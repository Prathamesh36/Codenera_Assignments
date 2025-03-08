package OCT18.TejasSir2;



public class other

{

    public int[][] max(int a[][])
    {
        System.out.println("transpose matrix is :");
        for(int i=0;i<a.length;i++)
        {
            for(int j=0;j<a.length;j++)
            {
                System.out.println(a[j][i]);
            }
        }

        return a;

    }
    public static void main(String[] args)
    {
        other ob=new other();

        int a[][]= {{1,2,3},{4,5,6},{7,8,9}};

        System.out.println("array element is :");

        for(int i=0;i<a.length;i++)
        {
            for(int j=0;j<a.length;j++)
            {
                System.out.println(a[i][j]);
            }
        }
        int b[][]= ob.max(a);

    }

}
