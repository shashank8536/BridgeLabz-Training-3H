package ArrayProblems.ArrayLevelTwo;

import java.util.*;

public class StudentGrades2D {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter number of students: ");
        int n = sc.nextInt();

        int[][] marks = new int[n][3]; // physics, chemistry, maths
        double[] percentage = new double[n];
        char[] grade = new char[n];

        for (int i = 0; i < n; i++) {
            System.out.println("Enter marks for Student " + (i + 1));

            for (int j = 0; j < 3; j++) {
                do {
                    if (j == 0) {
                        System.out.print("Physics: ");
                    }
                    else if (j == 1) {
                        System.out.print("Chemistry: ");
                    }
                    else {
                        System.out.print("Maths: ");
                    }

                    marks[i][j] = sc.nextInt();
                } while (marks[i][j] < 0);
            }

            int total = marks[i][0] + marks[i][1] + marks[i][2];
            percentage[i] = total / 3.0;

            if (percentage[i] >= 90)
                grade[i] = 'A';
            else if (percentage[i] >= 75)
                grade[i] = 'B';
            else if (percentage[i] >= 60)
                grade[i] = 'C';
            else if (percentage[i] >= 40)
                grade[i] = 'D';
            else
                grade[i] = 'F';
        }

        System.out.println("\n--- Student Results ---");
        for (int i = 0; i < n; i++) {
            System.out.println("Student " + (i + 1) +
                    " | Physics: " + marks[i][0] +
                    " | Chemistry: " + marks[i][1] +
                    " | Maths: " + marks[i][2] +
                    " | %: " + String.format("%.2f", percentage[i]) +
                    " | Grade: " + grade[i]);
        }
    }
}

