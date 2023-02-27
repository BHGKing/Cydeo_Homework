package day09_Scanner;

import java.util.Scanner;

public class GradeReport {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.println("Please Enter your grade. (Between 0 and 100)");

        int grade = input.nextInt();

         if (grade >= 0 && grade <= 100) {

                 if (grade <= 100 && grade >= 90) {
                     System.out.println("Your grade is an 'A'");
                 } else if (grade <= 89 && grade >= 80) {
                     System.out.println("Your grade is a 'B'");
                 } else if (grade <= 79 && grade >= 70) {
                     System.out.println("Your grade is a 'C'");
                 } else if (grade <= 69 && grade >= 60) {
                     System.out.println("Your grade is a 'D'");
                 } else {
                     System.out.println("Your grade is a 'F'");
                 }

         }else {
             System.out.println("Invalid Score");
         }
    }
}
/*
3. Create a class named GradeReport:
            2.1 Ask the user to enter the his/her score
            2.2 Print the grade of the student (A, B, C, D, F)
            2.3 If user enter invalid score (negative or more than 100) print invalid score

 */