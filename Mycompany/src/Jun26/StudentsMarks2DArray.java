package Jun26;

import java.util.Scanner;

public class StudentsMarks2DArray {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter total number of classrooms: ");
        int totalClassrooms = sc.nextInt();

        System.out.print("Enter total number of students: ");
        int totalStudents = sc.nextInt();

        int[][] marks = new int[totalClassrooms][totalStudents];

        for (int i = 0; i < totalClassrooms; i++) {
            for (int j = 0; j < totalStudents; j++) {
                System.out.print("Enter the marks of student "+(j+1)+" of classroom "+(i+1)+": ");
                marks[i][j] = sc.nextInt();
            }
        }

        System.out.println("\nMarks: ");
        for (int i = 0; i < totalClassrooms; i++) {
            System.out.print("Classroom "+ (i+1) +": ");
            for (int j = 0; j <totalStudents ; j++) {
                System.out.print(marks[i][j]+" ");
            }
            System.out.println();
        }
    }
}
