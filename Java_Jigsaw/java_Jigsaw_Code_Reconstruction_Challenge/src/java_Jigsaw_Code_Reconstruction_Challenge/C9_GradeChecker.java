package java_Jigsaw_Code_Reconstruction_Challenge;

import java.util.Scanner;

// Solve the following program to print the student Grade correctly.

public class C9_GradeChecker {

	public static void main(String[] args) {

		Scanner scanner = new Scanner(System.in);

		System.out.print("Enter your score: ");

		int score = scanner.nextInt();

		if (score < 90) {

			System.out.println("Your grade is A.");

		}

		else if (score > 80) {

			System.out.println("Your grade is B.");

		}

		else {

			System.out.println("Your grade is C.");

		}

	}

}

