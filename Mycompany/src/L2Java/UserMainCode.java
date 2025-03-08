package L2Java;



import java.util.*;


class UserMainCode {
    public static int[] meanMedian(int input1, int[] input2) {

        if (input1 <= 1) {
            return input2;
        }

        Arrays.sort(input2);

        int n = input2.length;
        double maxD = Double.NEGATIVE_INFINITY;
        List<Integer> best = new ArrayList<>();

        int totalSubsets = (1 << n);

        for (int sub = 1; sub < totalSubsets; sub++) {
            List<Integer> currentSubset = new ArrayList<>();

            for (int i = 0; i < n; i++) {
                if ((sub & (1 << i)) != 0) {
                    currentSubset.add(input2[i]);
                }
            }

            if (!currentSubset.isEmpty()) {

                double mean = calculateMean(currentSubset);
                double median = calculateMedian(currentSubset);

                double difference = mean - median;

                if (difference > maxD) {
                    maxD = difference;
                    best = new ArrayList<>(currentSubset);
                }
            }
        }


        int[] result = new int[best.size()];
        for (int i = 0; i < best.size(); i++) {
            result[i] = best.get(i);
        }

        return result;
    }


    private static double calculateMean(List<Integer> subset) {
        int sum = 0;
        for (int num : subset) {
            sum += num;
        }
        return (double) sum / subset.size();
    }

    private static double calculateMedian(List<Integer> subset) {
        int size = subset.size();
        Collections.sort(subset);

        if (size % 2 == 1) {
            // Odd number of elements
            return subset.get(size / 2);
        } else {
            // Even number of elements
            int mid1 = subset.get((size / 2) - 1);
            int mid2 = subset.get(size / 2);
            return (mid1 + mid2) / 2.0;
        }
    }

}




//
//import java.util.*;
//
//class UserMainCode {
//    public static int[] meanMedian(int input1, int[] input2) {
//        // Edge case if the input is empty or contains only one element
//        if (input1 <= 1) {
//            return input2;
//        }
//
//        // Sorting the input array to simplify median calculation
//        Arrays.sort(input2);
//
//        // Initialize variables to track the best subset
//        double maxDiff = Double.NEGATIVE_INFINITY;
//        int[] bestSubset = new int[0];
//
//        // Try every subset by considering different ranges in the sorted array
//        for (int i = 0; i < input2.length; i++) {
//            for (int j = i; j < input2.length; j++) {
//                int[] subset = Arrays.copyOfRange(input2, i, j + 1);
//                double mean = calculateMean(subset);
//                double median = calculateMedian(subset);
//                double diff = mean - median;
//
//                // Update the best subset if the current subset has a higher diff
//                if (diff > maxDiff) {
//                    maxDiff = diff;
//                    bestSubset = subset;
//                }
//            }
//        }
//
//        // Return the subset that maximized the mean - median difference
//        return bestSubset;
//    }
//
//    // Function to calculate the mean of an array
//    private static double calculateMean(int[] subset) {
//        double sum = 0;
//        for (int num : subset) {
//            sum += num;
//        }
//        return sum / subset.length;
//    }
//
//    // Function to calculate the median of an array
//    private static double calculateMedian(int[] subset) {
//        int n = subset.length;
//        if (n % 2 == 1) {
//            return subset[n / 2];
//        } else {
//            return (subset[n / 2 - 1] + subset[n / 2]) / 2.0;
//        }
//    }
//
//    public static void main(String[] args) {
//        int[] a = {1,2,3,4};
//        System.out.println(Arrays.toString(meanMedian(4, a)));
//    }
//}
//
//public static void main(String[] args) {
//    int[] a = {1,2,2,3, 3};
//    System.out.println(Arrays.toString(meanMedian(5, a)));
//}