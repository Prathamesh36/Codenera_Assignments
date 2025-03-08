package Jun26;

import java.util.Scanner;

public class StudentsMarksJaggedArray {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter total number of classrooms: ");
        int totalClassrooms = sc.nextInt();

        int[][] marks = new int[totalClassrooms][];
        for (int i = 0; i < marks.length; i++) {
            System.out.print("Enter total number of students for classroom "+(i+1)+": ");
            marks[i] = new int[sc.nextInt()];
        }

        for (int i = 0; i < marks.length; i++) {
            for (int j = 0; j < marks[i].length; j++) {
                System.out.print("Enter the marks of student "+(j+1)+" of classroom "+(i+1)+": ");
                marks[i][j] = sc.nextInt();
            }
        }

        System.out.println("\nMarks: ");
        for (int i = 0; i < marks.length; i++) {
            System.out.print("Classroom "+ (i+1) +": ");
            for (int j = 0; j <marks[i].length ; j++) {
                System.out.print(marks[i][j]+" ");
            }
            System.out.println();
        }
    }
}
