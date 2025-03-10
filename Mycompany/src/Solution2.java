import java.util.Scanner;

/*John has recently discovered an online game. In the game, a 15-minute round starts in each quarter-hour period, starting at times notated in the format HH:08, нн: 15, HH:30 огr HH: 45, where HH is a number from 80 to 23. John uses a 24-hour clock, so the earliest time is 08:00 and the latest is 23:59.

John starts playing at time A and ends at time B. If B is earlier than A, John has played overnight (from time A to midnight and from midnight to time B). What is the maximum number of full rounds that can be played by

John?

Write a function:

class Solution { public int solution(String A. String B); }

that, given two strings A and B (in HH:MM format), representing the start time and end time, returns an integer denoting the maximum number of full rounds that John can play within the given period of time.

Examples:
1. Given A = "12:01" and B = "12:44", the function should return 1. John can play only one round (from 12:15 to 12:30). He starts too late to play the round from 12:00 to 12:15 and he will not be able to finish the 12:30-12:45 round.

2. Given A = "20:00" and B = "06:00", the function should return 40. John can play 16 game rounds from 20:00 to 20:00 and 24 game rounds from 00:00 to 06:00.

3. Given A = "00:00" and B = "23:59", the function should return 95. John can play four rounds every hour except for the last hour, in which he can play only three rounds (23:00-23:15, 23:15-23:30, 23:30-23:45). The next round would be 23:45-00:00 but John has to end 1 minute sooner, so he cannot take part in it.

4. Given A = "12:03" and B = "12:03", the function should return 0. John cannot play any round during an empty period of time.

Assume that:

strings A and B represent valid times in a HH:MM format.

In your solution, focus on correctness. The performance of your solution.
*/
class Solution2 {
    public static int solution2(String A, String B) {
        int startMinutes = toMinutes(A);
        int endMinutes = toMinutes(B);

        // If B is earlier than A, it means the time period is overnight
        if (endMinutes < startMinutes) {
            endMinutes += 24 * 60;  // Add 24 hours worth of minutes to endMinutes
        }

        // Calculate the first full round start time after or equal to startMinutes
        int nextRoundStart = getNextRoundStart(startMinutes);

        // Calculate the last full round end time before or equal to endMinutes
        int lastRoundEnd = getLastRoundEnd(endMinutes);

        // Calculate the number of full rounds
        if (nextRoundStart > lastRoundEnd) {
            return 0;
        } else {
            return (lastRoundEnd - nextRoundStart) / 15 ;
        }
    }

    private static int toMinutes(String time) {
        String[] parts = time.split(":");
        int hours = Integer.parseInt(parts[0]);
        int minutes = Integer.parseInt(parts[1]);
        return hours * 60 + minutes;
    }

    private static int getNextRoundStart(int startMinutes) {
        int remainder = startMinutes % 15;
        if (remainder == 0) {
            return startMinutes;
        } else {
            return startMinutes + (15 - remainder);
        }
    }

    private static int getLastRoundEnd(int endMinutes) {
        return endMinutes - (endMinutes % 15);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter your String1: ");
        String str = sc.next();
        System.out.print("Enter your String2: ");
        String str1 = sc.next();

        System.out.print("Output: "+solution2(str, str1));
    }
}
