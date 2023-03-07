package day12_Custom_Methods_Intro;

import java.util.Scanner;

public class emailDomain {

    public static void main(String[] args) {

        String email = "Cydeo@gmail.com";

        emailDomain(email);

    }

    public static void emailDomain(String email){

        String domain = email.substring(email.indexOf("@") + 1, email.indexOf("."));


        System.out.println("domain: " + domain);

    }

}

//    public static void main(String[] args) {
//        Scanner input = new Scanner(System.in);
//        System.out.println("Enter your email:");
//        String email = input.nextLine();
//
//        emailDomain(email);
//
//
//    }
//
//    public static void emailDomain(String email){
//
//        String domain = email.substring(email.indexOf("@") + 1, email.indexOf("."));
//
//        System.out.println(domain);
//
//    }
/*
1. Create a method named emailDomain that can display the domain of the email
    Ex:
        emailDomain("Cydeo@gmail.com")

        output:
            domain: gmail
 */