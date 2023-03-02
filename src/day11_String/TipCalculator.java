package day11_String;

import java.util.Scanner;

public class TipCalculator {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.println("Split or No split (Yes or No)");
        String splitStr = input.nextLine().toLowerCase();
        boolean split = splitStr.equals("yes");

        System.out.println("Enter the number of people: ");
        int numPeople = input.nextInt();

        System.out.println("Enter the check amount: ");
        double checkAmount = input.nextDouble();

        input.nextLine(); // consume the newline character

        System.out.println("How was the service quality? (Excellent/Great/Good/Fair/Poor");
        String qualityStr = input.nextLine().toLowerCase();

        double tipPercent;

        switch (qualityStr){
            case "excellent":
                tipPercent = 0.25;
                break;
            case "great":
                tipPercent = 0.20;
                break;
            case "good":
                tipPercent = 0.15;
                break;
            case "fair":
                tipPercent = 0.10;
                break;
            case "poor":
                tipPercent = 0.05;
                break;
            default:
                System.out.println("Invalid Service quality. Using 15% as default");
                tipPercent = 0.15;
        }
        double totalTip = checkAmount * tipPercent;
        double totalAmount = checkAmount + totalTip;

        System.out.println("Number of people entered: " + numPeople);
        System.out.println("Total to pay: " + totalAmount);
        System.out.println("Total tip: " + totalTip);
        System.out.println("Total per person: " + (split ? totalAmount / numPeople : totalAmount));
        System.out.println("Tip per person: " + (split ? totalTip / numPeople : totalTip));

    }
}
/*
8. Create a class called TipCalculator, and write a program for a tip calculator.
    There will be different service quality benchmarks that will determine the tip given.
    There will also the ability to calculate based on the number of people in the party and if there is a split of the bill or not.

        Poor = 5%, Fair = 10%, Good = 15%, Great = 20%, Excellent = 25%

    The program should ask the user to enter:
            - Split or No split (Yes or No),
             - Enter the number of people (number)
             - Enter the check amount (number)
             - Service Quality (String)

    And then it should display:
             Number of people entered
             Total to pay
             Total tip
             Total per person
             Tip per person:

        Ex:
            Split or No split (Yes or No)?
            YeS
            Enter the number of people
            4
            Enter the check amount:
            476
            How was the service quality? (Excellent/Great/Good/Fair/Poor)
            ExCElLeNt

            output:
                Number of people entered: 4
                Total to pay: 595.0
                Total tip: 119.0
                Total per person: 148.75
                Tip per person: 29.75
 */