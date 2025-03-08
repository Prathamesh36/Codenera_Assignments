import java.util.Arrays;
import java.util.Comparator;

public class Sort2DArray {
    public static void main(String[] args) {
        //comparing 2D array on the basis of first element
        int[][] a = {
                {3,5,7},
                {7,2,1},
                {4,6,2}
        };

        /*
        Arrays.sort(a, new Comparator<int[]>() {
            @Override
            public int compare(int[] arr1, int[] arr2) {
               return arr1[0] - arr2[0];
            }
        });
        */
        //Another way of sorting, using lambda exp.(and using anonymous function)
        Arrays.sort(a,(arr1, arr2) -> {
            return arr1[0] - arr2[0];
        });

        //Another way of sorting, using lambda exp.
        //Arrays.sort(a, Comparator.comparingInt(arr -> arr[0]));


        for(int[] e:a){
            for(int i: e){
                System.out.print(i+" ");
            }
            System.out.println();
        }

    }
}
