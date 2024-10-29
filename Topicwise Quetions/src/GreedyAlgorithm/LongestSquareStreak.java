package GreedyAlgorithm;

import java.util.Arrays;
import java.util.HashMap;

public class LongestSquareStreak {

    public static int longestSquareStreak(int[] nums) {
        Arrays.sort(nums);
        HashMap<Integer, Integer> map =  new HashMap<>();
        for(int i=nums.length-1; i>=0;i--){
            map.put(nums[i], map.getOrDefault(nums[i]*nums[i],0)+1);
        }
        int max=0;
        for(int val : map.values()){
            max = Math.max(max, val);
        }
        return max == 1 ? -1 : max;
    }

    public static void main(String[] args) {
        int[] arr = {4,3,6,16,8,2};
        System.out.println(longestSquareStreak(arr));
    }
}
