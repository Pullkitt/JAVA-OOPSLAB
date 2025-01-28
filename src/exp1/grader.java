package exp1;

import java.util.Scanner;

public class grader {


	    public static void main(String[] args) {
	        Scanner s = new Scanner(System.in);

	     
	        System.out.print("Enter marks for Subject 1: ");
	        int subject1 = s.nextInt();
	        System.out.print("Enter marks for Subject 2: ");
	        int subject2 = s.nextInt();
	        System.out.print("Enter marks for Subject 3: ");
	        int subject3 = s.nextInt();

	        char grade = calcGrade(subject1, subject2, subject3);

	     
	        System.out.println("The final grade is: " + grade);

	    
	    }

	    public static char calcGrade(int marks1, int marks2, int marks3) {
	        
	        int average = (marks1 + marks2 + marks3) / 3;

	        // Determine the grade based on the average
	        if (average >= 90) {
	            return 'A';
	        } else if (average >= 75) {
	            return 'B';
	        } else if (average >= 50) {
	            return 'C';
	        } else {
	            return 'F';
	        }
	    }
	}
