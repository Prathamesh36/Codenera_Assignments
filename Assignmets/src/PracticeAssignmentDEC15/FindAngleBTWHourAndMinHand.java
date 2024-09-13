/*2)find the angle between hour hand and minute hand in degrees
input->  9:30
output->The angle between hour hand and minute hand is 105 degrees.*/
package PracticeAssignmentDEC15;

import java.util.Scanner;

public class FindAngleBTWHourAndMinHand {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter hours: ");
        int h = sc.nextInt();
        System.out.print("Enter minutes: ");
        int m = sc.nextInt();
        int hour = (30*h) - (int)(0.5 * m);
        int min =m*6;
        int angle = Math.abs(hour-min);
        if(angle>180){
            angle=360-angle;
        }
        System.out.print("Angle between Hour and minute hand: "+angle+" degrees");

    }
}
