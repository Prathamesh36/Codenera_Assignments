package Jun25;

import java.util.Scanner;

public class StudentScore {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        float score = 0;
        float totalScore=0;
        int count=0;
        while(true){
            System.out.print("Enter Student score (negative number to end) : ");
            score = sc.nextInt();
            if (score<0) break;
            totalScore+=score;
            count++;
            if(score>60) System.out.println("Score: "+score+", Result: Pass");
            else System.out.println("Score: "+score+", Result: Fail");
        }
        float average = totalScore/count;
        System.out.println("\nAverage Score is: "+average+"%");

    }
}