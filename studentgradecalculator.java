import java.util.Scanner;
public class studentgradecalculator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the number of subjects:");
        int numSubjects = scanner.nextInt();
        int totalMarks = 0;
        for (int i = 1; i <= numSubjects; i++) {
            System.out.println("Enter marks obtained in subject " + i + " (out of 100):");
            totalMarks += scanner.nextInt();
        }
        double averagePercentage = (double) totalMarks / numSubjects;
        System.out.println("Total Marks: " + totalMarks);
        System.out.println("Average Percentage: " + averagePercentage);
        System.out.println("Grade: " + calculateGrade(averagePercentage));
    }

    private static String calculateGrade(double averagePercentage) {
        if (averagePercentage >= 90) {
            return "A";
        } else if (averagePercentage >= 80) {
            return "B";
        } else if (averagePercentage >= 70) {
            return "C";
        } else if (averagePercentage >= 60) {
            return "D";
        } else {
            return "F";
        }

    }
}
