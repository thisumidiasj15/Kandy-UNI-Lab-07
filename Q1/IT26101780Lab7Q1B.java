import java.util.Scanner;

public class IT26101780Lab7Q1B {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        
        // Loop for three students
        for (int i = 1; i <= 3; i++) {
            System.out.println("Student " + i);
            System.out.print("Enter marks: ");
            
            // Reading four marks from a single line
            double mark1 = input.nextDouble();
            double mark2 = input.nextDouble();
            double mark3 = input.nextDouble();
            double mark4 = input.nextDouble();
            
            // Calculate average
            double average = (mark1 + mark2 + mark3 + mark4) / 4.0;
            System.out.println("Average is : " + average);
            
            // Determine grade
            String grade = "";
            if (average >= 75 && average <= 100) {
                grade = "Distinction";
            } else if (average >= 50 && average < 75) {
                grade = "Credit";
            } else if (average >= 0 && average < 50) {
                grade = "Fail";
            } else {
                grade = "Invalid";
            }
            
            System.out.println("Overall Grade is : " + grade);
            System.out.println(); // Blank line between students
        }
        
        input.close();
    }
}
