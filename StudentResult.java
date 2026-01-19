import java.util.*;

public class StudentResult {
    // Method to calculate percentage
    static double calculatePerentage(int totalMarks, int subjects) {
        return (double) totalMarks / subjects;
    }

    // Method to assign grade
    static char assignGrade(double percentage) {
        if (percentage >= 90)
            return 'A';
        else if (percentage >= 80)
            return 'B';
        else if (percentage >= 70)
            return 'C';
        else if (percentage >= 60)
            return 'P';
        else
            return 'F';
    }

    // Method to display grade description using switch
    static void gradeDescription(char grade) {
        switch (grade) {
            case 'A':
                System.out.println("Grade A: Excellent");
                break;

            case 'B':
                System.out.println("Grade B: Very Good");
                break;

            case 'C':
                System.out.println("Grade C: Good");
                break;

            case 'P':
                System.out.println("Grade P: Pass");
                break;

            case 'F':
                System.out.println("Grade F: Fail");
                break;

            default:
                System.out.println("Invalid Grade");
        }
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        while (true) {
            System.out.println("\nEnter student name (or EXIT to Stop):");
            String name = sc.nextLine();

            if (name.equalsIgnoreCase("EXIT")) {
                break;
            }

            int subjects = 3;
            int totalMarks = 0;

            for (int i = 1; i <= subjects; i++) {
                System.out.println("Enter marks for subject " + i + ": ");
                int marks = sc.nextInt();

                if (marks < 0 || marks > 100) {
                    System.out.println("Invalid marks. Enter between 0 and 100.");
                    i--;
                    continue;
                }
                totalMarks += marks;
            }

            sc.nextLine(); // clear buffer

            double percentage = calculatePerentage(totalMarks, subjects);
            char grade = assignGrade(percentage);

            System.out.println("\n----- Result Summary -----");
            System.out.println("Student Name : " + name);
            System.out.println("Total Marks : " + totalMarks);
            System.out.println("Percentage : " + percentage + "%");
            System.out.println("Grade    : " + grade);
            gradeDescription(grade);
            System.out.println("--------------------------");
        }

        System.out.println("\nProgram terminated successfully.");
    }
}