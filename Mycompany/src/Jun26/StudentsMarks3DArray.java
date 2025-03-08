package Jun26;

import java.util.Arrays;
import java.util.Scanner;

public class StudentsMarks3DArray {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter total number of Schools: ");
        int totalSchools = sc.nextInt();

        System.out.print("Enter total number of classrooms: ");
        int totalClassrooms = sc.nextInt();

        System.out.print("Enter total number of students: ");
        int totalStudents = sc.nextInt();

        System.out.println();
        int[][][] marks = new int[totalSchools][totalClassrooms][totalStudents];

        for (int i = 0; i < marks.length; i++) {
            for (int j = 0; j < marks[i].length; j++) {
                System.out.println("School "+(i+1)+" classroom "+(j+1)+" info: ");
                for (int k = 0; k < marks[i][j].length; k++) {
                    System.out.print("Enter the marks of student "+(k+1)+": ");
                    marks[i][j][k] = sc.nextInt();
                }
                System.out.println();
            }
        }


        for (int i = 0; i < marks.length; i++) {
            for (int j = 0; j < marks[i].length; j++) {
                System.out.print("School "+(i+1)+" classroom "+(j+1)+" students marks: ");
                for (int k = 0; k < marks[i][j].length; k++) {
                    System.out.print(marks[i][j][k]+" ");
                }
                System.out.println();
            }

        }
    }
}

