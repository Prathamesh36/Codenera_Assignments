import java.util.Arrays;
import java.util.List;

class Result {
    public static int get_steps(List<Integer> plants, int capacity) {
        // Write your code here
        int steps = 0;
        int currentWater = capacity;
        int position = -1;


        for(int i=0; i<plants.size(); i++){
            if (currentWater < plants.get(i)) {

                steps += (i - position) * 2;

                currentWater = capacity;

                position = -1;
            }
            steps += (i - position);

            currentWater -= plants.get(i);

            position = i;
        }

        return steps;
    }

    public static void main(String[] args) {
        List<Integer> plants = Arrays.asList(1, 1, 1, 4, 2, 3);
        int capacity = 4;

        int steps = Result.get_steps(plants, capacity);
        System.out.println(steps);  // Output should be 30
    }
}
