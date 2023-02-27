package day09_Scanner;

import java.util.Scanner;

public class SalaryCalculator {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.println("Please enter your hourly rate:");
        int hourlyRate = input.nextInt();

        System.out.println("Please enter your hours per week:");
        int weeklyHours = input.nextInt();

        System.out.println("Please enter your state tax (in percentage):");
        int stateTaxRate = input.nextInt();

        System.out.println("Please enter the federal tax rate (in percentage):");
        int federalTaxRate = input.nextInt();


        double salaryBeforeTax = hourlyRate * weeklyHours * 52;

        double stateTax = salaryBeforeTax * stateTaxRate / 100;

        double federalTax = salaryBeforeTax * federalTaxRate / 100;

        double totalTax = stateTax + federalTax;

        double salaryAfterTax = salaryBeforeTax - totalTax;

        System.out.println("Salary = $" + salaryBeforeTax);
        System.out.println("State Tax = $" + stateTax);
        System.out.println("Federal Tax = $" + federalTax);
        System.out.println("totalTax = $" + totalTax);
        System.out.println("Net Income = $" + salaryAfterTax);
    }
}
/*
10. Create a class named SalaryCalculator:
		- Ask the user to enter his/her hourlyRate
        - Ask the user how many hours he/she works in a week
        - Ask the user to enter state tax (in percentage)
        - Ask the user to enter federal tax (in percentage)

         -Calculate the:
                    3.4.1 salary
                    3.4.2 sateTax
                    3.4.3 federalTax
                    3.4.4 totalTax
                    3.4.5 netIncome
 */