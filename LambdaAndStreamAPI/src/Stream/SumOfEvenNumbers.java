package Stream;

import java.util.Arrays;
import java.util.stream.IntStream;

public class SumOfEvenNumbers {
    public static void main(String[] args) {
        int[] arr = {1,2,3,4,5,6,7,8,9};
        int sum=0;
        // using normal method
        for(int i=0;i<arr.length;i++){
            if(arr[i] % 2 ==0){
                sum += arr[i];
            }
        }
        System.out.println(sum);

        //using stream
        int[] arr2={1,2,3,4,5,6,7,8,9};;
        int sum2 = Arrays.stream(arr2).filter(n -> n % 2 == 0).sum();
        System.out.println(sum2);
    }
}
