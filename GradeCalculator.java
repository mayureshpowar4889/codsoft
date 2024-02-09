import java.util.Scanner;

public class GradeCalculator 
{

	public static void main(String[] args) 

	{
        	Scanner scanner = new Scanner(System.in);

        // Input: Take marks obtained in each subject
        
		System.out.println("Enter the number of subjects:");
        	int numOfSubjects = scanner.nextInt();
		int totalMarks = 0;

        // Calculate Total Marks and take marks for each subject
        	for (int i = 1; i <= numOfSubjects; i++) {
            	System.out.print("Enter marks for Subject " + i + " (out of 100): ");
            	int marks = scanner.nextInt();
            	totalMarks += marks;
        }

        // Calculate Average Percentage
        double averagePercentage = (double) totalMarks / numOfSubjects;

        // Grade Calculation
        char grade;
        if (averagePercentage >= 90) 
	{
            grade = 'A';
        } else if (averagePercentage >= 80) 

	{
            grade = 'B';
        } else if (averagePercentage >= 70) 

	{
            grade = 'C';
        } else if (averagePercentage >= 60) 

	{
            grade = 'D';
        } else 

	{
            grade = 'F';
        }

        // Display Results
        	System.out.println("\nResults:");
        	System.out.println("Total Marks: " + totalMarks);
        	System.out.println("Average Percentage: " + averagePercentage + "%");
        	System.out.println("Grade: " + grade);
		scanner.close();
    	}
}
