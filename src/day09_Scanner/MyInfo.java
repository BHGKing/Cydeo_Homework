package day09_Scanner;

import java.util.Scanner;

public class MyInfo {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.println("Enter your age:");
        int age = input.nextInt();
        input.nextLine();

        System.out.println("Enter your gender:");
        String gender = input.nextLine();

        System.out.println("Enter your full name:");
        String fullName = input.nextLine();

        System.out.println("Enter your phone number:");
        long phoneNumber = input.nextLong();
        input.nextLine();

        System.out.println("Enter your zip code:");
        int zipCode = input.nextInt();
        input.nextLine();

        System.out.println("Enter your school name:");
        String schoolName = input.nextLine();

        System.out.println("Enter your city name:");
        String cityName = input.nextLine();

        System.out.println("Enter your state name:");
        String stateName = input.next();
        input.nextLine();

        System.out.println("Enter your building number:");
        int buildingNumber = input.nextInt();
        input.nextLine();

        System.out.println("Enter your street name:");
        String streetName = input.nextLine();


        System.out.println("Full name: " + fullName);
        System.out.println("Age: " + age);
        System.out.println("Gender: " + gender);
        System.out.println("Phone Number: " + phoneNumber);
        System.out.println("address:");
        System.out.println("\t\t"+buildingNumber+ " " + streetName);
        System.out.println("\t\t"+cityName+ ", " + stateName + " " + zipCode);
        System.out.println();
        System.out.println("School Name: " + schoolName);


    }
}
