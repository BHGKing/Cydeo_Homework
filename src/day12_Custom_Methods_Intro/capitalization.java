package day12_Custom_Methods_Intro;

public class capitalization {
    public static void main(String[] args) {

        String firstName = "cyDeo";
        String lastName = "sCHooL";

        capitalization(firstName, lastName);

    }

    public static void capitalization(String firstName, String lastName){

        firstName = firstName.substring(0, 1).toUpperCase() + firstName.substring(1).toLowerCase();

        lastName = lastName.substring(0, 1).toUpperCase() + lastName.substring(1).toLowerCase();

        String fullName = firstName + " " + lastName;
        System.out.println("Full name: " + fullName);



    }

}
/*
2. Create a method named capitalization that can format the first and last names of the person and display the full name of the person
    Ex:
        capitalization("cyDeO", "sCHooL")

        output:
            full name: Cydeo School
 */