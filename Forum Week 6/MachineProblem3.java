import java.util.Scanner;

public class MachineProblem3 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        
        int StudentNum;
        System.out.println("Enter the number of students : ");
        StudentNum = sc.nextInt();
        
        while (StudentNum < 1) {
            System.out.println("Number of Students should be more than 1: ");
            StudentNum = sc.nextInt();
        }

        int j = 0;
        double[] grades;
        grades = new double[StudentNum];
        double avg = 0;
        double min = grades[0] + 100;
        double max = grades[0];
        double total = 0;

        while (j < StudentNum) {
            System.out.printf("Enter the grade for student " + "(" + (j + 1) + ")" + ": ");
            int grade = sc.nextInt();

            if (grade >= 0 && grade <= 100) {
                grades[j] = grade;
                total = total + grade;
                j++;
            } else {
                System.out.println("Grade must be between 0 and 100");
            }
        }

        for (int i = 0; i < grades.length; i++) {
            avg += grades[i];
            if (grades[i] > max)
                max = grades[i];
            if (grades[i] < min)
                min = grades[i];
        }
        avg /= grades.length;

        System.out.printf("The Average is: %.2f\n", avg);
        System.out.println("The Minimum is: " + min);
        System.out.println("The Maximum is: " + max);
        sc.close();
    }
}
