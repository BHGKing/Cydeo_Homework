package day14_For_Loop;

import java.util.Scanner;

public class CharacterExtractor {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Enter a something: ");
        String word = input.nextLine();

        input.close();

        String letters = "";
        String digits = "";
        String specialChars = "";

        for (int i = 0; i < word.length(); i++) {

            char c = word.charAt(i);

            if ((c >= 'a' && c <= 'z') || (c >= 'A' && c <= 'Z')) {

                letters += c;

            } else if (c >= '0' && c <= '9') {

                digits += c;

            } else {

                specialChars += c;

            }
        }
        System.out.println("letters: " + letters);
        System.out.println("digits: " + digits);
        System.out.println("special chars: " + specialChars);
    }
}
/*
5. write a program that can retrieve the digits, letters and special characters from a string
            Ex:
                input:
                    mn@#123Ab!

                output:
                    letters: mnAb
                    digits: 123
                    special chars: @#!
 */