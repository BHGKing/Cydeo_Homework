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
