package Jun26;

import java.util.Scanner;

public class StudentsMarks1DArray {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter total number of students: ");
        int totalStudents = sc.nextInt();
        int[] marks = new int[totalStudents];
        for (int i = 0; i <totalStudents; i++) {
            System.out.print("Enter the marks of student "+(i+1)+": ");
            marks[i]=sc.nextInt();
        }
        System.out.print("\nMarks: ");
        for (int i = 0; i < totalStudents; i++) {
            System.out.print(marks[i]+" ");
        }
    }
}
