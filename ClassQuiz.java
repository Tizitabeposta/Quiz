package com.classquiz.submit;
import java.util.Scanner;
public class ClassQuiz {

	public static void main(String[] args) {
int rows, colum, i, j;
Scanner in = new Scanner(System.in);

System.out.println("How many rows are there?");
rows = in.nextInt();
System.out.println("How many columns are there?");
colum = in.nextInt();

int A[][] = new int[rows][colum];
int B[][] = new int[rows][colum];
int res[][] = new int[rows][colum];

System.out.println("Enter the elements of A");

for (i= 0; i < rows; i++) {
	for (j = 0; j < colum; j++ )
		A[i][j] = in.nextInt();
	System.out.println();
}
System.out.println("Enter the elements of B");

for (i= 0; i < rows; i++) {
	for (j = 0; j < colum; j++ )
		B[i][j] = in.nextInt();
	System.out.println();
}
for (i = 0; i < rows; i++)
	for (j = 0; j < colum; j++)
		res[i][j] = A[i][j] + B [i][j];

	
	
	System.out.println("Enter the elements of Sum of matrices");	
for (i = 0; i< rows; i++)
	for(j = 0; j < colum; j++)
		System.out.print(res[i][j] + "\t");
System.out.println();
}}
