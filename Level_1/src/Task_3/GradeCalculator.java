package Task_3;

import java.util.Scanner;

public class GradeCalculator {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		String[] subject = { "Java Programming", "Data Structure and Algorithms", "C programming", "Python programming",
				"Spring Boot", "HTML", "SQL" };
		double totalMarks = 0;
		int numberOfSubject = subject.length;

		double[] marks = new double[numberOfSubject];

		for (int i = 0; i < numberOfSubject; i++) {
			System.out.println("Enter the mark of subject " + subject[i] + ":");
			double mark = scanner.nextDouble();

			if (mark < 0 || mark > 100) {
				System.out.println("Pagal hai kya");
				i--;
				scanner.nextLine();
				System.out.println("Number 100 ya 100 se kam hone chahiye ");
				continue;
			}
			marks[i] = mark;
			totalMarks += mark;
		}

		// Average
		double average = totalMarks / numberOfSubject;
		// Percentage
		double percentage = totalMarks / (numberOfSubject * 100) * 100;

		System.out.println("Subject \t\t\tMarks");
		for (int i = 0; i < numberOfSubject; i++) {
			System.out.println(subject[i] + "\t\t" + marks[i]);
		}

		System.out.println("\nTotal Marks: " + totalMarks);
		System.out.println("\nAverage: " + average);
		System.out.println("\nPercentage: " + percentage);

		// Determine Grade
		String grade;
		if (percentage >= 90) {
			grade = "Itna mat padh bhai ";
		} else if (percentage >= 80) {
			grade = "Topper ki copy mein jhaanka tha";
		} else if (percentage >= 70) {
			grade = "Sare Quection kar ke aaya tha ";
		} else if (percentage >= 60) {
			grade = "Theek thaak";
		} else if (percentage >= 45) {
			grade = "Bacch Gaya ";
		} else if (percentage >= 33) {
			grade = "Bass pass hona tha ";
		} else {
			grade = "Khatam tata good bye";
		}
		System.out.println("Grade is: " + grade);
	}
}
