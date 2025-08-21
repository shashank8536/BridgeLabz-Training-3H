import java.util.*;

public class StudentGrades {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter number of students: ");
        int n = sc.nextInt();

        int[] physics = new int[n];
        int[] chemistry = new int[n];
        int[] maths = new int[n];
        double[] percentage = new double[n];
        char[] grade = new char[n];

        for (int i = 0; i < n; i++) {
            System.out.println("Enter marks for Student " + (i + 1));

            System.out.print("Physics: ");
            physics[i] = sc.nextInt();
            if (physics[i] < 0) { i--; continue; }

            System.out.print("Chemistry: ");
            chemistry[i] = sc.nextInt();
            if (chemistry[i] < 0) { i--; continue; }

            System.out.print("Maths: ");
            maths[i] = sc.nextInt();
            if (maths[i] < 0) { i--; continue; }

            int total = physics[i] + chemistry[i] + maths[i];
            percentage[i] = total / 3.0;

            // Grade rules
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
            System.out.println("Student " + (i + 1) + "| Physics: " + physics[i] +" | Chemistry: " + chemistry[i] +" | Maths: " + maths[i] +" | %: " + String.format("%.2f", percentage[i]) +" | Grade: " + grade[i]);
        }
    }
}
