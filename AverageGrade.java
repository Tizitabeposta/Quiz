package com.classquiz.submit;
import java.util.Scanner;
public class AverageGrade {

	public static void main(String[] args) {

	Scanner input = new Scanner(System.in);
	System.out.print("How many subjects do you have?");
	
	int totalSub = input.nextInt();
	
	int[] scores = new int [totalSub];
	
	for (int i = 0; i < totalSub; i++)
	{ System.out.printf("Enter score for subject %d", i +1);
	scores[i]= input.nextInt ();
	
	}
	int totalScore = 0;
	for (int Score : scores) {
		totalScore += Score;
	}
	double averageGrade = (double) totalScore / totalSub;

System.out.printf ("Average Grade = %.2f%n", averageGrade);

}
}
